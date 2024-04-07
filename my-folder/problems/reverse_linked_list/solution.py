# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        newnode=head
        if head.next:
            newnode=self.reverseList(head.next)
            head.next.next=head
        head.next=None
        return newnode

        