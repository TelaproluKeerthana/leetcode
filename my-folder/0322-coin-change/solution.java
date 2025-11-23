class Solution {
    Map<Integer, Integer> store = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        int minCoins = dfs(coins, amount);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    private int dfs(int[] coins, int amount){
        if(amount == 0){
            return 0;
        }

        if(store.containsKey(amount)){
            return store.get(amount);
        }

        int res = Integer.MAX_VALUE;
        for(int coin : coins){
            if(amount - coin >= 0){
                int result = dfs(coins, amount - coin);
                if(result != Integer.MAX_VALUE){
                    res = Math.min(1 + result, res);
                }
                
            }
        }

        store.put(amount, res);
        return res;
    }
}

// coins = [1,2,5], amount = 11 
// 11 - 5 = 6
// c += 1
// make 6 with existing coins
// 6 - 5 = 1
// c += 1
// make 1 with existing coins
// 1 - 5 == 0
// 1 - 2 == 0
// 1 - 1 == 0 yes 
// c += 1

// return 3
