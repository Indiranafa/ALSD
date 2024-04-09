import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan bentuk bangun ruang
        BangunRuang14.Kerucut[] kerucuts;
        BangunRuang14.LimasSegiEmpat[] limasSegiEmpats;
        BangunRuang14.Bola[] bolas;

        // Dapatkan jumlah bentuk
        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = scanner.nextInt();

        // Inisialisasi array
        kerucuts = new BangunRuang14.Kerucut[jumlahBangunRuang];
        limasSegiEmpats = new BangunRuang14.LimasSegiEmpat[jumlahBangunRuang];
        bolas = new BangunRuang14.Bola[jumlahBangunRuang];

        // Loop untuk memasukkan setiap bentuk
        for (int i = 0; i < jumlahBangunRuang; i++) {
            // Masukkan data untuk Kerucut
            System.out.print("\nMasukkan data untuk Kerucut " + (i + 1) + ":\n");
            System.out.print("Masukkan jari-jari kerucut: ");
            double jariJariKerucut = scanner.nextDouble();
            System.out.print("Masukkan sisi miring kerucut: ");
            double sisiMiringKerucut = scanner.nextDouble();
            kerucuts[i] = new BangunRuang14.Kerucut(jariJariKerucut, sisiMiringKerucut);

            // Masukkan data untuk Limas Segi Empat Sama Sisi
            System.out.print("\nMasukkan data untuk Limas Segi Empat Sama Sisi " + (i + 1) + ":\n");
            System.out.print("Masukkan panjang sisi alas limas segi empat: ");
            double panjangSisiAlasLimas = scanner.nextDouble();
            System.out.print("Masukkan tinggi limas segi empat: ");
            double tinggiLimasSegiEmpat = scanner.nextDouble();
            limasSegiEmpats[i] = new BangunRuang14.LimasSegiEmpat(panjangSisiAlasLimas, tinggiLimasSegiEmpat);

            // Masukkan data untuk Bola
            System.out.print("\nMasukkan data untuk Bola " + (i + 1) + ":\n");
            System.out.print("Masukkan jari-jari bola: ");
            double jariJariBola = scanner.nextDouble();
            bolas[i] = new BangunRuang14.Bola(jariJariBola);
        }

        // Tampilkan hasil untuk setiap bentuk
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nHasil untuk Kerucut " + (i + 1) + ":");
            System.out.println("Luas Permukaan: " + kerucuts[i].hitungLuasPermukaan());
            System.out.println("Volume: " + kerucuts[i].hitungVolume());

            System.out.println("\nHasil untuk Limas Segi Empat Sama Sisi " + (i + 1) + ":");
            System.out.println("Luas Permukaan: " + limasSegiEmpats[i].hitungLuasPermukaan());
            System.out.println("Volume: " + limasSegiEmpats[i].hitungVolume());

            System.out.println("\nHasil untuk Bola " + (i + 1) + ":");
            System.out.println("Luas Permukaan: " + bolas[i].hitungLuasPermukaan());
            System.out.println("Volume: " + bolas[i].hitungVolume());
        }
    }
}
