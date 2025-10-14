class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {
            int size = que.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = que.poll();

                if (prev != null) {
                    prev.next = curr;  // connect previous node to current
                }
                prev = curr;  // move the pointer

                if (curr.left != null) que.offer(curr.left);
                if (curr.right != null) que.offer(curr.right);
            }

            // last node in the level points to null
            prev.next = null;
        }

        return root;
    }
}

