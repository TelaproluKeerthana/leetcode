# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        node=newLL=ListNode()
        while list1 and list2:
            if list1.val>list2.val:
                newLL.next=list2 #assign the newll's next variable to list2 node
                list2=list2.next
            else:
                newLL.next=list1 #else assign it to list1's node
                list1=list1.next
            newLL=newLL.next # for every case move newLL pointing to nextvariable
        newLL.next= list1 or list2 #add the rest of list1 or list2 to the newLL
        return node.next#firstnode of the newLL 

