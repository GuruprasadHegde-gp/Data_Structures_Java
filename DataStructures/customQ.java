package DataStructures;

public class customQ {
    protected    int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int pointer= 0;


    public customQ()
    {
        this(DEFAULT_SIZE);
    }
    public customQ(int size)
    {
        data = new int[size];
    }


    public boolean insert(int item) throws  Exception{
        if(isFull()){
            throw new Exception("Q is Full Cannot Insert");
        }
        data[pointer++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Q IS EMPTY CANT REMOVE");
        }

        int removed = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i-1]=data[i];
        }
        pointer--;
        //[1,2,3,4,5]
        return  removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Q IS EMPTY CANT DISPLAY");
        }
        return data[0];
    }
    public boolean isFull() {
        return pointer== data.length-1;

    }
    public boolean isEmpty(){
        //check weather stack is empty or not
        return pointer==-1;
    }

}
