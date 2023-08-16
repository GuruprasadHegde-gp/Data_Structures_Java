package stackQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class gameofTwo {
    public static void main(String[] args) {
        int count =0;
        int maxSum=10;
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);
        b.add(8);
        b.add(5);
        System.out.println(a.subList(2,a.size()));
        Stack<Integer> sum = new Stack<>();
        sum.push(0);


        while (sum.peek()<=maxSum && !a.isEmpty() && !b.isEmpty())
        {
            System.out.println(sum.peek());
            int tempSum=0;
            if(a.get(0)<b.get(0))
            {
                count++;
                tempSum=a.remove(0);
                sum.push(tempSum+sum.peek());

            }

            else
            {
                count++;
                tempSum=b.remove(0);
                sum.push(tempSum+sum.peek());

            }

        }
        System.out.println(count-1);


    }
}
