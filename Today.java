class Node{
    int data;
    Node left, right;

    Node(int value){
        data = value;
        left = right = null;
    }
}

public class Today{
    public static void main(String args[]){
        Node root = new Node(1);// root
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Tree Create Succsessfully");
    }
}