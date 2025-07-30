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
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        lengthOfBinaryTree(root);
        return diameter;
    }

    private int lengthOfBinaryTree(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftSTLen = lengthOfBinaryTree(node.left);
        int rightSTLen = lengthOfBinaryTree(node.right); 
        diameter = Math.max(diameter, leftSTLen + rightSTLen);
        return 1 + Math.max(leftSTLen, rightSTLen);
    }
}
