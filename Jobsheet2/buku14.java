package Jobsheet2;

public class buku14 {

    String judul, pengarang;
    int halaman, stok, harga, diskon, hargaTotal, hargaBayar;
    
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("Harga Diskon: " + diskon);
        System.out.println("Harga Bayar: " + hargaBayar);
        
    }

    void terjual(int jml){
        //stok -= jml;
        
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual. Sisa stok: " + stok);
        } else {
            System.out.println("Stok habis. Tidak dapat menjual buku.");
        }

        hitungHargaTotal(jml);
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int jmlBukuTerjual) {
        hargaTotal = harga * jmlBukuTerjual;
        hitungDiskon();
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = (int) (0.12 * hargaTotal);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int) (0.05 * hargaTotal);
        }
        hitungHargaBayar();
    }

    void hitungHargaBayar() {
        hargaBayar = (int) (hargaTotal - diskon);
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
