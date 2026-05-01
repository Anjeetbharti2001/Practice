// Create a boinary tree and print the root

// Question: Create a tree and print root value

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
        Node root = new Node(10);

        System.out.println("root: " + root.data);
    }
}