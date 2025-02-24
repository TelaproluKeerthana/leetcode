# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.x_parent=None
        self.y_parent=None
        self.x_depth=None
        self.y_depth=None
    def dfs(self,node,x,y,depth,parent):
        if node is None:
            return False
        if node.val==x:
            self.x_parent=parent
            self.x_depth=depth
        if node.val==y:
            self.y_parent=parent
            self.y_depth=depth
        self.dfs(node.left,x,y,depth+1,node)
        self.dfs(node.right,x,y,depth+1,node)

    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        if not root:
            return None
        if root.val==x or root.val==y:
            return False
        
        self.dfs(root,x,y,0,0)
        if self.x_parent==self.y_parent or self.x_depth!=self.y_depth:
            return False
        return True

        
