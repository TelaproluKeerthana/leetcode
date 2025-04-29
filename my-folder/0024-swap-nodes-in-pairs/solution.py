# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, curr = dummy, head
        
        # making sure you have 2 nodes to point each other
        while curr and curr.next:
            # saving the nodes for later
            nextPair = curr.next.next
            second = curr.next

            # reversing
            second.next = curr
            curr.next = nextPair
            prev.next = second

            #setting pairs
            prev = curr
            curr = nextPair

        return dummy.next
            



        
