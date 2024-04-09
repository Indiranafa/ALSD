package Kuis;

public class MainBarang14 {
    public static void main(String[] args) {
        // Membuat objek barang atau inputan data
        Barang14 barang1 = new Barang14("LCD Proyektor", 50000, 5);
        Barang14 barang2 = new Barang14("Sepeda", 10000, 10);

        // Menampilkan informasi barang
        System.out.println("Informasi Barang 1:");
        barang1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Barang 2:");
        barang2.tampilkanInfo();
        System.out.println();

        // Menghitung biaya sewa
        int jumlahHari = 3;
        System.out.println("Biaya sewa untuk " + jumlahHari + " hari:");
        System.out.println("Biaya sewa Barang 1: " + barang1.hitungBiayaSewa(jumlahHari));
        System.out.println("Biaya sewa Barang 2: " + barang2.hitungBiayaSewa(jumlahHari));
        System.out.println();

        // Mengecek ketersediaan stok
        int jumlahSewa = 7;
        System.out.println("Apakah stok Barang 1 mencukupi untuk disewa " + jumlahSewa + " unit?");
        System.out.println("Jawaban: " + barang1.cekStok(jumlahSewa));
        System.out.println();

        jumlahSewa = 3;
        System.out.println("Apakah stok Barang 2 mencukupi untuk disewa " + jumlahSewa + " unit?");
        System.out.println("Jawaban: " + barang2.cekStok(jumlahSewa));
    }
}
