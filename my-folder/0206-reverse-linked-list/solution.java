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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode dummy = head;
        while(dummy != null){
            curr = dummy;
            dummy = dummy.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;        
    }
}

// 1 -> 2 -> 3 -> 4 -> 5
// prev = null
// curr = head



