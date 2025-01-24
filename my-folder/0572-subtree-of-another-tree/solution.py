# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSubtree(self, root, subRoot):
        """
        :type root: Optional[TreeNode]
        :type subRoot: Optional[TreeNode]
        :rtype: bool
        """
        if not subRoot:
            return True
        if not root:
            return  False
        if self.isSameTree(root,subRoot):
            return True
        return (self.isSubtree(root.left,subRoot) or self.isSubtree(root.right,subRoot))
        
    # def sameTree(self, newroot,subroot):
    #     if not newroot and not subroot:
    #         return  True
    #     if newroot and subroot and newroot.val==subroot.val:
    #         return (self.sameTree(newroot.left,subroot.left) and 
    #         (self.sameTree(newroot.right,subroot.right))
    #     return False
    def isSameTree(self,left,right):
        if not left and not right:
            return True
        if left and right and left.val==right.val:
            return (self.isSameTree(left.left,right.left) 
            and self.isSameTree(left.    right,right.right))
        return False

        
        
