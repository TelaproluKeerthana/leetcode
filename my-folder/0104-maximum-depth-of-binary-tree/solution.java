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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

// maxDepth(3)
//      return 1 + (md(9), md(20)) 1 + max(1, 2) = 3

// md(9)
//     return 1 + max(0, 0) = 1
// md(20)
//     return 1 + max(md(15), md(7)) = 1 + max(1, 1) = 2
//      3
//  9       20
//       15      7
