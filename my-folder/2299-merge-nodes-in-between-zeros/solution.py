# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp = head.next
        next_sum = temp
        
        while next_sum:
            count = 0
            while next_sum.val != 0:
                count += next_sum.val
                next_sum = next_sum.next
            
            temp.val = count # modify the existing val with count
            next_sum = next_sum.next # move the next pointer to continue further computation
            temp.next = next_sum
            temp = temp.next
        
        return head.next

        
