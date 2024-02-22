import java.util.Scanner;

public class platnomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array kode plat
        char[] KODE_PLAT = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // Deklarasi array pasangan kode plat dan nama kota (menggunakan char)
        char[][] NAMA_KOTA = {
            {'B', 'a', 'n', 't', 'e', 'n'},
            {'J', 'a', 'k', 'a', 'r', 't', 'a'},
            {'B', 'a', 'n', 'd', 'u', 'n', 'g'},
            {'C', 'i', 'r', 'e', 'b', 'o', 'n'},
            {'G', 'a', 'r', 'u', 't'},
            {'P', 'e', 'k', 'a', 'l', 'o', 'n', 'g', 'a', 'n'},
            {'S', 'e', 'm', 'a', 'r', 'a', 'n', 'g'},
            {'S', 'u', 'r', 'a', 'b', 'a', 'y', 'a'},
            {'M', 'a', 'l', 'a', 'n', 'g'},
            {'T', 'e', 'g', 'a', 'l'}
        };

        // Input kode plat nomor
        System.out.print("Masukkan kode plat nomor: ");
        char nomorPlat = sc.next().charAt(0); // Mengambil karakter pertama

        // Cari kode plat di array KODE_PLAT
        int kodePlat = -1;
        for (int i = 0; i < KODE_PLAT.length; i++) {
            if (nomorPlat == KODE_PLAT[i]) {
                kodePlat = i;
                break;
            }
        }

        // Menampilkan nama kota atau pesan jika kode plat tidak ditemukan
        if (kodePlat != -1) {
            System.out.print("Kota: ");
            for (char c : NAMA_KOTA[kodePlat]) {
                System.out.print(c);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
    }
}
