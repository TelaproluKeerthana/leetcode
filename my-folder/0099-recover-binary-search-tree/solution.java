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
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);

        if(prev != null && prev.val > node.val){
            if(first == null){
                first = prev;
            }

            second = node;
        }

        prev = node;

        inorder(node.right);
    }
}


// property is that all the elements to the left of the root must be smaller than the root 
// lst must be less than the root 
// rst must be greater than the root
// find which two elements doesn't follow the order and swap the values of those nodes, keeping the structure intact.
