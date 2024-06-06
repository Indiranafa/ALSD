public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();
        
        // Memasukkan data awal
        int[] data = {6, 4, 8, 3, 5, 7, 9};
        int idxLast = 6;
        bta.populateData(data, idxLast);

        // Melakukan traversal tree dalam berbagai urutan
        System.out.print("Traversal InOrder: ");
        bta.traverseInOrder(0);
        System.out.println("");

        System.out.print("Traversal PreOrder: ");
        bta.traversePreOrder(0);
        System.out.println("");

        System.out.print("Traversal PostOrder: ");
        bta.traversePostOrder(0);
        System.out.println("");

        // Menambahkan elemen baru ke dalam tree
        bta.add(10);
        bta.add(15);

        // Melakukan traversal lagi untuk melihat perubahan
        System.out.print("Traversal InOrder setelah penambahan: ");
        bta.traverseInOrder(0);
        System.out.println("");

        System.out.print("Traversal PreOrder setelah penambahan: ");
        bta.traversePreOrder(0);
        System.out.println("");

        System.out.print("Traversal PostOrder setelah penambahan: ");
        bta.traversePostOrder(0);
        System.out.println("");
    }
}
