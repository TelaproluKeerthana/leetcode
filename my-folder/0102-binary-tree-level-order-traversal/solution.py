# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        levels = []
        if not root:
            return levels
        self.dfs(root,levels, 0)
        return levels
    
    def dfs(self, node, levels, level):
        if len(levels) == level:
            levels.append([])
        levels[level].append(node.val)
        if node.left:
            self.dfs(node.left, levels, level + 1)
        if node.right:
            self.dfs(node.right, levels, level + 1)
    

        
