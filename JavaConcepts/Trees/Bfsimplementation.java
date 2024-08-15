package JavaConcepts.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Bfsimplementation {
    public static void main(String args[]) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // Build the binary tree structure
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        bfsHeight(node1);
    }

    public static void bfsHeight(TreeNode node1){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node1);
        int count = 0;

        while(!queue.isEmpty()){
            int height = queue.size();
            count++;

            for(int i = 0 ; i< height ; i++) {
                TreeNode currentNode = queue.poll();
                System.out.println(currentNode.val + " " + count);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                    //System.out.println(currentNode.left.val + " " + count);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                    //System.out.println(currentNode.right.val + " " + count);
                }
            }
           // System.out.println("\n");
        }
        System.out.println("Count : " + count);

    }

}
