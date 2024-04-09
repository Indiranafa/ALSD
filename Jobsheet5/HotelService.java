package Jobsheet5;

public class HotelService {
    Hotel[] rooms;
    int jmlRoom;

    public HotelService(){
        rooms = new Hotel[100];
        jmlRoom = 0;
    }

    public void tambah(Hotel H) {
        rooms[jmlRoom] = H;
        jmlRoom++;
    }

    public void tampilAll() {
        for (int i = 0; i < jmlRoom; i++) {
            System.out.println("Nama: " + rooms[i].nama + ", Kota: " + rooms[i].kota + ", Harga: " + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < jmlRoom - 1; i++) {
            for (int j = 0; j < jmlRoom - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    // Swap
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < jmlRoom - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < jmlRoom; j++) {
                if (rooms[j].bintang > rooms[minIndex].bintang) {
                    minIndex = j;
                }
            }
            // Swap
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
