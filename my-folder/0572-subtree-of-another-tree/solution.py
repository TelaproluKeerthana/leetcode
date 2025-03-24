# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        if not root:
            return False
        
        if self.isSameTree(root,subRoot):
            return True
        
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)

    def isSameTree(self, node, subnode):
        if not subnode and not node:
            return True
    
        if node and subnode and node.val == subnode.val:
            return (self.isSameTree(node.left, subnode.left) and
             self.isSameTree(node.right, subnode.right))    
        return False
    
        
# dfs(3,4) -> true
# dfs(4,4) or dfs(5,4) -> true or 
# dfs(4,4) -> dfs(1,1) and dfs(2,2) -> true
#           -> dfs(1,1) -> dfs(null,null) and dfs(null,null) -> true and true
#           -> dfs(2,2) ->  true

            

        
