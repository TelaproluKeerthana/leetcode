# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        ll = ListNode(0)
        new_list = ll
        temp1 = list1
        temp2 = list2
        while temp1 and temp2:
            if(temp1.val > temp2.val):
                ll.next = temp2
                temp2 = temp2.next
            else:
                ll.next = temp1
                temp1 = temp1.next
            
            ll = ll.next
        
        if temp1:
            ll.next = temp1

        if temp2:
            ll.next = temp2
        
        return new_list.next


            

# 1-> 2 -> 4
#     h
# 1 -> 3   -> 4
# h

# ll - 1 ->
        
        
