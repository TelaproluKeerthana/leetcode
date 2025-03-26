# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        if not preorder and not inorder:
            return None
        inorder_map = defaultdict(int)
        for i in range(len(inorder)):
            inorder_map[inorder[i]] = i
        newList = TreeNode(preorder[0], None, None)
        mid = inorder_map[preorder[0]]
        newList.left = self.buildTree(preorder[1 : mid + 1], inorder[ : mid])
        newList.right = self.buildTree(preorder[mid + 1 : ], inorder[mid + 1: ])

        return newList
        




# preorder = [3,9,20,15,7]
            
# inorder = [9,3,15,20,7]
                   
