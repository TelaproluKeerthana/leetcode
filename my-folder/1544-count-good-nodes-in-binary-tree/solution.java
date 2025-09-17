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
    public int goodNodes(TreeNode root) {
        return totalGoodNodes(root, root.val);
    }

    private int totalGoodNodes(TreeNode node, int maxValue){
        if(node == null){
            return 0;
        }
        
        int good = 0;
        if(maxValue <= node.val){
            good = 1;
        }

        good += totalGoodNodes(node.left, (Math.max(node.val, maxValue)));
        good += totalGoodNodes(node.right, (Math.max(node.val, maxValue)));
        return good;
    }
}
