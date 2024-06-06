import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bengkel14 {
    List<Pelanggan14> antrianPelanggan;
    List<Layanan14> layananList;
    int totalPemasukan;

    public Bengkel14() {
        antrianPelanggan = new ArrayList<>();
        layananList = new ArrayList<>();
        totalPemasukan = 0;
    }

    public void tambahAntrian(Pelanggan14 pelanggan) {
        antrianPelanggan.add(pelanggan);
        System.out.println("Pelanggan " + pelanggan.getNamaPelanggan() + " telah ditambahkan ke dalam antrian.");
    }

    public void cetakAntrian() {
        System.out.println("Antrian Pelanggan:");
        for (int i = 0; i < antrianPelanggan.size(); i++) {
            System.out.println((i + 1) + ". " + antrianPelanggan.get(i).getNamaPelanggan());
        }
    }
}
