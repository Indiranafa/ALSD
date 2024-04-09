package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new Pangkat(0, 0);
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai; // Assigns the entered value to the Pangkat object's 'nilai' attribute
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat; // Assigns the entered exponent value to the Pangkat object's 'pangkat' attribute
        }

        System.out.println("Pilih metode perhitungan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
