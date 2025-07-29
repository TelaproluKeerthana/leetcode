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
        // breadth first search
        int depth = 0;
        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        while(que.size() > 0){
            int currQueSize = que.size();
            for(int i = 0; i < currQueSize; i++){
                TreeNode curr = que.poll(); 
                if(curr.left != null){
                    que.offer(curr.left);
                }
                if(curr.right != null){
                    que.offer(curr.right);
                }
            }
            depth++;
        }

        return depth;


    }
}
