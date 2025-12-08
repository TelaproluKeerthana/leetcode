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
    int maxPS = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        dfs(root);
        return maxPS;
    }

    private int dfs(TreeNode node){
        if(node == null){
            return 0;
        }

        int lst = Math.max(dfs(node.left), 0);
        int rst = Math.max(dfs(node.right), 0);
        
        maxPS = Math.max(maxPS, node.val + lst + rst);

        return node.val + Math.max(lst, rst);
    }
}

//            -10
//         9       20
//             15      7
// maxps = x - 9 - 42(remains 42)
// = dfs(-10) -> -10  + max(9, 35) -> returns 25 -> by end of program we return whichever is the maximum pathsum
//   lst = max(dfs(9), 0) -> returns 9
//   rst = max(dfs(20), 0) -> returns 35 
//                            dfs(15) - 15 
//                            dfs(7) - 7

