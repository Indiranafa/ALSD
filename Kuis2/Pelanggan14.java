package Kuis2;

import java.util.ArrayList;
import java.util.List;

public class Pelanggan14 {
    String namaPelanggan14;
    String noHp14;
    List<Layanan14> layananList; // List untuk menyimpan layanan pelanggan

    public Pelanggan14(String namaPelanggan14, String noHp14) {
        this.namaPelanggan14 = namaPelanggan14;
        this.noHp14 = noHp14;
        this.layananList = new ArrayList<>(); // Inisialisasi list layanan
    }

    public void addLayanan(Layanan14 layanan) {
        layananList.add(layanan);
        System.out.println("Layanan " + layanan.namaLayanan14 + " ditambahkan untuk pelanggan: " + namaPelanggan14);
    }
}
