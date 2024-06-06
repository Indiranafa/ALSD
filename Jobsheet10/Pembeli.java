package Jobsheet10;

public class Pembeli {
    String nama;
    int noHP;
    
    Pembeli(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    public static class Queue {
        Pembeli[] antrian;
        int front;
        int rear;
        int size;
        int max;
    
        Queue(int n) {
            max = n;
            antrian = new Pembeli[max];
            front = 0;
            rear = -1;
            size = 0;
        }
    
        public boolean IsEmpty(){
            if (size == 0){
                return true;
            }else{
                return false;
            }
        }
    
        public boolean IsFull(){
            if (size == max){
                return true;
            }else{
                return false;
            }
        }
    
        public void peek() {
            if (!IsEmpty()) {
                System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
            } else {
                System.out.println("Queue masih kosong");
            }
        }
    
        public void peekRear() {
            if (!IsEmpty()) {
                System.out.println("Elemen paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
            } else {
                System.out.println("Queue masih kosong");
            }
        }
    
        public void print() {
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                    i = (i + 1) % max;
                }
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                System.out.println("Jumlah elemen = " + size);
            }
        }
    
        public void clear() {
            if (!IsEmpty()){
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan");
            }else{
                System.out.println("Queue masih kosong");
            }
        }
    
        void enqueue(Pembeli antri) {
            if (!IsFull()) {
                if (rear == max - 1)
                    rear = -1;
                antrian[++rear] = antri;
                size++;
            } else {
                System.out.println("Antrian sudah penuh");
            }
        }
    
        int dequeue() {
            if (!IsEmpty()) {
                Pembeli temp = antrian[front++];
                if (front == max)
                    front = 0;
                size--;
                return temp.noHP;
            } else {
                System.out.println("Antrian kosong");
                return -1;
            }
        }
    
        void peekPosition(String nama) {
            if (!IsEmpty()) {
                int pos = -1;
                for (int i = front; i != rear; i = (i + 1) % max) {
                    if (antrian[i].nama.equals(nama)) {
                        pos = (i - front + 1) > 0 ? (i - front + 1) : (max + (i - front + 1));
                        break;
                    }
                }
                if (antrian[rear].nama.equals(nama))
                    pos = (rear - front + 1) > 0 ? (rear - front + 1) : (max + (rear - front + 1));
                if (pos != -1)
                    System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + pos);
                else
                    System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
            } else {
                System.out.println("Antrian kosong");
            }
        }
    
        void daftarPembeli() {
            if (!IsEmpty()) {
                System.out.println("Daftar Pembeli:");
                int i = front;
                while (i != rear) {
                    System.out.println(antrian[i].nama + " - " + antrian[i].noHP);
                    i = (i + 1) % max;
                }
                System.out.println(antrian[rear].nama + " - " + antrian[rear].noHP);
            } else {
                System.out.println("Antrian kosong");
            }
        }
    }
}
