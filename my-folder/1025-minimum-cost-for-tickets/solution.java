class Solution {
    Set<Integer> isTravelNeeded = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, -1);
        for(int day : days){
            isTravelNeeded.add(day);
        }

        return solve(dp, days, costs, 1);
    }

    private int solve(int[] dp, int[] days, int[] costs, int currDay){
        if(currDay > days[days.length - 1]){
            return 0;
        }

        if(!isTravelNeeded.contains(currDay)){
            return solve(dp, days, costs, currDay + 1);
        }

        if(dp[currDay] != -1){
            return dp[currDay];
        }

        int oneDay = costs[0] + solve(dp, days, costs, currDay + 1); 
        int sevenDay = costs[1] + solve(dp, days, costs, currDay + 7);
        int thirtyDay = costs[2] + solve(dp, days, costs, currDay + 30);

        return dp[currDay] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
    }
}


// days <= (i + 6)
// [3, 4, 5, 6, 7, 8, 9]  

// days = [1,4,6,7,8,20]

//             1
//         [2, 8, 31]
//     [3, 9, 32][]
//         1 7 7 7 7 1
//         2 + 7 + 2 = 11

// one day pass = 2
// costs = [2, 7, 15]

//         [7                 ] 2  2  2   2   2
// days = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31]
// costs = [2, 7, 15]
