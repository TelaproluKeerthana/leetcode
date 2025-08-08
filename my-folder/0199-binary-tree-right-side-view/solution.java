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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int currSize = que.size();
            for(int i = 0; i < currSize; i++){
                
                TreeNode curr = que.poll();
                if(i == currSize - 1){
                    result.add(curr.val);
                }

                if(curr.left != null){
                    que.offer(curr.left);
                }

                if(curr.right != null){
                    que.offer(curr.right);
                }
            }
        }
        return result;
    }
}
