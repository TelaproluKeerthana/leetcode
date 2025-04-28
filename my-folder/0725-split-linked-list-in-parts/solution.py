# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        ans = [None] * k
        # divided to k parts


        temp = head
        length = 0
        while temp:
            temp = temp.next
            length += 1
        
        unequal_parts = length % k
        part_size = length // k

        curr = head
        prev = curr

        for i in range(k):
            new_part = curr
            curr_size = part_size
            if unequal_parts > 0:
                unequal_parts -= 1
                curr_size += 1
            
            j = 0
            while j < curr_size:
                prev = curr
                if curr is not None:
                    curr = curr.next
                j += 1

            if prev is not None:
                prev.next = None
            
            ans[i] = new_part

        return ans

    







        

        
