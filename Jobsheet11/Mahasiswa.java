package Jobsheet11;

public class Mahasiswa {
    int nim;
    String nama;
    Mahasiswa next;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
