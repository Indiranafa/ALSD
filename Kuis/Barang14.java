package Kuis;

public class Barang14 {
    // Atribut Barang
    String nama;
    int hargaSewa; // Harga sewa perhari
    int jumlahStok;

    // Konstruktor
    public Barang14(String nama, int hargaSewa, int jumlahStok) {
        this.nama = nama;
        this.hargaSewa = hargaSewa;
        this.jumlahStok = jumlahStok;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Sewa per Hari: " + hargaSewa);
        System.out.println("Jumlah Stok: " + jumlahStok);
    }

    // Method untuk menghitung biaya sewa total
    public int hitungBiayaSewa(int jumlahHari) {
        return hargaSewa * jumlahHari;
    }

    // Method untuk mengecek stok
    public String cekStok(int jumlahSewa) {
        if (jumlahSewa <= jumlahStok) {
            return "Ya, mencukupi";
        } else {
            return "Tidak, tidak mencukupi";
        }
    }
}
