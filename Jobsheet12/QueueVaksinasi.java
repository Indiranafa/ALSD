public class QueueVaksinasi {
    NodeVaksinasi front, rear;
    int size;

    public QueueVaksinasi(){
        front = rear = null;
        size = 0;
    }

    // Method untuk menambahkan data ke antrian
    public void enqueue(int number, String name){
        NodeVaksinasi newNode = new NodeVaksinasi(number, name);
        if (rear == null){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    // Method untuk menghapus data dari antrian
    public void dequeue(){
        if (front == null){
            System.out.println("Antrian kosong, tidak ada data untuk dihapus.");
            return;
        }
        System.out.println(front.name + " telah selesai divaksinasi.");
        front = front.next;
        if (front == null){
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
    }

    // Method untuk mencetak data pada antrian
    public void printQueue(){
        if (front == null){
            System.out.println("Antrian kosong");
            return;
        }
        NodeVaksinasi current = front;
        System.out.println("No.\tNama");
        while (current != null){
            System.out.println(current.number + "\t" + current.name);
            current = current.next;
        }
        System.out.println("Sisa antrian: " + size);
    }


    // Method untuk mengembalikan jumlah data pada antrian
    public int getSize(){
        return size;
    }
}
