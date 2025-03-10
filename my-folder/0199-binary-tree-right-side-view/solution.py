# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        #go with level order traversal
        #last element in every level will be the ride side view
        if not root:
            return []
        queue = deque([])
        queue.append(root)
        output = []
        while queue:
            length_queue = len(queue)
            for _ in range(length_queue):
                node = queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            output.append(node.val)
        return output



        
