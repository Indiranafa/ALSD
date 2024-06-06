import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        FilmLinkedList filmList = new FilmLinkedList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=====================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada indeks tertentu");
            System.out.println("7. Cetak data");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut data rating film - DESC");
            System.out.println("10. Keluar");
            System.out.println("=====================================");

            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Masukkan data film di awal:");
                    System.out.print("ID Film: ");
                    int idFirst = scanner.nextInt();
                    scanner.nextLine(); // Clear newline character
                    System.out.print("Judul Film: ");
                    String titleFirst = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingFirst = scanner.nextDouble();
                    filmList.addFirst(idFirst, titleFirst, ratingFirst);
                    break;
                case 2:
                    System.out.println("Masukkan data film di akhir:");
                    System.out.print("ID Film: ");
                    int idLast = scanner.nextInt();
                    scanner.nextLine(); // Clear newline character
                    System.out.print("Judul Film: ");
                    String titleLast = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingLast = scanner.nextDouble();
                    filmList.addLast(idLast, titleLast, ratingLast);
                    break;
                case 3:
                    System.out.println("Masukkan data film pada indeks tertentu:");
                    System.out.print("ID Film: ");
                    int idIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear newline character
                    System.out.print("Judul Film: ");
                    String titleIndex = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndex = scanner.nextDouble();
                    System.out.print("Indeks: ");
                    int index = scanner.nextInt();
                    filmList.addAtIndex(idIndex, titleIndex, ratingIndex, index);
                    break;
                case 4:
                    filmList.deleteFirst();
                    System.out.println("Data pertama dihapus.");
                    break;
                case 5:
                    filmList.deleteLast();
                    System.out.println("Data terakhir dihapus.");
                    break;
                case 6:
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int deleteIndex = scanner.nextInt();
                    filmList.deleteAtIndex(deleteIndex);
                    break;
                case 7:
                    filmList.printList();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang ingin dicari:");
                    int searchId = scanner.nextInt();
                    filmList.searchById(searchId);
                    break;
                case 9:
                    filmList.sortByRatingDescending();
                    filmList.printList(); // Menampilkan daftar film yang sudah diurutkan
                    System.out.println("Data diurutkan berdasarkan rating secara descending.");
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 10);

        scanner.close();
    }
}