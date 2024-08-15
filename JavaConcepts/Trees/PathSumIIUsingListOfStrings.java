package JavaConcepts.Trees;

import java.util.ArrayList;
import java.util.List;
// ----------------------    LEET CODE      113. Path Sum II   -------------------------- //

public class PathSumIIUsingListOfStrings extends TreeNode {
    PathSumIIUsingListOfStrings(int val) {
        super(val);
    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(4);

        // Build the binary tree structure
        node1.left = node2;
        node1.right = node3;
//        node2.left = node4;
//        node3.left = node5;

        int target = 3;
        pathSum(node1, target);
    }

        public static List<String> pathSum(TreeNode root, int targetSum) {
            List<String>  resultString = new ArrayList<>();
            String innerString = "";
            resultString =  findPathUsingListOfStrings(root, targetSum, innerString, resultString);
            System.out.println(resultString);
            return resultString;
        }

        // //For eg 2: 1,2,2 => ["1->2" , "1->2"] , k = 3
         public static List<String> findPathUsingListOfStrings(TreeNode root, int targetSum, String innerString, List<String> resultString){

             if(root == null ) return resultString;

             innerString = String.valueOf(innerString + root.val);
             System.out.println("InnerString : " + innerString);

             if(root.right == null && root.left == null && targetSum == root.val){
                 resultString.add(new String(innerString));
                 System.out.println("resultString before  : " + resultString);
                 //System.out.println("result List : " + result);
             }

             findPathUsingListOfStrings(root.left ,targetSum - root.val, innerString, resultString );
             findPathUsingListOfStrings(root.right ,targetSum - root.val, innerString, resultString );

//             int stringLength = innerString.length();
//             System.out.println("InnerString before : " + innerString);
//             innerString = innerString.substring(0, stringLength - 1);
//             System.out.println("InnerString after : " + innerString);

             return resultString;
         }
}
