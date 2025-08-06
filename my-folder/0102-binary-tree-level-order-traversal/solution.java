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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> lot = new ArrayDeque<>();
        lot.offer(root);
        while(!lot.isEmpty()){
            int length = lot.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i = 0; i < length; i++){
                TreeNode curr = lot.poll();
                currLevel.add(curr.val);
                if(curr.left != null){
                    lot.offer(curr.left);
                }
                if(curr.right != null){
                    lot.offer(curr.right);
                }
            }
            result.add(currLevel);
        }

        return result;
    }
}
