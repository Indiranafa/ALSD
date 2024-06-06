import java.util.Scanner;

public class MainVaksinasi {
    public static void main(String[] args) {
        QueueVaksinasi queue = new QueueVaksinasi();
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // membersihkan newline
                    System.out.print("Nama Penerima: ");
                    String name = scanner.nextLine();
                    queue.enqueue(number, name);
                    break;
                case 2:
                    queue.dequeue();
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++++++++");
                    queue.printQueue();
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++++++++");
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
