package Jobsheet15;

public class DoubleLinkedList14 {
    Node14 head;
    int size;

    public DoubleLinkedList14() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if(isEmpty()){
            head = new Node14(null, item, jarak, null);
        }else{
            Node14 newNode = new Node14(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node14 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node14 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        Node14 current = head;
        while (current != null) {
            if (current.data == index){
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null){
                    current.next.prev = current.prev;
                }
                size--; // Decrement size after removal
                return;
            }
            current = current.next;
        }
        throw new Exception("Node with value " + index + " not found");
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void updateJarak(int index, int newJarak) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node14 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.jarak = newJarak;
    }
    
}
