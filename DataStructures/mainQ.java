package DataStructures;

public class mainQ {
    public static void main(String[] args) throws Exception {
        circularQ cq = new circularQ(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.display();

    }
}
