package Jobsheet6;

import java.util.Scanner;

public class BukuMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku14 data = new PencarianBuku14();
        int jmlBuku = 2;

        System.out.println("_______________________________________________________");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil: ");
        for(int i = 0; i < jmlBuku; i++){
            System.out.println("_______________________________________________________");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = sc1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = sc1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = sc1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = sc.nextInt();

            Buku14 m = new Buku14(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("_______________________________________________________");
        System.out.println("Data keseluruhan Mahasiswa: ");
        System.out.println("_______________________________________________________");
        System.out.println("Data keseluruhan Buku: ");
        System.out.println("_______________________________________________________");
        data.tampil();
        System.out.println("_______________________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku: ");
        String cari = sc1.nextLine();
        data.bubbleSort();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("=========================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jmlBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);


    }
}
