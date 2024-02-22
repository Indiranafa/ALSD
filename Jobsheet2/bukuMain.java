package Jobsheet2;

public class bukuMain {

    public static void main(String[] args) {
        buku14 bk1 = new buku14();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku14 bk2 = new buku14("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku14 bk3 = new buku14("Algoritma dan Struktur Data", "Indira Nafa", 170, 30, 100000);
        bk3.terjual(3);
        bk3.tampilInformasi();
    }
}
