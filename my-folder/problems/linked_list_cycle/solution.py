# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False
        ptr1=head
        ptr2 = head
        while ptr2.next and ptr2.next.next:
            ptr1= ptr1.next
            ptr2 = ptr2.next.next
            if ptr1 is ptr2:
                return True
        
        return False

                 