package Jobsheet11;
import java.util.Scanner;

public class SLLMhsMain {
    public static void main(String[] args) {
        // Membuat objek SingleLinkedListMhs
        SingleLinkedListMhs linkedList = new SingleLinkedListMhs();

        // Membuat objek QueueAntrian
        QueueAntrian antrian = new QueueAntrian();

        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah data mahasiswa yang ingin dimasukkan
        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Menangkap karakter newline

        // Loop untuk memasukkan data mahasiswa sejumlah yang diinginkan
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.print("NIM: ");
            int nim = scanner.nextInt();
            scanner.nextLine(); // Menangkap karakter newline

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            // Membuat objek Mahasiswa dari input pengguna
            Mahasiswa mahasiswaBaru = new Mahasiswa(nim, nama);

            // Menambahkan objek Mahasiswa ke linked list
            linkedList.addLast(mahasiswaBaru);

            // Menambahkan objek Mahasiswa ke antrian
            antrian.enqueue(mahasiswaBaru);
        }

        // Menampilkan isi linked list
        System.out.println("Isi Linked List:");
        linkedList.print();

        // Menampilkan isi antrian
        System.out.println("Isi Antrian:");
        antrian.print();

        // Meminta pengguna apakah ingin menghapus data
        System.out.print("Apakah Anda ingin menghapus data? (yes/no): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("yes")) {
            // Meminta pengguna untuk memasukkan NIM data yang ingin dihapus
            System.out.print("Masukkan NIM data yang ingin dihapus: ");
            int nimHapus = scanner.nextInt();
            scanner.nextLine(); // Menangkap karakter newline

            // Menghapus data dari linked list
            linkedList.delete(nimHapus);

            // Menghapus data dari antrian
            antrian.dequeueByNIM(nimHapus);

            // Menampilkan isi linked list setelah penghapusan
            System.out.println("Isi Linked List setelah penghapusan:");
            linkedList.print();

            // Menampilkan isi antrian setelah penghapusan
            System.out.println("Isi Antrian setelah penghapusan:");
            antrian.print();
        }

        // Menutup objek Scanner
        scanner.close();
    }
}



