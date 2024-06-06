public class FilmLinkedList {
    NodeFilm head, tail;

    FilmLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method untuk memeriksa apakah linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    void addFirst(int id, String title, double rating) {
        NodeFilm newNode = new NodeFilm(id, title, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int id, String title, double rating) {
        NodeFilm newNode = new NodeFilm(id, title, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtIndex(int id, String title, double rating, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(id, title, rating);
        } else {
            NodeFilm newNode = new NodeFilm(id, title, rating);
            NodeFilm current = head;
            int i = 0;
            while (current != null && i < index - 1) {
                current = current.next;
                i++;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah node");
                return;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void deleteAtIndex(int index) {
        if (head == null || index < 0) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        NodeFilm current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi jumlah node");
            return;
        }
        if (current == tail) {
            deleteLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        System.out.println("=====================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("=====================================");
        NodeFilm current = head;
        while (current != null) {
            System.out.println("ID Film: " + current.id);
            System.out.println("Judul Film: " + current.title);
            System.out.println("Rating Film: " + current.rating);
            System.out.println("-------------------------------------");
            current = current.next;
        }
    }

    void searchById(int id) {
        NodeFilm current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID " + id + " ditemukan pada node ke-" + (index + 1));
                System.out.println("ID Film: " + current.id);
                System.out.println("Judul Film: " + current.title);
                System.out.println("Rating Film: " + current.rating);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Data ID " + id + " tidak ditemukan");
    }

    void sortByRatingDescending() {
        if (isEmpty()) {
        System.out.println("Data film kosong.");
        return;
        }

        // Inisialisasi node untuk iterasi
        NodeFilm current = head;
        NodeFilm index = null;

        // Variabel sementara untuk menyimpan data yang akan ditukar
        int tempId;
        String tempTitle;
        double tempRating;

        // Traversal linked list dengan dua loop
        while (current != null) {
            index = current.next;

            while (index != null) {
                // Jika rating film saat ini lebih kecil dari rating film berikutnya
                if (current.rating < index.rating) {
                    // Tukar data film
                    tempId = current.id;
                    tempTitle = current.title;
                    tempRating = current.rating;

                    current.id = index.id;
                    current.title = index.title;
                    current.rating = index.rating;

                    index.id = tempId;
                    index.title = tempTitle;
                    index.rating = tempRating;
                }

                index = index.next;
            }

            current = current.next;
        }
    }

    void swapData(NodeFilm node1, NodeFilm node2) {
        int tempId = node1.id;
        String tempTitle = node1.title;
        double tempRating = node1.rating;
        node1.id = node2.id;
        node1.title = node2.title;
        node1.rating = node2.rating;
        node2.id = tempId;
        node2.title = tempTitle;
        node2.rating = tempRating;
    }
}
