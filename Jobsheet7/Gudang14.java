package Jobsheet7;

public class Gudang14 {
    Barang14[] tumpukan;
    int size;
    int top;

    Gudang14(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang14[size];
        top = -1;
    }    

    public boolean cekKosong() {
        return top == -1;
    }    

    public boolean cekPenuh() {
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }

    public void tambahBarang(Barang14 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        }else{
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang14 ambilBarang() {
        if (!cekKosong()) {
            Barang14 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang14 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang14 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }    

    public Barang14 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang14 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    
    public boolean cariBarang(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang dengan kode " + kode + " ditemukan: " + tumpukan[i].nama);
                    return true;
                }
            }
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
            return false;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return false;
        }
    }    

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");
            //for (int i = top; i >= 0; i--) {
            for (int i = 0; i <= top; i++) {
                System.out.println(String.format("Kode %d: %s (Kategori %s)", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori));
            }
        }else{
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi14 stack = new StackKonversi14();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
