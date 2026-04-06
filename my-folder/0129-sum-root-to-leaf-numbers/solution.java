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
    int totalSum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }

        dfs(root, 0);
        return totalSum;
    }

    public void dfs(TreeNode node, int pathSum){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            pathSum = (pathSum * 10) + node.val;
            totalSum += pathSum;
            return;
        }

        dfs(node.left, (pathSum * 10) + node.val);
        dfs(node.right, (pathSum * 10) + node.val);
    }
}

// dfs(root, 0)
//                   root
//             left       right
//         l.l    l.r    r.l   r.r
// dfs(4, 0)
// dfs(9, 4) -done this level  dfs(0, 4)
// dfs(5, 13) dfs(1, 13)      
           
// totalSum = 18 + 14 + 4 
//        4
//     9       0
//   5   1   


