package Jobsheet5;

public class MainHotel {
    public static void main(String[] args) {
        HotelService service = new HotelService();

        // Tambahkan data hotel
        service.tambah(new Hotel("Hotel 1", "Surabaya", 100000, (byte) 3));
        service.tambah(new Hotel("Hotel 2", "Malang", 2000000, (byte) 4));
        service.tambah(new Hotel("Hotel 3", "Jakarta", 1500000, (byte) 5));

        System.out.println("Data Hotel sebelum sorting:");
        service.tampilAll();

        // Sorting menggunakan bubble sort
        System.out.println("\nData Hotel setelah sorting menggunakan Bubble Sort asc berdasarkan harga:");
        service.bubbleSort();
        service.tampilAll();

        // Sorting menggunakan selection sort
        System.out.println("\nData Hotel setelah sorting menggunakan Selection Sort dsc berdasarkan rating bintang:");
        service.selectionSort();
        service.tampilAll();
    }
}
