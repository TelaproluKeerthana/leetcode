class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result; // return empty list if root is null
        }

        Queue<TreeNode> lot = new ArrayDeque<>();
        lot.offer(root);

        while (!lot.isEmpty()) {
            int length = lot.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                TreeNode curr = lot.poll();
                currentLevel.add(curr.val);

                if (curr.left != null) {
                    lot.offer(curr.left);
                }
                if (curr.right != null) {
                    lot.offer(curr.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}

