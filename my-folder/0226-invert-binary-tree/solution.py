# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return
        node = root
        node.left, node.right = node.right, node.left

        self.invertTree(node.left)
        self.invertTree(node.right)

        return root

        
# dry run:
# [4,2,7,1,3,6,9]
  

