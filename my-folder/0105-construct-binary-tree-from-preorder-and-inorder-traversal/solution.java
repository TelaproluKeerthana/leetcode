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
    Map<Integer, Integer> mapNodes;
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        mapNodes = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            mapNodes.put(inorder[i], i);
        }
        
        return buildNodes(preorder, 0, preorder.length - 1);
    }

    private TreeNode buildNodes(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }

        int root_val = preorder[preIndex++];
        TreeNode root = new TreeNode(root_val);

        int inorderIdx = mapNodes.get(root_val);

        root.left = buildNodes(preorder, left, inorderIdx - 1);
        root.right = buildNodes(preorder, inorderIdx + 1, right);

        return root;
    }

}

// pre - [3, 9, 20, 15, 7]
//        i
// in - [9, 3, 15, 20, 7]
      
