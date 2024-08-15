package JavaConcepts.Trees;

import java.util.*;

public class TreeImplementation {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // Create binary tree nodes
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);

        // Build the binary tree structure
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        // Call the inorderTraversal method with the root node
        List<Integer> result = inorderTraversal(node1);
        System.out.println("Inorder Traversal: " + result);


        int maxBFS = maxValueFromTreeBFS(node1, 0);
        System.out.println("maxValueFromTreeBFS: " + maxBFS);

        int maxDFSTopDown = maxValueFromTreeDFSTopDown(node1, 0);
        System.out.println("maxValueFromTreeDFSTopDown: " + maxDFSTopDown);

        int maxDFSBottomUp = maxValueFromTreeDFSBottomUp(node1);
        System.out.println("maxValueFromTreeDFSBottomUp: " + maxDFSBottomUp);


    }
    static int max = 0;

    public static int maxValueFromTreeDFSBottomUp(TreeNode node){
        if(node == null){
            return max;
        }

        int leftMax = maxValueFromTreeDFSBottomUp(node.left);
        int rightMax = maxValueFromTreeDFSBottomUp(node.right);

        max = Math.max(node.val, Math.max(leftMax, rightMax));

        return max;
    }


    public static int maxValueFromTreeDFSTopDown(TreeNode node, int max){
        if(node == null){
            return max;
        }
        int maxer = maxValueFromTreeDFSTopDown(node.left , Math.max(node.val , max));
        int newMax = maxValueFromTreeDFSTopDown(node.right , maxer);
        return newMax;
    }



    static Queue<TreeNode> queue = new LinkedList<>();
    public static int maxValueFromTreeBFS(TreeNode root, int max){
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.val > max){
                max = currentNode.val;
            }
            if(currentNode.left != null)
            queue.add(currentNode.left);
            if(currentNode.right != null)
            queue.add(currentNode.right);

        }
        System.out.println(queue);
        System.out.println(max);
        return max;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();;
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }

}



