# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isMirror(self,left,right):
        if not left and not right:
            return True #as both are empty and we can return True
        if (left==None or right==None):
            return False
        return (left.val==right.val) and self.isMirror(left.right,right.left) and self.isMirror(left.left,right.right)

    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.isMirror(root.left,root.right)
        
