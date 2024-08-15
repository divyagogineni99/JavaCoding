package JavaConcepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GraphTraversals {
    public static void main(String... args) {
        MultiNode root = new MultiNode(0);
        MultiNode root_children_1 = new MultiNode(1);
        MultiNode root_children_2 = new MultiNode(2);
        MultiNode root_children_3 = new MultiNode(3);

        MultiNode children_2_1 = new MultiNode(4);

        MultiNode children_3_1 = new MultiNode(5);
        MultiNode children_3_2 = new MultiNode(6);
        MultiNode children_3_3 = new MultiNode(7);

        root.setChildren(Arrays.asList(root_children_1, root_children_2, root_children_3));
        root_children_1.setChildren(Arrays.asList(root));
        root_children_2.setChildren(Arrays.asList(children_2_1));
        root_children_3.setChildren(Arrays.asList(children_3_1, children_3_2, children_3_3));

//        root.printDfs();
//        root_children_2.print();
//        root_children_3.print();


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(1,3);
        map.get(1);

        Map<MultiNode, Integer> map2 = new HashMap<>();
        MultiNode multi = new MultiNode(2);
        MultiNode multi_children = new MultiNode(2, Arrays.asList(multi));
        MultiNode multi2 = new MultiNode(3);
        map2.put(multi, 2);
        map2.put(multi2, 2);
        map2.put(multi_children, 4);

        System.out.println(map2);

        GraphTraversals graphTraversals = new GraphTraversals();
        graphTraversals.m1();

    }


    void m1() {
        C c = new A();
        c.hello();
        C c1 = new B();
        c1.hello();
        A a = new A();
        a.hello();
    }

    class A extends C {
        void hello() {
            System.out.println("In A");
        }
    }

    class B extends C {
        void hello() {
            System.out.println("In B");
        }
    }

    class C {
        void hello() {
            System.out.println("In C");
        }
    }
}
