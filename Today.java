// Count number of nodes
class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}


public class Today{
    public static int count(Node root){
        if(root == null)
            return 0;

        return 1 + count(root.left) + count(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        System.out.println("Total Nodes : " + count(root));

    }
}