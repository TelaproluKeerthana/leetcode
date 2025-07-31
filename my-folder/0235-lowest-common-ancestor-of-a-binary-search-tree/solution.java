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
        int maximum = Math.min(p.val, q.val);
        int minimum = Math.max(p.val, q.val); 

        if(p.val == root.val || q.val == root.val ){
            return root;
        }
        if(root.val < maximum){
            // search right sub tree
            return lowestCommonAncestor(root.right, p, q);
        }

        else if(root.val >= minimum){
            // search left sub tree
            return lowestCommonAncestor(root.left, p, q);
        }

        else{
            return root;
        }
        
    }
}
