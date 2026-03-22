import java.util.*;

class Solution {
    public boolean gcdSort(int[] nums) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);
        
        DSU dsu = new DSU(max + 1);
        
        boolean[] exists = new boolean[max + 1];
        for (int x : nums) exists[x] = true;
        
        for (int i = 2; i <= max; i++) {
            for (int j = i + i; j <= max; j += i) {
                if (exists[j]) {
                    dsu.union(i, j);
                }
            }
        }

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                if (dsu.find(nums[i]) != dsu.find(sortedNums[i])) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

class DSU {
    int[] parent;
    public DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    public int find(int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent[i]); // Path compression
    }
    public void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) parent[rootI] = rootJ;
    }
}
