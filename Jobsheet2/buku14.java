package Jobsheet2;

public class buku14 {

    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml){
        //stok -= jml;
        
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual. Sisa stok: " + stok);
        } else {
            System.out.println("Stok habis. Tidak dapat menjual buku.");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return (int) (0.12 * hargaTotal);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) (0.05 * hargaTotal);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int jmlBukuTerjual) {
        int totalHarga = hitungHargaTotal(jmlBukuTerjual);
        int diskon = hitungDiskon(totalHarga);
        return totalHarga - diskon;
    }

    public buku14() {

    }

    public buku14(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
