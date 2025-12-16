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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // find mid
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        // reverse the second Half
        ListNode prev = null;
        ListNode curr = secondHalf;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode front = head;
        ListNode end = prev;

        while(end != null){
            if(front.val != end.val) return false;

            front = front.next;
            end = end.next;
        }

        return true;
    }
}

// 1 -> 4 ->  4 -> 1 = initially its this way
// find mid 
// use slow fast pointers and starting at second half and compare if both values are the same
