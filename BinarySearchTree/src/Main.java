public class Main {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //Left Subtree
            root.left = Insert(root.left, val);
        } else{
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static boolean Search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            // search in left sub tree
            return Search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else{
            return Search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else{  // root.data = val
            //case 1 == when delete to be node has no leaf
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 == when there is only one leaf present of node
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3 == when there are two leaf nodes
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {

        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = Insert(root, val[i]);
        }
        Inorder(root);
        System.out.println();

        if(Search(root, 2)){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }

        delete(root, 4);
        Inorder(root);

        System.out.println();
        printInRange(root,3,7);
    }
}