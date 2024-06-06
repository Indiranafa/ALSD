package UTS;
import java.util.Scanner;

public class AlatPestaMain14 {
    public static AlatPesta14[] daftarAlatPesta14 = {
        new AlatPesta14(1, "Paket Alat Makan", 10),
        new AlatPesta14(2, "Kursi", 20),
        new AlatPesta14(3, "Tenda", 5)
    };

    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nPilih Operasi:");
            System.out.println("1. Menampilkan deret data");
            System.out.println("2. Pencarian berdasarkan nama");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc14.nextInt();
            sc14.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nUrut berdasarkan:");
                    System.out.println("1. ID ascending");
                    System.out.println("2. ID descending");
                    System.out.println("3. Stok ascending");
                    System.out.println("4. Stok descending");
                    System.out.print("Pilihan Anda: ");
                    int urutan = sc14.nextInt();
                    AlatPesta14.tampilkanDeretData14(daftarAlatPesta14, urutan);
                    break;
                case 2:
                    sc14.nextLine();
                    System.out.print("\nMasukkan nama alat yang ingin dicari: ");
                    String namaCari14 = sc14.nextLine();
                    AlatPesta14.binarySearchBerdasarkanNama14(daftarAlatPesta14, namaCari14);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 3);
    }
}
