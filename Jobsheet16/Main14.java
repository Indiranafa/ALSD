package Jobsheet16;

import java.util.*;

public class Main14 {
    static List<Mahasiswa14> daftarMahasiswa = new ArrayList<>();
    static List<MataKuliah14> daftarMataKuliah = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tambah data Mahasiswa
        daftarMahasiswa.add(new Mahasiswa14("20001", "Thalhah", "021xxxxx"));
        daftarMahasiswa.add(new Mahasiswa14("20002", "Zubair", "021xxxxx"));
        daftarMahasiswa.add(new Mahasiswa14("20003", "Abdur", "021xxxxx"));
        daftarMahasiswa.add(new Mahasiswa14("20004", "Saad", "021xxxxx"));
        daftarMahasiswa.add(new Mahasiswa14("20005", "Saad", "021xxxxx"));

        // Tambah data MataKuliah
        daftarMataKuliah.add(new MataKuliah14("00001", "Basis Data", 3));
        daftarMataKuliah.add(new MataKuliah14("00002", "ASD", 3));
        daftarMataKuliah.add(new MataKuliah14("00003", "Aljabar", 2));
        daftarMataKuliah.add(new MataKuliah14("00004", "Agama", 2));
        daftarMataKuliah.add(new MataKuliah14("00005", "Aljabar", 2));

        ListNilai14 listNilai = new ListNilai14(daftarMahasiswa, daftarMataKuliah);

        while (true) {
            System.out.println("***************************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***************************************************************");
            System.out.println("1. Input nilai");
            System.out.println("2. Tampil nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("***************************************************************");
            System.out.print("Pilih : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    listNilai.inputNilai(scanner);
                    break;
                case 2:
                    listNilai.tampilNilai();
                    break;
                case 3:
                    listNilai.cariNilaiMahasiswa(scanner);
                    break;
                case 4:
                    listNilai.urutDataNilai();
                    break;
                case 5:
                    listNilai.hapusDataMahasiswa(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
