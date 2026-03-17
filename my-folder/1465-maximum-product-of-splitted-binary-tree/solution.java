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
    long total = 0;
    long maxProduct = 0;
    int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        // get totalSum 
        // get maxSumSubTree
        total = totalSum(root);
        computeSubArraySum(root);
        return (int)(maxProduct % MOD);
    }

    public int totalSum(TreeNode node){
        if(node == null) return 0;
        return node.val + totalSum(node.left) + totalSum(node.right);
    }

    public long computeSubArraySum(TreeNode node){
        if(node == null) return 0L; 
        long lst = computeSubArraySum(node.left);
        long rst = computeSubArraySum(node.right);

        long currSum = node.val + lst + rst;

        long product = currSum * (total - currSum);
        maxProduct = Math.max(product, maxProduct);
        return currSum;
    }

}
