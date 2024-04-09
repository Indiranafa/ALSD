package Jobsheet4.BruteForceDivideConquer;
import java.util.Scanner;
public class ModifMainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        Company[] companies = new Company[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("=============================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int months = sc.nextInt();
            companies[i] = new Company(months);

            for (int j = 0; j < months; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " untuk perusahaan ke-" + (i + 1) + ": ");
                companies[i].setProfit(j, sc.nextDouble());
            }
        }

        System.out.println("=============================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Total Keuntungan perusahaan ke-" + (i + 1) + " selama " + companies[i].getMonths() + " bulan adalah " + companies[i].calculateTotalProfit());
        }
    }
}
