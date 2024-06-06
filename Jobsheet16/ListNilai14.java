package Jobsheet16;

import java.util.*;

public class ListNilai14 {
    List<Nilai14> daftarNilai = new ArrayList<>();
    List<Mahasiswa14> daftarMahasiswa;
    List<MataKuliah14> daftarMataKuliah;
    Queue<Mahasiswa14> queueMahasiswa = new LinkedList<>();

    public ListNilai14(List<Mahasiswa14> daftarMahasiswa, List<MataKuliah14> daftarMataKuliah) {
        this.daftarMahasiswa = daftarMahasiswa;
        this.daftarMataKuliah = daftarMataKuliah;
    }

    public void inputNilai(Scanner scanner) {
        System.out.print("Masukkan kode nilai: ");
        String kode = scanner.next();
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        System.out.println("DAFTAR MAHASISWA");
        for (Mahasiswa14 mhs : daftarMahasiswa) {
            System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.notelp);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = scanner.next();
        Mahasiswa14 mahasiswa = daftarMahasiswa.stream().filter(m -> m.nim.equals(nim)).findFirst().orElse(null);

        System.out.println("DAFTAR MATA KULIAH");
        for (MataKuliah14 mk : daftarMataKuliah) {
            System.out.println(mk.kode + " " + mk.nama + " " + mk.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String kodeMK = scanner.next();
        MataKuliah14 mataKuliah = daftarMataKuliah.stream().filter(mk -> mk.kode.equals(kodeMK)).findFirst().orElse(null);

        if (mahasiswa != null && mataKuliah != null) {
            Nilai14 nilaiObj = new Nilai14(mahasiswa, mataKuliah, nilai);
            daftarNilai.add(nilaiObj);
            System.out.println("Data nilai berhasil ditambahkan.");
        } else {
            System.out.println("Mahasiswa atau Mata Kuliah tidak ditemukan.");
        }
    }

    public void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        for (Nilai14 nilai : daftarNilai) {
            System.out.println(nilai.mahasiswa.nim + " " + nilai.mahasiswa.nama + " " + nilai.mataKuliah.nama);
        }
    }

    public void cariNilaiMahasiswa(Scanner scanner) {
        System.out.println("DAFTAR MAHASISWA");
        for (Mahasiswa14 mhs : daftarMahasiswa) {
            System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.notelp);
        }
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.next();
        System.out.println("DAFTAR NILAI MAHASISWA");
        for (Nilai14 nilai : daftarNilai) {
            if (nilai.mahasiswa.nim.equals(nim)) {
                System.out.println(nilai.mahasiswa.nim + " " + nilai.mahasiswa.nama + " " + nilai.mataKuliah.nama + " " + nilai.mataKuliah.sks + " " + nilai.nilai);
            }
        }
    }

    public void urutDataNilai() {
        daftarNilai.sort(Comparator.comparingDouble(n -> n.nilai));
        System.out.println("DAFTAR NILAI MAHASISWA");
        for (Nilai14 nilai : daftarNilai) {
            System.out.println(nilai.mahasiswa.nim + " " + nilai.mahasiswa.nama + " " + nilai.mataKuliah.nama + " " + nilai.mataKuliah.sks + " " + nilai.nilai);
        }
    }

    public void hapusDataMahasiswa(Scanner scanner) {
        System.out.println("DAFTAR MAHASISWA");
        for (Mahasiswa14 mhs : daftarMahasiswa) {
            System.out.println(mhs.nim + " " + mhs.nama + " " + mhs.notelp);
        }
        System.out.print("Pilih mahasiswa by nim untuk dihapus: ");
        String nim = scanner.next();
        Mahasiswa14 mahasiswa = daftarMahasiswa.stream().filter(m -> m.nim.equals(nim)).findFirst().orElse(null);

        if (mahasiswa != null) {
            queueMahasiswa.add(mahasiswa);
            daftarMahasiswa.remove(mahasiswa);
            System.out.println("Data mahasiswa berhasil ditambahkan ke antrian untuk dihapus.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}
