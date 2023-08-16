package DataStructures.Trees;
public class Node {
       private int value;
       private Node left;
       private Node right;
       protected Node head = null;
        public Node() {}
        public Node(int value)
        {
                this.value=value;
        }
        public Node createHead(int value){
                Node temp = new Node();
                temp.value = value;
                this.head = temp;
                return head;
        }


        public void addNode(int value)
        {
                if(head==null)
                {
                        head=createHead(value);
                        System.out.println("Head Node Created with value"+head.value);
                        return;
                }

                Node itr=head;
                Node prev=null;
                //This is to iterate a Node and to find the right position to insert
                while(itr!=null)
                {
                        prev=itr;
                        if(value<itr.value)
                        {
                                itr=itr.left;
                        }

                        else
                                itr=itr.right;
                }


                if(value< prev.value)
                {
                        prev.left=new Node(value);
                        System.out.println(value + "Inserted at the left of " + prev.value);
                }

                else
                {
                        prev.right = new Node(value);
                        System.out.println(value + "Inserted at right of " + prev.value);
                }




        }

        public void printInorder(Node root)
        {
                if(root == null)
                        return;

                printInorder(root.left);
                System.out.print(root.value);
                printInorder(root.right);
        }

        public void printPreOrder(Node root)
        {
            if(root  ==  null)
                return;

            System.out.print(root.value);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }

        public void printPostOrder(Node root)
        {
            if(root ==  null)
                return;

            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.value);
        }



}

