public class BinaryTreeMain14 {
    public static void main(String[] args) {
        BinaryTree14 bt = new BinaryTree14();
        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // Menampilkan nilai paling kecil dan paling besar
        System.out.println("Minimum value in the tree: " + bt.findMin());
        System.out.println("Maximum value in the tree: " + bt.findMax());

        // Menampilkan data yang ada di leaf
        System.out.print("Leaf nodes in the tree: ");
        bt.printLeafNodes();
        System.out.println("");

        // Menampilkan jumlah leaf
        System.out.println("Number of leaf nodes in the tree: " + bt.countLeafNodes());
    }
}
