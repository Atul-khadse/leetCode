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
    public int getMinimumDifference(TreeNode root) {

        List<Integer> value = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root != null){
            q.offer(root);
        }

        while(!q.isEmpty()){
            TreeNode currN = q.poll();

            value.add(currN.val);


            if(currN.left != null){
                q.offer(currN.left);
            }



            if(currN.right != null){
                q.offer(currN.right);
            }
        }


        Collections.sort(value);
    


        int minDff = Integer.MAX_VALUE;
        for(int i=1; i < value.size(); i++){
            int min = value.get(i) - value.get(i-1);
            minDff = Math.min(minDff, min);
        }


        return minDff;
        
    }
}