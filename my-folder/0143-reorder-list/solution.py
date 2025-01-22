# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        #use slow-fast pointers to know the start point of the array
        slow=head
        fast=head.next
        while(fast and fast.next):
            #to check fast is not null and we didn't reach the end of the array
            slow=slow.next
            fast=fast.next.next
        #second stores the elements in reverse order from the secondhalf
        second=slow.next
        slow.next=prev=None
        while second:
            tmp=second.next
            second.next=prev
            prev=second
            second=tmp
        
        first,second=head,prev
        while second:
            tmp1=first.next
            tmp2=second.next
            first.next=second
            second.next=tmp1
            first=tmp1
            second=tmp2

        #creating two variable of none to store the previous link details and also updating slow.next to None 


        
