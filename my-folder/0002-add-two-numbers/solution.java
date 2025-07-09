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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }

        List<Integer> list2 = new ArrayList<>();
        while(l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }

        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0;
        int i = 0;
        while( i  < list1.size() || i < list2.size() || carry != 0){
            int val1 = i < list1.size() ? list1.get(i) : 0;
            int val2 = i < list2.size() ? list2.get(i) : 0;
            int sum = val1 + val2 + carry;
            res.add(sum % 10);
            carry = sum / 10;
            i++;   
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int num:res){
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}
