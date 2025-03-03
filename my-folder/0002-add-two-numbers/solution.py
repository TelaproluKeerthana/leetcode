# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry_over = 0
        new_head = ListNode(0, None)
        sum_list_head = new_head
        while l1 or l2 or carry_over:
            
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            value = val1 + val2 + carry_over

            carry_over = value // 10
            new_head.next = ListNode(value % 10, None)
            new_head = new_head.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        return sum_list_head.next
        

                

        
