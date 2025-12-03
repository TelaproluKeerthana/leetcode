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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null){
            return true;
        }

        if(root == null && subRoot != null){
            return false;
        }

        if(subRoot == null){
            return true;
        }

        if(isSametree(root, subRoot)){
           return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSametree(TreeNode rn, TreeNode srn){
        if(rn == null && srn == null){
            return true;
        }

        if((rn == null && srn != null) || (rn != null && srn == null)){
            return false;
        }

        if(rn.val == srn.val){
            return isSametree(rn.left, srn.left) && isSametree(rn.right, srn.right);
        }

        return false;
    }
}
