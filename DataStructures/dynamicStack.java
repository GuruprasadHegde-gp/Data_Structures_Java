package DataStructures;

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
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data=temp;
        }
        return super.push(ele);
    }
}
