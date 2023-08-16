package DataStructures.Trees;

public class Bst {
    public static void main(String[] args) {
        Node head = new Node();
        head.addNode(6);
        head.addNode(1);
        head.addNode(7);
        head.printInorder(head.head);
    }
}
