package Jobsheet16;

public class Mahasiswa14 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa14(){
        
    }

    public Mahasiswa14(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
