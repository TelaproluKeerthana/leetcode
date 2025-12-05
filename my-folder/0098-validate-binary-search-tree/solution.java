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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBST(TreeNode node, long mini, long maxi){
        if(node == null){
            return true;
        }

        if(node.val <= mini || node.val >= maxi){
            return false;
        }

        return isBST(node.left, mini, node.val) && isBST(node.right, node.val, maxi); 
    }
}
