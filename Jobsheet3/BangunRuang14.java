import java.util.Scanner;

public class BangunRuang14 {

    // Class untuk Bangun Ruang Kerucut
    public static class Kerucut {
        double jariJari;
        double sisiMiring;

        public Kerucut(double jariJari, double sisiMiring) {
            this.jariJari = jariJari;
            this.sisiMiring = sisiMiring;
        }

        double hitungLuasPermukaan() {
            return Math.PI * jariJari * (jariJari + sisiMiring);
        }

        double hitungVolume() {
            return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
        }
    }

    // Class untuk Bangun Ruang Limas Segi Empat Sama Sisi
    public static class LimasSegiEmpat {
        double panjangSisiAlas;
        double tinggiLimas;

        public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
            this.panjangSisiAlas = panjangSisiAlas;
            this.tinggiLimas = tinggiLimas;
        }

        double hitungLuasPermukaan() {
            return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
        }

        double hitungVolume() {
            return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
        }
    }

    // Class untuk Bangun Ruang Bola
    public static class Bola {
        double jariJari;

        public Bola(double jariJari) {
            this.jariJari = jariJari;
        }

        double hitungLuasPermukaan() {
            return 4 * Math.PI * jariJari * jariJari;
        }

        double hitungVolume() {
            return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
        }
    }
}
