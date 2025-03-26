# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp = head
        new_ll = ListNode(0)
        new_head = new_ll
        while temp:
            if temp.val == 0:
                temp = temp.next
                curr = temp
                count = 0
                while curr and curr.val != 0:
                    count += curr.val
                    curr = curr.next
                if count != 0:
                    new_ll.next = ListNode(count)
                    new_ll = new_ll.next
                temp = curr
        
        return new_head.next


        
