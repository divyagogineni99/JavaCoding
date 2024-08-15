package JavaConcepts.ImmutableObject;

import java.util.ArrayList;
import java.util.List;


//Creating an Immutable Class in Java
//
//To create an immutable class in Java, you need to follow these general principles:
//
//    1)    Declare the class as final so it can’t be extended.
//    2)    Make all of the fields private so that direct access is not allowed.
//    3)    Don’t provide setter methods for variables.
//    4)    Make all mutable fields final so that a field’s value can be assigned only once.
//    5)    Initialize all fields using a constructor method performing deep copy.
//    6)    Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.

public class ImmutableObjectDemo {
    private final int a;
    private final List<Integer> originalList;

    ImmutableObjectDemo(int a, List<Integer> list) {
        this.a = a;
        this.originalList = list;
    }

    public List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.addAll(originalList);
        return list;
    }
}


class Main{
    public static void main(String args[]){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        ImmutableObjectDemo obj = new ImmutableObjectDemo(5, l1);
        //System.out.println(l1.hashCode());
//        obj.a = 5;

//        List<Integer> l2 = new ArrayList<>();
//        l2.add(1);
//        l2.add(2);
//        obj.list.add(3);

        System.out.println(obj.getList()); // you still can modify the list.

        /// there are 2 ways to acheive immutability of objects
        // 1) shallow cloning, 2) deep cloning

        // immutability should prevent inheritance access also
    }

}

//class childImmutableObject extends ImmutableObjectDemo {
//
//    childImmutableObject(int a, List<Integer> list) {
//        super(a, list);
//    }
//
//    public List<Integer> setList(){
//        super.originalList.add(3);
//        return super.originalList;
//    }
//
//    public static void main(String args[]){
//        List<Integer> l1 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        childImmutableObject c = new childImmutableObject(1,l1);
//
//        System.out.println(c.a);
//        System.out.println(c.originalList);
//
//    }
//}
