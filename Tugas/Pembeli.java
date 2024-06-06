package Tugas;
public class Pembeli {
    String nama;
    int noHP;
    Pembeli[] data;
    int front;
    int rear;
    int size;
    int max;

    Pembeli(String nama, int noHP){
    this.nama = nama;
    this.noHP = noHP;
    }

    public Pembeli(int n){
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan: " + data[front].nama + " " + data[front].noHP + "\n");
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian terbelakang: " + data[front].nama + " " + data[front].noHP + "\n");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void print(){
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            System.out.println("Urutan Antrian: ");
            while (i != rear){
                System.out.print(data[front].nama + " " + data[front].noHP);
                i = (i + 1) % max;
                System.out.println("");
            }
            System.out.println(data[front].nama + " " + data[front].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public Pembeli Enqueue(Pembeli dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()) {
                front = rear = 0;
            }else{
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
        return dt;
    }
    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if (IsEmpty()) {
            front = rear = 0;
        }else{
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }else{
                if (front == max - 1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public int peekPosition(String nama) {
        int position = -1;
        if (!IsEmpty()) {
            int currentPosition = front;
            int count = 1;
            while (currentPosition != rear) {
                if (data[currentPosition].nama.equals(nama)) {
                    position = count;
                    break;
                }
                count++;
                currentPosition = (currentPosition + 1) % max;
            }
            if (data[currentPosition].nama.equals(nama)) {
                position = count;
            }
        }
        return position;
    }
    Pembeli(){}
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Posisi Antrian");
    }
}