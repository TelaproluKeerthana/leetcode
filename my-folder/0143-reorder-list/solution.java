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

       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }

       ListNode second = reverseList(slow.next);
       slow.next = null; // break the list after that node 

       ListNode first = head;
       while(second != null){
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;

        first.next = second;
        second.next = temp1;

        first = temp1;
        second = temp2;
       }
    }
    
    private ListNode reverseList(ListNode node){
        ListNode prev = null;
        while(node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        return prev;
    }
}
//      s
// 1 -> 2 -> 3 -> 4  null
//           f
//           s
// 1 -> 2 -> 3 -> 4 -> 5
//                     f
// Input: head = [1,2,3,4]
// 1 -> 2   null <- 3 <- 4
// h1                    h2
// get length of the list and when the mid value is reached, break the list from the half and reverse the second half 
// iterate the second half and reverse the nodes in second half
// then do this
// create dummynode 
// create curr = dummynode // copy node for traversal and list building 
// while(h2 != null)
// dummynode.next = h1
// h1 = h1.next
// dummynode = dummynode.next
// dummynode.next = h2 
// h2 = h2.next
// dummynode = dummynode.next

// while h1 != null
// dummynode.next = h1

// return curr.next and return the list
// Output: [1,4,2,3]
