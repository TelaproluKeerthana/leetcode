class Solution {
    int memo[][];
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        memo = new int[coins.length + 1][amount + 1];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }

        return dfs(0, amount, coins);
    }

    public int dfs(int idx, int amount, int[] coins){
        if(amount == 0){
            return 1;
        }

        if(idx >= coins.length){
            return 0;
        }

        if(memo[idx][amount] != -1){
            return memo[idx][amount];
        }
        
        int res = 0;
        if(amount >= coins[idx]){
            res = dfs(idx + 1, amount, coins);
            res += dfs(idx, amount - coins[idx], coins);
        }

        memo[idx][amount] = res;
        return memo[idx][amount];
    }
}

