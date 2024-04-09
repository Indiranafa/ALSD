package Jobsheet6;

public class PencarianBuku14 {
    Buku14 listBk[] = new Buku14[2];
    int idx;

    void tambah(Buku14 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for (Buku14 m : listBk){
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j=0; j < listBk.length; j++){
            if(listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public Buku14 FindBuku(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return listBk[j]; // Mengembalikan buku jika ditemukan
            }
        }
        return null; // Mengembalikan null jika buku tidak ditemukan
    }
    
    public void Tampilposisi(String cari, int pos){
        if(pos!= -1 && pos < listBk.length){
            System.out.println("data: " + cari + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }
    public void TampilData(String cari, int pos){
        if(pos!= -1 && pos < listBk.length){
            System.out.println("Kode Buku \t: "+cari);
            System.out.println("Judul Buku \t: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: "+listBk[pos].pengarang);
            System.out.println("Stock \t\t: "+listBk[pos].stock);
        }else{
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }
    public int FindBinarySearch(String cari, int left, int right){
        int tengah;
        while (left <= right) {
            tengah = (left + right)/2;
            int hasilCasting = cari.compareTo(listBk[tengah].kodeBuku);
            if (hasilCasting == 0) {
            return tengah;
            } else if (hasilCasting < 0) {
            right = tengah - 1;
            } else {
            left = tengah + 1;
        } 
    }
        return -1;
    }
    void bubbleSort() {
        int n = listBk.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBk[j].kodeBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku14 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
}
