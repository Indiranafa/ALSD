package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml]; // Menggunakan iJml untuk menentukan ukuran array fk
        for(int i = 0; i < iJml; i++){
            fk[i] = new Faktorial();
            System.out.println("masukkan nilai data ke-" + (i + 1) + ": ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // Menugaskan nilai yang dimasukkan ke dalam objek Faktorial
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i = 0; i < iJml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for(int i = 0; i < iJml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Divide Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
