# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack=[]
        res=[]
        last_visited = None
        curr=root
        while curr or stack:
            while curr:
                stack.append(curr)
                curr=curr.left
            peek_node = stack[-1]

        # If the right child is None or already visited, visit the node
            if not peek_node.right or peek_node.right == last_visited:
                res.append(peek_node.val)
                last_visited = stack.pop()
            else:
                curr = peek_node.right
        return res

        