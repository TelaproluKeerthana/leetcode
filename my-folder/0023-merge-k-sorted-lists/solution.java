/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode resList = new ListNode(0);

        for(ListNode list : lists){
            ListNode currhead = list;
            while(currhead != null){
                ListNode nextPtr = currhead.next;
                insertNode(resList, currhead);
                currhead = nextPtr;
            }
        }

        return resList.next;
    }

    private void insertNode(ListNode resList, ListNode node){
        ListNode prev = resList;
        ListNode curr = resList.next;
        
        // move until the node val is less than the 
        while(curr != null && curr.val <= node.val){
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = node;
        node.next = curr;
    }
}

// if(curr.val > currhead.val){
                //     prev.next = currhead;
                //     currhead = currhead.next;
                //     currhead.next = curr;
                //     ListNode prev = curr;
                //     curr = curr.next;    
                // }
                // // when both are equal
                // else if(curr.val == currhead.val){
                //  ListNode nxtPtr = curr.next;
                //  curr.next = currhead;
                //  currhead = currhead.next;
                //  currhead.next = nxtPtr;
                // }
                // // when the curr is small
                // else{
                //     curr = curr.next;
                // }

// resLis = 0
// reslist.next = 1 
// reslist.next.next = 4
// reslist.next.next.next = 5
//       list2  
//                          i
// [1, 4, 5], [1, 3, 4],[2, 6]
// currHead = 1 -> 4 -> 5
//                                             curr
//            1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
        //    return res list head
