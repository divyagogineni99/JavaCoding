package JavaConcepts.Stack;

public class StackMain {
    public static void main(String[] args){
        Stack  si=new StackImplementation(5);
        si.push(3);
        si.push(6);
        si.push(1);
        si.push(5);
        si.peek();
        System.out.println(si.pop());
        System.out.println(si.pop());
        System.out.println(si.min());
        si.print();
    }
}
