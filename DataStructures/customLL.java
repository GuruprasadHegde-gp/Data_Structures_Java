package DataStructures;

public class customLL {
    Node head;
    private Node tail;
    private int size;

    public customLL(int size) {
        this.size = size;
    }


    public int getSize(){
        return size;
    }
    public void insertAtFirst(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public void insertRec(int val,int index,Node cur){
        if(index==1)
        {
            Node newNode =  new Node(val);
            newNode.next=cur.next;
            cur.next=newNode;
            return;

        }

        insertRec(val,--index,cur.next);

    }

    public void insertAtLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            insertAtFirst(val);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public void insertAtPosition(int pos,int val){
        Node n = new Node(val);
        Node iterator = head;
        int count=0;
        while(count!=pos-1)
        {
            iterator=iterator.next;
            count++;
        }

        n.next=iterator.next;
        iterator.next=n;
        size++;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    class Node {
        int value;
        Node next;
        //Constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}