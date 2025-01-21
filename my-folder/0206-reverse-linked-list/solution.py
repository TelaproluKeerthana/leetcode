# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        curr,prev=head,None
        while curr:
            tmp=curr.next #store next address of the curr
            curr.next=prev #changing the direction of link
            prev=curr #set prev to curr's value
            curr=tmp #set curr to with the next value of curr
        return prev

        
