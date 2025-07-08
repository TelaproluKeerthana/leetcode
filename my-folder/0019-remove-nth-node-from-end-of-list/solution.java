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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // get length of the list
        // traverse from beginning and remove that length - n element and return head
        
        ListNode dummy = head;
        int length = 0;
        while(dummy != null){
            dummy = dummy.next;
            length += 1;
        }

        if(length - n == 0){
            return head.next;
        }

        ListNode dummy2 = head;
        for(int i = 0; i < length; i++){
            if(i == length - n - 1){
                dummy2.next = dummy2.next.next;
                break;
            }
            dummy2 = dummy2.next;
        }

        return head;
    }
}
