package UTS;
import java.util.Arrays;
import java.util.Comparator;

public class AlatPesta14 {
    int id14;
    String nama14;
    int stok14;

    public AlatPesta14(int id14, String nama14, int stok14) {
        this.id14 = id14;
        this.nama14 = nama14;
        this.stok14 = stok14;
    }

    public int Id14() {
        return id14;
    }

    public String Nama14() {
        return nama14;
    }

    public int Stok14() {
        return stok14;
    }

    public void setStok14(int stok14) {
        this.stok14 = stok14;
    }

    public static void tampilkanDeretData14(AlatPesta14[] daftarAlatPesta14, int pilihan14) {
        switch (pilihan14) {
            case 1:
                Arrays.sort(daftarAlatPesta14, Comparator.comparingInt(AlatPesta14::Id14));
                break;
            case 2:
                Arrays.sort(daftarAlatPesta14, Comparator.comparingInt(AlatPesta14::Id14).reversed());
                break;
            case 3:
                Arrays.sort(daftarAlatPesta14, Comparator.comparingInt(AlatPesta14::Stok14));
                break;
            case 4:
                Arrays.sort(daftarAlatPesta14, Comparator.comparingInt(AlatPesta14::Stok14).reversed());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        System.out.println("\nData Alat Pesta:");
        for (AlatPesta14 alatPesta14 : daftarAlatPesta14) {
            System.out.println(alatPesta14);
        }
    }
    public static void binarySearchBerdasarkanNama14(AlatPesta14[] daftarAlatPesta14, String namaCari14) {
        int hasilPencarian = Arrays.binarySearch(daftarAlatPesta14, new AlatPesta14(0, namaCari14, 0), Comparator.comparing(AlatPesta14::Nama14));
        if (hasilPencarian >= 0) {
            System.out.println("\nData ditemukan:");
            System.out.println(daftarAlatPesta14[hasilPencarian]);
        } else {
            System.out.println("\nData tidak ditemukan.");
        }
    }

    public String toString() {
        return "ID: " + id14 + ", Nama: " + nama14 + ", Stok: " + stok14;
    }
}
