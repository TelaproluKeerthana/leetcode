class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 0;
        ListNode dup = head;

        while (dup != null) {
            length++;
            dup = dup.next;
        }

        k = k % length;
        if (k == 0) return head;

        int stepsToNewTail = length - k - 1;

        ListNode currHead = head;

        while (stepsToNewTail > 0) {
            currHead = currHead.next;
            stepsToNewTail--;
        }

        ListNode newHead = currHead.next;
        currHead.next = null;

        ListNode dummyHead = newHead;
        while (dummyHead.next != null) {
            dummyHead = dummyHead.next;
        }

        dummyHead.next = head;

        return newHead;
    }
}
