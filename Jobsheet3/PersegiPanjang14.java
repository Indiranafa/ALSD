import java.util.Scanner;

public class PersegiPanjang14 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jml = sc.nextInt();

        PersegiPanjang14[] ppArray = new PersegiPanjang14[jml];
        
        for (int i = 0; i < jml; i++){
            ppArray[i] = new PersegiPanjang14();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < jml; i++){
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
