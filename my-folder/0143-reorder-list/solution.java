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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        int length = 0;
        ListNode dummy = head;
        while(dummy != null){
            dummy = dummy.next;
            length += 1;
        }

        int mid = (int)Math.ceil((double)length / 2);
        int cur = 0;
        ListNode dummy2 = head;
        while(cur < mid - 1){
            dummy2 = dummy2.next;
            cur += 1;
        }

        //now we need a reverse the second half to reorder
        ListNode curr = dummy2.next;
        dummy2.next = null;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        //reorder both lists together
        ListNode first = head;
        ListNode second = prev;

        while (first != null && second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            if (tmp1 == null) break; 
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
        
    }
}
