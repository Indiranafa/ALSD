package Jobsheet11;

public class SingleLinkedListMhs {
    Mahasiswa head;
    Mahasiswa tail;

    public SingleLinkedListMhs() {
        head = null;
        tail = null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Mahasiswa current = head;
            System.out.print("Isi Linked List: ");
            while (current != null) {
                System.out.print(current.nama + " (" + current.nim + ") -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa mahasiswa) {
        Mahasiswa baru = mahasiswa;
        if (isEmpty()) {
            head = baru;
            tail = baru;
        } else {
            baru.next = head;
            head = baru;
        }
    }

    public void addLast(Mahasiswa mahasiswa) {
        Mahasiswa baru = mahasiswa;
        if (isEmpty()) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public void insertAfter(int nimKey, Mahasiswa mahasiswa) {
        Mahasiswa current = head;
        while (current != null && current.nim != nimKey) {
            current = current.next;
        }
        if (current != null) {
            Mahasiswa baru = mahasiswa;
            baru.next = current.next;
            current.next = baru;
            if (current == tail) {
                tail = baru;
            }
        } else {
            System.out.println("Node dengan NIM " + nimKey + " tidak ditemukan");
        }
    }

    public void insertAt(int index, Mahasiswa mahasiswa) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
            return;
        }
        if (index == 0) {
            addFirst(mahasiswa);
        } else {
            Mahasiswa current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                Mahasiswa baru = mahasiswa;
                baru.next = current.next;
                current.next = baru;
                if (current == tail) {
                    tail = baru;
                }
            } else {
                System.out.println("Indeks melebihi panjang linked list");
            }
        }
    }

    public void delete(int nim) {
        // Kasus jika linked list kosong
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        // Kasus jika data yang dihapus adalah data pertama
        if (head.nim == nim) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            System.out.println("Data dengan NIM " + nim + " berhasil dihapus");
            return;
        }
    
        // Cari data yang akan dihapus
        Mahasiswa prev = null;
        Mahasiswa current = head;
        while (current != null && current.nim != nim) {
            prev = current;
            current = current.next;
        }
    
        // Kasus jika data tidak ditemukan
        if (current == null) {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan");
            return;
        }
    
        // Kasus jika data ditemukan dan bukan data pertama
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
        System.out.println("Data dengan NIM " + nim + " berhasil dihapus");
    }    
}
