import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa14[] mahasiswaArray = new Mahasiswa14[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.next();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.next();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();

            mahasiswaArray[i] = new Mahasiswa14(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            mahasiswaArray[i].tampilkanInfo();
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIPK = 0;
        for (int i = 0; i < mahasiswaArray.length; i++) {
            totalIPK += mahasiswaArray[i].getIPK();
        }
        double rataRataIPK = totalIPK / mahasiswaArray.length;

        // Menampilkan mahasiswa dengan IPK terbesar
        Mahasiswa14 mahasiswaTerbesar = mahasiswaArray[0];
        for (int i = 1; i < mahasiswaArray.length; i++) {
            if (mahasiswaArray[i].getIPK() > mahasiswaTerbesar.getIPK()) {
                mahasiswaTerbesar = mahasiswaArray[i];
            }
        }

        System.out.println("Rata-rata IPK : " + rataRataIPK);
        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        mahasiswaTerbesar.tampilkanInfo();
    }
}
