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
        // get mid node
        // reverse the nodes after the mid node
        // merge the nodes and return the first node

        ListNode currHead = head;
        ListNode slow = currHead, fast = currHead;
        while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;    
        }

        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode curr = secondHalf;
        ListNode prev = null;
        // reverse secondHalf
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        secondHalf = prev;
        ListNode firstHalf = currHead;
        while(secondHalf != null){
            ListNode temp = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp;
            firstHalf = temp;
            secondHalf = temp2;
        }

    }
}
