# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
        first=head
        prev=None
        while first:
            temp=first.next
            first.next=prev
            prev=first
            first=temp

        count=0
        dummy = ListNode(0)
        dummy.next=prev
        curr=dummy
        while curr.next:
            count+=1
            if(count==n):
                curr.next=curr.next.next
                break
            curr=curr.next
        
        revNode=None
        curr=dummy.next
        while curr:
            temp=curr.next
            curr.next=revNode
            revNode=curr
            curr=temp
        return revNode

        

        
        
