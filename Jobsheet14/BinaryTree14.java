public class BinaryTree14 {
    Node14 root;

    public BinaryTree14(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    Node14 addRecursive(Node14 current, int data) {
        if (current == null) {
            return new Node14(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // void add(int data) {
    //     if (isEmpty()) {
    //         root = new Node14(data);
    //     } else {
    //         Node14 current = root;
    //         while (true) {
    //             if (data > current.data) {
    //                 if (current.right == null) {
    //                     current.right = new Node14(data);
    //                     break;
    //                 } else {
    //                     current = current.right;
    //                 }
    //             } else if (data < current.data) {
    //                 if (current.left == null) {
    //                     current.left = new Node14(data);
    //                     break;
    //                 } else {
    //                     current = current.left;
    //                 }
    //             } else {
    //                 break; // If data is equal, do not insert duplicates
    //             }
    //         }
    //     }
    // }

    int findMin() {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        return findMin(root).data;
    }

    Node14 findMin(Node14 node) {
        return node.left == null ? node : findMin(node.left);
    }

    int findMax() {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        return findMax(root).data;
    }

    Node14 findMax(Node14 node) {
        return node.right == null ? node : findMax(node.right);
    }

    boolean find(int data) {
        Node14 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    void printLeafNodes() {
        printLeafNodes(root);
    }

    void printLeafNodes(Node14 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    int countLeafNodes() {
        return countLeafNodes(root);
    }

    int countLeafNodes(Node14 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    void traversePreOrder(Node14 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            traverseInOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            System.out.print(" " + node.data);
            traversePostOrder(node.right);
        }
    }

    Node14 getSuccessor(Node14 del){
        Node14 successor = del.right;
        Node14 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current==null) {
            System.out.println("Couldn't find data!");
            return;
        }else{
            if (current.left==null&&current.right==null) {
                if(current==root){
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left==null){
                if (current==root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right==null){
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node14 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}

