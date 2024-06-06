package Jobsheet16;

public class Nilai14 {
    Mahasiswa14 mahasiswa;
    MataKuliah14 mataKuliah;
    double nilai;

    public Nilai14(Mahasiswa14 mahasiswa, MataKuliah14 mataKuliah, double nilai){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString(){
        return "Nilai{" + "mahasiswa=" + mahasiswa + ", mataKuliah=" + mataKuliah + ", nilai=" + nilai + '}';
    }
}
