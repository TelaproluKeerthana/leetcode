# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        levels = []
        if not root:
            return levels
        queue = deque()
        queue.append(root)
        while queue:
            len_que = len(queue) 
            new_res = []
            for _ in range(len_que):
                node = queue.popleft()
                new_res.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            
            levels.append(new_res)
        zigzaglevels = []
        for i,level in enumerate(levels):
            if(i%2):
                zigzaglevels.append(level[::-1])
            else:
                zigzaglevels.append(level)
        return (zigzaglevels)
                

                
