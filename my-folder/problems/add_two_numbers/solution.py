# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        newList=ListNode()
        carry=0
        curr=newList

        while l1 or l2 or carry:
            d1=l1.val if l1 else 0
            d2=l2.val if l2 else 0
            add2=d1+d2+carry
            carry=add2//10
            digi=add2%10
            curr.next=ListNode(digi)
            curr=curr.next
            if l1:l1=l1.next
            if l2:l2=l2.next
        return newList.next
        