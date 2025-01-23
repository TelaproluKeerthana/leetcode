# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """
        if len(lists)==0 or not lists:
            return None
        while(len(lists)>1):
            reslis=[]
            for i in range(0,len(lists),2):
                lis1=lists[i]
                lis2=lists[i+1] if len(lists)>(i+1) else None
                reslis.append(self.mergelists(lis1,lis2)) 
            lists=reslis 
        return lists[0]  
    #lists to merge into the linkedlists
    def mergelists(self,list1,list2):
        tail=ListNode()
        dummy=tail
        while list1 and list2:
            if list1.val>list2.val:
                dummy.next=list2
                list2=list2.next
            else:
                dummy.next=list1
                list1=list1.next
            dummy=dummy.next
        if list1:
            dummy.next=list1
        if list2:
            dummy.next=list2
        return tail.next

            

        
