/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {


        if(root == null){
            return false;
        }


        Queue<TreeNode> Tq = new LinkedList<>();
        Queue<Integer> Vq = new LinkedList<>();

        Tq.offer(root);
        Vq.offer(root.val);


        while(!Tq.isEmpty()){


            TreeNode currNode = Tq.poll();
            int currentValue = Vq.poll();

            if(currNode.left == null && currNode.right == null){
                if(currentValue == targetSum){
                    return true;
                }
            }

            if(currNode.left != null){
                Tq.offer(currNode.left);
                Vq.offer(currentValue + currNode.left.val);
            }

            
            if(currNode.right != null){
                Tq.offer(currNode.right);
                Vq.offer(currentValue +  currNode.right.val);
            }

        } 



        return false;


    }
}