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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isLeftToRight = true;

        while(!q.isEmpty()){
            int sizeQ = q.size();
            List<Integer> curr = new ArrayList<>();
            
            for(int i=0; i<sizeQ; i++){
                TreeNode currNode = q.poll();

                if(isLeftToRight){
                        curr.add(currNode.val);
                }else{
                    curr.add(0,currNode.val);
                }

                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }

            res.add(curr);

            isLeftToRight = !isLeftToRight;

        }

        return res;

        
    }
}