package Tugas;
import java.util.Scanner;
public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah: ");
        int jumlah = sc.nextInt();
        Pembeli antri = new Pembeli(jumlah);
        int pilih;
        do{
            Pembeli.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("noHP: ");
                    int noHP = sc.nextInt();
                    Pembeli n = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antri.Enqueue(n);
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6:
                    System.out.print("Nama pembeli: ");
                    String namaPembeli = sc.next();
                    int position = antri.peekPosition(namaPembeli);
                    if (position != -1) {
                        System.out.println("Posisi antrian " + namaPembeli + ": " + position);
                    } else {
                        System.out.println("Pembeli dengan nama " + namaPembeli + " tidak ditemukan dalam antrian.");
                    }
                    break;    
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);    
    }
}