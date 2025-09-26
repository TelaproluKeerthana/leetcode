class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] diff = new int[n];
        int total = 0;

        // Step 1: Build diff and calculate total
        for (int i = 0; i < n; i++) {
            diff[i] = gas[i] - cost[i];
            total += diff[i];
        }

        // Step 2: If impossible
        if (total < 0) return -1;

        // Step 3: Build prefix sums and find min prefix
        int prefix = 0;
        int minPrefix = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            prefix += diff[i];
            if (prefix < minPrefix) {
                minPrefix = prefix;
                minIndex = i;
            }
        }

        // Step 4: Answer is right after min decline
        return (minIndex + 1) % n;
    }
}

