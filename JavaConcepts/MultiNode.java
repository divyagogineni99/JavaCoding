package JavaConcepts;

import java.util.*;

public class MultiNode {

    int value;
    List<MultiNode> children;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiNode multiNode = (MultiNode) o;
        return value == multiNode.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    MultiNode(int value, List<MultiNode> children) {
       this.value = value;
       this.children = children;



   }

    MultiNode(int value) {
        this.value = value;
    }



    public void setChildren(List<MultiNode> children) {
        this.children = children;
    }
    public void printDfs(){
       ArrayList<Integer> visitedNode = new ArrayList<>();
       Stack<MultiNode> stack = new Stack<MultiNode>();
       stack.push(this);
       while(!stack.isEmpty()){
           MultiNode poppedItem=stack.pop();
           visitedNode.add(poppedItem.value);
           List<MultiNode> childNode = poppedItem.children;
           if(childNode!=null && !childNode.isEmpty()){
               for(MultiNode multichild : childNode){
                   if(!visitedNode.contains(multichild.value)){
                       stack.push(multichild);
                   }
               }
           }

       }
        for(int value : visitedNode){
            System.out.println(value);
        }

    }

    public void printBfs() {
        ArrayList<Integer> visitedNode = new ArrayList<>();
        Queue<MultiNode> queue = new LinkedList<>();
        queue.add(this);
        while(!queue.isEmpty()){
            MultiNode node=queue.poll();
            visitedNode.add(node.value);
            List<MultiNode> childNodes = node.children;
            if (childNodes != null && !childNodes.isEmpty()) {
                for (MultiNode multiChild : childNodes) {
                    if (!visitedNode.contains(multiChild.value)) {
                        queue.add(multiChild);
                    }
                }
            }
        }
        for(int value : visitedNode){
            System.out.println(value);
        }
    }
}
