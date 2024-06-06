package Kuis2;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Queue14 antrian = new Queue14();
        Scanner sc14 = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian sekaligus Tambah Layanan");
            System.out.println("4. Laporan Layanan terdapat Total Pemasukan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc14.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = sc14.next();
                    System.out.print("Masukkan nomor HP: ");
                    String noHp = sc14.next();
                    Pelanggan14 pelanggan = new Pelanggan14(nama, noHp);
                    antrian.enqueue(pelanggan);
                    System.out.println("Pelanggan ditambahkan ke antrian.");
                    break;
                case 2:
                    System.out.println("Antrian saat ini:");
                    antrian.display();
                    break;
                    case 3:
                    if (antrian.front14 == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        Pelanggan14 pelangganDiDepan = antrian.front14.data14;
                        System.out.println("Antrian pertama dihapus untuk pelanggan: " + pelangganDiDepan.namaPelanggan14);
                        antrian.dequeue();
                
                        // Memperoleh data layanan
                        sc14.nextLine(); // Membersihkan buffer
                        System.out.println("Masukkan data layanan:");
                        System.out.print("Kode Layanan: ");
                        int kodeLayanan = sc14.nextInt();
                        sc14.nextLine(); // Membersihkan buffer
                        System.out.print("Nama Layanan: ");
                        String namaLayanan = sc14.nextLine();
                        System.out.print("Harga Layanan: ");
                        int hargaLayanan = sc14.nextInt();
                
                        Layanan14 layanan = new Layanan14(kodeLayanan, namaLayanan, hargaLayanan);
                        Pelanggan14 newPelanggan = new Pelanggan14(pelangganDiDepan.namaPelanggan14, pelangganDiDepan.noHp14);
                        newPelanggan.addLayanan(layanan);
                        antrian.enqueue(newPelanggan);
                
                        System.out.println("Layanan ditambahkan untuk pelanggan: " + newPelanggan.namaPelanggan14);
                    }
                    break;
                
                    case 4:
                    if (antrian.front14 == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Laporan Layanan dan Total Pemasukan:");
                        int totalPemasukan = 0;
                
                        Node14 current = antrian.front14;
                        while (current != null) {
                            Pelanggan14 pelanggan14 = current.data14;
                
                            // Cek apakah pelanggan memiliki layanan
                            if (!pelanggan14.layananList.isEmpty()) {
                                System.out.println("Pelanggan: " + pelanggan14.namaPelanggan14);
                                System.out.println("Layanan:");
                
                                for (Layanan14 layanan : pelanggan14.layananList) {
                                    System.out.println("- " + layanan.namaLayanan14 + " (Harga: " + layanan.harga14 + ")");
                                    totalPemasukan += layanan.harga14;
                                }
                            }
                
                            current = current.next14;
                        }
                
                        System.out.println("Total Pemasukan: " + totalPemasukan);
                    }
                    break;                                                
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
