package JavaConcepts.Stack;
public class StackImplementation implements Stack{
    public int[] array;
    public int top;
    public int capacity=5;
    public int poppedElement;
    public int min;

    public StackImplementation(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = 0;
        this.min=Integer.MAX_VALUE;
    }

    @Override
    public void print(){
        System.out.print("Now Stack Contains : ");
        for(int i=top-1;i>=0;i--){
            System.out.print(array[i]+"\t");
        }
    }
    @Override
    public  String push(int element){
        if(top>=array.length){
            System.out.println("Stack Overflow");
        }else {
            array[top] = element;
            top++;
            if (element < min) {
                min = element;
            }
        }
        return "Element Pushed : " + element;

    }

    @Override
    public String pop() {
        if(top==0){
            System.out.println("Zero Elements, Cannot pop");
        }else {
            top--;
            poppedElement = array[top];
            //System.out.println("MIN1 =" + min);
            if (poppedElement == min) {
                min = Integer.MAX_VALUE;
                //System.out.println("MIN2 =" + min);
                for (int i = top - 1; i >= 0; i--) {
                    if (array[i] <= min) {
                        min = array[i];
                       // System.out.println("MIN3 =" + min);
                    }
                }
            }
        }
            return "Popped Element : "+poppedElement;
    }

    @Override
    public String peek() {
        return "Top Element is : " + array[top-1];
    }

    @Override
    public String min() {
        return"Min Element : " + min;
    }
}
