public class NodeVaksinasi {
    int number;
    String name;
    NodeVaksinasi prev;
    NodeVaksinasi next;

    NodeVaksinasi(int number, String name){
        this.number = number;
        this.name = name;
        this.prev = this.next = null;
    }    
}
