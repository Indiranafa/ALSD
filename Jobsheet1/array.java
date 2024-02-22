import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array
        String[] namaMatkul = {"Pancasila","Konsep Teknologi Informasi","Critical Thingking dan Problem Solving",
        "Matematika Dasar", "Bahasa Inggris","Dasar Pemrograman", "Praktikum Dasar Pemrograman", 
        "Keselamatan dan Kesehatan Kerja"};
        int sks[] = {2,2,2,3,2,2,3,2};
        int[] nilaiAngka = new int[8];
        double[] bobotNilai = new double[8];
        String[] nilaiHuruf = new String[8];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Input data nilai angka
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka " + namaMatkul[i] + ": ");
            nilaiAngka[i] = input.nextInt();
        }

        // Konversi nilai angka ke nilai huruf dan bobot
        for (int i = 0; i < nilaiAngka.length; i++) {
            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A-";
                bobotNilai[i] = 3.75;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B-";
                bobotNilai[i] = 2.75;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 55) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        // Hitung total SKS dan IPK
        double totalBobot = 0.0;
        for (int i = 0; i < nilaiAngka.length; i++) {
            totalBobot += bobotNilai[i] * sks[i];
        }
        double ipk = totalBobot / 18;

        // Tampilkan header tabel
        System.out.println("\n--- Hasil Menghitung IP Semester ---");
        System.out.println("-------------------------------------");
        System.out.printf("| %-40s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("-------------------------------------");

        // Tampilkan isi tabel
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("| %-40s | %-11s | %-11s | %-11s |\n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        // Tampilkan total SKS dan IPK
        System.out.println("-------------------------------------");
        System.out.printf("| IPK: %.2f \n", ipk);
        System.out.println("-------------------------------------");
    }
}
