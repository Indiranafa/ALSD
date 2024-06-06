package Jobsheet11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){ //kondisinya headnya harus berisi null
        return head == null;
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node tmp = head;
            System.out.print("Isi Linked List ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
    
    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }    

    void insertAt(int index, int input){
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! Indeks tidak boleh negatif.");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Indeks melebihi panjang linked list.");
            }
        }
    }  
    
    int getData(int index){
        Node tmp = head;
        for(int i=0; i < index +1; i++){
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data !=key){
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        }else{
            return index;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List sudah kosong, tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list sudah kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    void remove(int key){
        if (isEmpty()) {
            System.out.println("Linked list sudah kosong, tidak dapat dihapus");
        } else {
            Node temp = head;
            if (temp.data == key) {
                removeFirst();
                return;
            }
            while(temp.next != null && temp.next.data != key){
                temp = temp.next;
            }
            if(temp.next != null){
                temp.next = temp.next.next;
                if(temp.next == null){
                    tail = temp;
                }
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
    
    public void removeAt(int index){
        if (isEmpty() || index < 0) {
            System.out.println("Linked list sudah kosong atau indeks tidak valid, tidak dapat dihapus");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Indeks melebihi panjang linked list.");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
    
}
