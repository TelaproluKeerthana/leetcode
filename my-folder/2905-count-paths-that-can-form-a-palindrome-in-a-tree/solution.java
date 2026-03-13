import java.util.*;

class Solution {

    public long countPalindromePaths(List<Integer> parent, String s) {

        int n = parent.size();
        List<List<int[]>> tree = new ArrayList<>();

        for (int i = 0; i < n; i++) tree.add(new ArrayList<>());

        for (int i = 1; i < n; i++) {
            tree.get(parent.get(i)).add(new int[]{i, s.charAt(i) - 'a'});
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        return dfs(0, 0, tree, map);
    }

    private long dfs(int node, int mask, List<List<int[]>> tree, Map<Integer, Integer> map) {

        long res = 0;

        for (int[] child : tree.get(node)) {

            int next = child[0];
            int c = child[1];

            int newMask = mask ^ (1 << c);

            res += map.getOrDefault(newMask, 0);

            for (int i = 0; i < 26; i++) {
                res += map.getOrDefault(newMask ^ (1 << i), 0);
            }

            map.put(newMask, map.getOrDefault(newMask, 0) + 1);

            res += dfs(next, newMask, tree, map);
        }

        return res;
    }
}
