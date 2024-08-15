package JavaConcepts;
import java.util.*;

// insert insertK, deleteTail deleteName find update

// 1) Use recessions to print list. i) back to front and ii) front to back.
// 2) Head recruiting and tail recursion.
// 3) Go through slow pointer and fast pointer techniques .
// 4) Convert a tree to lists.
public class LL {
    // SCOPE
    // if not static then they're called object methods i:e we have to create objects to access the method.
    static Node head;
    static Node tail;

    class Node {
        String name;
        Node next;

        Node(String name, Node next) {
            this.name = name;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        LL ll = new LL();
        Node head = ll.insert("node1");
        Node node2 = ll.insert("node2");
        Node node3 = ll.insert("node3");
        Node tail = ll.insert("node4");
        head.next = node2;
        node2.next = node3;
        node3.next = tail;
        System.out.println("Head : " + head);
        System.out.println("Tail : " + tail);

        //ll.print();

        //printLinkedListUsingRecursionFrontToBack(head);
        printLinkedListUsingRecursionBackToFront(head);

//        String result= ll.cycleTwoPinter(head);
//        System.out.println(result);

        //System.out.println(head);
        //System.out.println(tail);

//        ll.insert("divi");
//        ll.insert("divi");
    }

    public static void printLinkedListUsingRecursionFrontToBack(Node node){
        if(node == null){
            return ;
        }
        System.out.print(node.name + " --> ");
        printLinkedListUsingRecursionFrontToBack(node.next);
    }
    public static void printLinkedListUsingRecursionBackToFront(Node node) {
        if (node == null) {
            return;
        }
        printLinkedListUsingRecursionBackToFront(node.next);
        System.out.print(node.name + " --> ");
    }

    public Node insert(String name) {
        Node newNode = new Node(name, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        return newNode;
    }

    // Given head of linkedlist, return true if there's a cycle or else false.
    public String cycleTwoPinter(Node name){
        //print();
        //String[] visitedNodes=new String[5];
        Node slowRunner=head;
        Node fastRunner=head.next;
        while (slowRunner.next != null && fastRunner.next != null) {
            fastRunner=fastRunner.next.next;
            slowRunner=slowRunner.next;
            if(slowRunner==fastRunner){
                return "Cycle Found";
            }
        }
        // no cycle
        return "No Cycle Found";
    }
    /*public static String isHappyLL(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        if(fastRunner==1){
            return "Happy Number";
        } else {
            return "Not a Happy Number";
        }
    }*/

    public static String cycle(Node name){
        HashSet<Node> visitedNodes=new HashSet<Node>();
        Node insertPointer = head;
        boolean found=false;
        while(insertPointer != null){
            if(visitedNodes.contains(insertPointer)){
                found=true;
                break;
            }else {
                visitedNodes.add((insertPointer));
            }
            insertPointer = insertPointer.next;
        }
        if(found) {
            return "Cycle Found";
        }else{
            return " Cycle not Found";
        }
    }

    public void insertK(String name, int k) {
        Node newNode = new Node(name, null);
        Node insertPointer = head;
        int i = 0;
        while (insertPointer.next != null) {
            if (i == k - 1) {
                newNode.next = insertPointer.next;
                insertPointer.next = newNode;
                break;
            }
            insertPointer = insertPointer.next;
            i++;
        }

    }

    public void deleteName(String name) {
        Node deletePointer = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else if (head == tail) {
            if (head.name.equals(name)) {
                head = tail = null;
            } else {
                System.out.println("Element Not Found!!");
            }
        }
        while (deletePointer.next != null) {
            if (head.name.equals(name)) {
                head = head.next;
            } else if (deletePointer.next.name.equals(name)) {
                if (deletePointer.next.next == null) {
                    deletePointer.next = null;
                    tail = deletePointer;
                } else {
                    deletePointer.next = deletePointer.next.next;
                }
            } else {
                System.out.println("Element Not Found!!");
            }
            deletePointer = deletePointer.next;
            if (deletePointer == null) {
                break;
            }
        }

    }

    private void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
    }

}
