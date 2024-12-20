import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        static class BinaryTree{
            static int idx=-1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }

        }
            public static void Preorder(Node root){
                if(root == null){
                    return;
                }
                System.out.print(root.data + " ");
                Preorder(root.left);
                Preorder(root.right);
            }

            public static void Inorder(Node root){
                 if(root == null){
                     return;
                 }
                 Inorder(root.left);
                System.out.print(root.data + " ");
                Inorder(root.right);
            }

            public static void Postorder(Node root){
                 if(root == null){
                     return;
                 }
                 Postorder(root.left);
                 Postorder(root.right);
                System.out.print(root.data + " ");
            }

            public static void levelOrder(Node root){
                 if(root == null){
                     return;
                 }
                Queue<Node> q = new LinkedList<>();
                 q.add(root);
                 q.add(null);

                 while(!q.isEmpty()){
                     Node currNode = q.remove();
                     if(currNode == null){
                         System.out.println();
                         if(q.isEmpty()){
                             break;
                         }else {
                             q.add(null);
                         }
                     } else{
                         System.out.print(currNode.data + " ");
                         if(currNode.left != null){
                             q.add(currNode.left);
                         }
                         if(currNode.right != null){
                             q.add(currNode.right);
                         }
                     }
                 }
            }

            //Count of nodes
            public static int countOfNodes(Node root){
                if(root == null){
                    return 0;
                }
                int leftCount = countOfNodes(root.left);
                int rightCount = countOfNodes(root.right);

                return leftCount + rightCount + 1;
            }

            //Sum of Nodes
            public static int sumOfNodes(Node root){
                 if(root == null){
                     return 0;
                 }
                 int leftSum = sumOfNodes(root.left);
                 int rightSum = sumOfNodes(root.right);

                 return leftSum + rightSum + root.data;
            }

            //Height of Tree
            public static int height(Node root){
                  if(root == null){
                      return 0;
                  }
                  int leftHeight = height(root.left);
                  int rightHeight = height(root.right);

                  int maxHeight = Math.max(leftHeight,rightHeight) + 1;

                  return maxHeight;
            }

            //Diameter of a Tree
            public static int diameterTree(Node root){
                  if(root == null){
                      return 0;
                  }
                  int diam1 = diameterTree(root.left);
                  int diam2 = diameterTree(root.right);
                  int diam3 = height(root.left) + height(root.right) + 1;

                  return Math.max(diam3, Math.max(diam1,diam2));
            }

    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        //Preorder(root);
        //Inorder(root);
        //Postorder(root);
        //levelOrder(root);

        //System.out.println(countOfNodes(root));
        //System.out.println(sumOfNodes(root));
        //System.out.println(height(root));
        System.out.println(diameterTree(root));
    }
}


