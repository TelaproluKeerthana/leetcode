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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy, curr = head;
        while(curr != null && curr.next != null){
            ListNode nxtNode = curr.next.next;
            ListNode nxt = curr.next;

            nxt.next = curr;
            curr.next = nxtNode;
            prev.next = nxt;

            prev = curr;
            curr = nxtNode;
        }

       return dummy.next; 
    }
}

// // 1 -> 2 -> 3 -> 4
//    curr


//    1 -> 2

//    ListNode nxtNode = 3
//    nxt =  2







