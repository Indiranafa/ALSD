public class fungsi {

    static int stokBunga[][] = { { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 } };
    static double harga[] = { 75000, 50000, 60000, 10000 };
    static String namaBunga[] = { "Algonema", "Keladi", "Alcosia", "Mawar" };

    public static void main(String[] args) {
        pendapatan();
        cabang4();
        bungaKurangCabang4();
    }

    static void pendapatan() {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga.length; j++) {
                pendapatan += stokBunga[i][j] * harga[j];
            }
            System.out.println("Pendapatan Cabang " + (i + 1) + " = " + pendapatan);
            System.out.print("");
        }
    }

    static void cabang4() {
        System.out.println("===================================================");
        System.out.println("Stok Bunga Cabang 4");
        for (int i = 0; i < stokBunga[3].length; i++) {
            System.out.println("Nama Bunga " + namaBunga[i] + " : " + stokBunga[3][i]);
        }
    }

    static void bungaKurangCabang4() {
        stokBunga[3][0] -= 1;
        stokBunga[3][1] -= 2;
        stokBunga[3][3] -= 5;

        System.out.println("===================================================");
        System.out.println("Stok Bunga Cabang 4 Setelah Pengurangan");
        for (int i = 0; i < stokBunga[3].length; i++) {
            System.out.println("Nama Bunga " + namaBunga[i] + " : " + stokBunga[3][i]);
        }
    }
}
