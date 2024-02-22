import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input NIM
        System.out.print("Masukkan NIM: ");
        String nimStr = scanner.nextLine();
        
        //pastikan bahwa NIM hanya mengandung 10 digit
        if (nimStr.length() != 10) {
            System.err.println("NIM harus 10 digit!");
            return;
        }

        String digitAkhir = "";
        int length = nimStr.length();
        int nim = 0;
        if (length >= 2) {
            digitAkhir = nimStr.substring(length - 2);
            nim = Integer.parseInt(digitAkhir);
        } if (nim < 10) {
            nim += 10;
        }

        // Menampilkan 2 digit terakhir NIM
        System.out.println("2 digit terakhir NIM: " + nim);

        // Menampilkan deret bilangan
        for (int i = 1; i <= nim; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 1) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
