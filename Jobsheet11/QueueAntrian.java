package Jobsheet11;

public class QueueAntrian {
    NodeAntrian head;
    NodeAntrian tail;

    public QueueAntrian() {
        head = null;
        tail = null;
    }

    public void enqueue(Mahasiswa mahasiswa) {
        NodeAntrian newNode = new NodeAntrian(mahasiswa);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else {
            Mahasiswa removed = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return removed;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeAntrian current = head;
            System.out.print("Antrian: ");
            while (current != null) {
                System.out.print(current.data.nama + " (" + current.data.nim + ") -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void dequeueByNIM(int nim) {
        // Kasus jika antrian kosong
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
    
        // Kasus jika data yang dihapus adalah data pertama
        if (head.data.nim == nim) {
            dequeue();
            System.out.println("Data dengan NIM " + nim + " berhasil dihapus dari antrian");
            return;
        }
    
        // Cari data yang akan dihapus
        NodeAntrian prev = null;
        NodeAntrian current = head;
        while (current != null && current.data.nim != nim) {
            prev = current;
            current = current.next;
        }
    
        // Kasus jika data tidak ditemukan
        if (current == null) {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan dalam antrian");
            return;
        }
    
        // Kasus jika data ditemukan dan bukan data pertama
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
        System.out.println("Data dengan NIM " + nim + " berhasil dihapus dari antrian");
    }
}
