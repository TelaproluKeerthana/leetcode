# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        length=0  
        dummy=head
        while dummy:
            length+=1
            dummy=dummy.next
        mid=length//2
        counter=0
        while head:
            if(counter==mid):
                return head
            counter+=1
            head=head.next
        

# head = [1,2,3,4,5]     
#                 d
# length          5
# mid=2
#         h         
# c=3         
        
