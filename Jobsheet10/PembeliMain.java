package Jobsheet10;

import java.util.Scanner;

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pembeli.Queue antri = new Pembeli.Queue(5);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah pembeli");
            System.out.println("2. Hapus pembeli pertama");
            System.out.println("3. Tampilkan pembeli paling depan");
            System.out.println("4. Tampilkan pembeli paling belakang");
            System.out.println("5. Tampilkan posisi pembeli berdasarkan nama");
            System.out.println("6. Tampilkan daftar pembeli");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // untuk membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor HP pembeli: ");
                    int noHP = sc.nextInt();
                    antri.enqueue(new Pembeli(nama, noHP));
                    break;
                case 2:
                    int noHapus = antri.dequeue();
                    if (noHapus != -1)
                        System.out.println("Pembeli dengan nomor HP " + noHapus + " telah dihapus dari antrian.");
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                case 6:
                    antri.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (pilihan != 7);
        sc.close();
    }
}
