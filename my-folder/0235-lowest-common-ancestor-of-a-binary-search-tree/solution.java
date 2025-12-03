/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // find min of two nodes if its greater than root
        int minNode = Math.min(p.val, q.val);
        // find max btw two nodes if its less than root search lst
        int maxNode = Math.max(p.val, q.val);

        if(root.val == p.val || q.val == root.val){
            return root;
        }

        if(minNode > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else if(maxNode <= root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else{
            return root;
        }
         
    }
}
