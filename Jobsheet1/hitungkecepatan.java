import java.util.Scanner;

public class hitungkecepatan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Hitung Kecepatan Jarak dan Waktu");
        System.out.println("========================================");
        //loop utama program
        while (true) {
            //list menu
            System.out.println("\n1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.print("Pilih rumus yang ingin dihitung: ");

            //baca pilihan pengguna
            int type = scanner.nextInt();

            //hitung hasil perhitungan berdasarkan pilihan pengguna
            double hasil = 0.0;
            switch (type) {
                case 1:
                    hasil = kecepatan(scanner);
                    break;
                case 2:
                    hasil = jarak(scanner);
                    break;
                case 3:
                    hasil = waktu(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            //apakah ingin melanjutkan perhitungan
            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String ulang = scanner.next();

            //jika tidak ingin melanjutkan, keluar dari loop
            if (!ulang.equalsIgnoreCase("ya")) {
                System.out.println("\n========================================");
                System.out.println("Terima kasih. Program selesai.");
                break;
            }
        }
        scanner.close();
    }

    public static double kecepatan(Scanner scanner) {
        //hitung kecepatan
        System.out.print("Masukkan jarak (meter): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan: " + kecepatan + " meter/detik");
        return kecepatan;
    }

    public static double jarak(Scanner scanner) {
        //hitung jarak
        System.out.print("Masukkan kecepatan (meter/detik): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak: " + jarak + " meter");
        return jarak;
    }

    public static double waktu(Scanner scanner) {
        //hitung waktu
        System.out.print("Masukkan kecepatan (meter/detik): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan jarak (meter): ");
        double jarak = scanner.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu: " + waktu + " detik");
        return waktu;
    }
}
