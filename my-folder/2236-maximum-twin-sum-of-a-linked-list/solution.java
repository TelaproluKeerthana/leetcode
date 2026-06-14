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
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode dummy = head;
        while(dummy != null){
            len++;
            dummy = dummy.next;
        }

        int half = len / 2;
        int idx = 0;

        ListNode d1 = head;
        for(int i = 0; i < half; i++){
            d1 = d1.next;
        }

        ListNode temp = d1;
        // reverse second half
        ListNode curr = temp;
        ListNode prev = null;
        while(curr != null){
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev;
       
        int maxTwinSum = 0;
        while(secondHalf != null){
            maxTwinSum = Math.max(maxTwinSum, firstHalf.val + secondHalf.val);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxTwinSum;
    }
}

// plan is get length of the list

// then partition two half 
// reverse second half 
// start computing the twin sums and return max sum
