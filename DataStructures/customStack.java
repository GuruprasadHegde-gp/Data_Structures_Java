package DataStructures;

public class customStack {
    protected    int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int pointer= -1;

    public customStack()
    {
            this(DEFAULT_SIZE);
    }
    public customStack(int size)
    {
        data = new int[size];
    }

    public boolean push(int ele)
    {
      if(isFull()){
          System.out.println("STACK IS FULL");
          return false;
      }

      data[++pointer]=ele;
      return true;
    }

    public int pop() throws Exception
    {
        if (isEmpty()){
            throw new Exception("STACK IS EMPTY");
        }
        int removed = data[pointer--];
        return removed;

    }

    public int peek() throws  Exception{
        if(isEmpty())
        {
            throw new Exception("Cannot Peek from an empty Stack");
        }

        return data[pointer];

    }

    public boolean isFull() {
      return pointer== data.length-1;

    }
    public boolean isEmpty(){
        //check weather stack is empty or not
        return pointer==-1;
    }

}


