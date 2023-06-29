package guru;

public class dynamicStack extends  customStack{
    dynamicStack(){
        super();
    }

    dynamicStack(int size){
        super(size);

    }

    @Override
    public boolean push(int ele) {
        if(isFull())
        {
            int []temp = new int[data.length*2];
        }
        return super.push(ele);
    }
}
