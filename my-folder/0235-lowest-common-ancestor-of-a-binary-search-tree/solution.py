# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        mini = min(p.val, q.val)
        maxi = max(p.val, q.val)
        
        if root.val == p.val or root.val == q.val:
            return root

        if maxi < root.val:
            return self.lowestCommonAncestor(root.left, p, q)
        elif mini > root.val:
            return self.lowestCommonAncestor(root.right, p, q)
        else:
            return root

# [6,2,8,0,4,7,9,null,null,3,5]
# p = 2
# q = 4
# root = 6

