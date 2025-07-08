/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public Node copyRandomList(Node head) {
        Map<Node, Node> copyList = new HashMap<>();
        copyList.put(null, null);
        Node curr = head;
        while(curr != null){
            Node copy = new Node(curr.val);
            copyList.put(curr, copy);
            curr = curr.next;
        }

        Node cur = head;
        while(cur != null){
            Node copy = copyList.get(cur);
            copy.next = copyList.get(cur.next);
            copy.random = copyList.get(cur.random);
            cur = cur.next; 
        }
        
        return copyList.get(head);
    }
}
