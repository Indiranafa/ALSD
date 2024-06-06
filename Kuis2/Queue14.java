package Kuis2;

public class Queue14 {
    Node14 front14, rear14;

    public Queue14() {
        front14 = rear14 = null;
    }

    public void enqueue(Pelanggan14 data) {
        Node14 newNode = new Node14(data);
        if (rear14 == null) {
            front14 = rear14 = newNode;
            return;
        }
        rear14.next14 = newNode;
        rear14 = newNode;
    }

    public void dequeue() {
        if (front14 == null) return;
        Node14 temp = front14;
        front14 = front14.next14;
        if (front14 == null) rear14 = null;
        temp = null;
    }

    public void display() {
        if (front14 == null) {
            System.out.println("Antrian kosong");
            return;
        }
        Node14 current = front14;
        while (current != null) {
            System.out.println("Nama Pelanggan: " + current.data14.namaPelanggan14 + ", No HP: " + current.data14.noHp14);
            current = current.next14;
        }
    }
}

