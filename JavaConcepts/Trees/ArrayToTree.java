package JavaConcepts.Trees;
import java.util.*;

public class ArrayToTree {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode node = convertArrayToTreeNode(array);
        //System.out.println(node.val);
        System.out.println(" node : " + node.val);
        System.out.println("left : " + node.left.val);
        System.out.println("right : " + node.right.val);
    }

    public static TreeNode convertArrayToTreeNode(int[] array) {
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i=1;
        while(i<array.length){
            TreeNode current = queue.poll();
            if(i < array.length){
                current.left = new TreeNode(array[i++]);
                queue.add(current.left);
            }
            if(i < array.length ){
                current.right = new TreeNode(array[i++]);
                queue.add(current.right);
            }
        }
        return root;
    }
}

