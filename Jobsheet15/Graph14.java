package Jobsheet15;

public class Graph14 {
    int vertex;
    DoubleLinkedList14 list[];

    public Graph14(int v){
        vertex = v;
        list = new DoubleLinkedList14[v];
        for (int i = 0; i < v; i++){
            list[i] = new DoubleLinkedList14();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut;

        // Calculate out-degree
        totalOut = list[asal].size();

        // Calculate in-degree
        for (int i = 0; i < vertex; i++) {
            if (i != asal) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        totalIn++;
                    }
                }
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++){
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char)('A'+i)+" terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.println((char)('A'+list[i].get(j))+" (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isConnected(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, newJarak);
                return;
            }
        }
        throw new Exception("Edge tidak ditemukan!");
    }
    
    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            edgeCount += list[i].size();
        }
        return edgeCount;
    }
}
