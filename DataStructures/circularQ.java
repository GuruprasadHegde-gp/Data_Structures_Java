package DataStructures;

public class circularQ {
    protected    int[] data;
    private static final int DEFAULT_SIZE = 10;
    private  int front=0;
    private int end =0;
    private int size=0;
    //constructors
    circularQ()
    {
        this(DEFAULT_SIZE);

    }
    circularQ(int size)
    {
        this.data = new int[size];
    }

    //Methods
    public boolean insert(int element)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=element;
        end=end% data.length;
        size++;
        return true;

    }

    public int delete() throws  Exception
    {
        if(isEmpty())
        {
            throw new Exception("FULL");
        }

        int removed = data[front];
        size--;
        front++;
        front=front% data.length;
        return removed;
    }
    public boolean isFull() {
        return size== data.length;

    }
    public boolean isEmpty(){
        //check weather stack is Q or not
        return size==0;
    }

    public  void display(){
        int i=front;
        do {
            System.out.println(data[i]);
            i++;
            i=i% data.length;
        }while (i!=end);
    }
}
