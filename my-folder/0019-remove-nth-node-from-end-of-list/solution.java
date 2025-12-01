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

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(n >= 0){
            fast = fast.next;
            n -= 1;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
// one approach
// get length by iterating over the list and then iterate till n - k - 1 steps and move pointer to the next's next node.

// other approach 
// 1 -> 2 -> 3 -> 4 -> 5
// you want to remove the kth node from the end 
// so take slow fast ptrs and move the fast ptr n steps ahead to the slow ptr
// 1 -> 2 -> 3 -> 4 -> 5
//           f
// s
// n = 2, move f two steps and decr n till 0
// move fast until fast becomes null, move slow and fast till that point
//                          f
// 1 -> 2 -> 3 -> 5
//                (break link between 3 and 4 and point it to 5) 
//           s

// slow.next = slow.next.next
// s (break link connecting to 2)
// 1 -> 2
//     f
