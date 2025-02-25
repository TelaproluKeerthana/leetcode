# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameter=0
        def len_st(node):
            if not node:
                return 0 
            left=len_st(node.left)
            right=len_st(node.right)
            self.diameter=max(self.diameter,left+right) # computes the max of lst+rst and diameter and stores in the diameter
            return max(left,right)+1 #returns the height of maxheight of lst and rst +1
        len_st(root)
        return self.diameter

        
