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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || head.next == null || left == right) {
            return head;
        }

        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for(int i = 1; i < left; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode then = curr.next;

        for(int i = 0; i < right - left; i++){
            curr.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = curr.next;
        }

        return dummy.next;
    }
}
