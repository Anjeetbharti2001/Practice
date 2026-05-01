// Print leaf Nodes
class Node {
    int data;
    Node left, right;

    Node(int value){
        data = value;
    }
}

public class Today{

    static void printLeaf(Node root){
        if(root == null)
            return;


        if(root.left == null && root.right == null)
            System.out.println(root.data + " ");

        printLeaf(root.left);
        printLeaf(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        printLeaf(root);
    }
}