package Jobsheet7;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang14 gudang = new Gudang14(kapasitas);

        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Tampilkan Barang di Gudang");
            System.out.println("5. Cek Gudang Kosong");
            System.out.println("6. Lihat Barang Terbawah");
            System.out.println("7. Cari Barang");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi (1-6): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = scanner.nextLine();
                    Barang14 barang = new Barang14(kode, nama, kategori);
                    gudang.tambahBarang(barang);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    if (gudang.cekKosong()) {
                        System.out.println("Gudang kosong.");
                    } else {
                        System.out.println("Gudang tidak kosong.");
                    }
                    break;
                case 6:
                    gudang.lihatBarangTerbawah();
                    break;
                case 7:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    int kodeCari = scanner.nextInt();
                    gudang.cariBarang(kodeCari);
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan 1-6.");
            }
        }
        scanner.close();
    }
}
