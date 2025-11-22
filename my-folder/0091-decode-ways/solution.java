class Solution {
    public int numDecodings(String s) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 1);
        return dfs(s, 0, dp);
    }

    private int dfs(String s, int idx, Map<Integer, Integer> dp){
        if(dp.containsKey(idx)){
            return dp.get(idx);
        }

        if(s.charAt(idx) == '0'){
            return 0;
        }

        int res = dfs(s, idx + 1, dp);
        if(idx + 1 < s.length() && (s.charAt(idx) == '1' || s.charAt(idx) == '2' && s.charAt(idx + 1) < '7')){
                res += dfs(s, idx + 2, dp);
        }
        dp.put(idx, res);

        return res;
    } 

}
// dp = {
//     3 : 1
    //    2 : 1
    // 1 : 2
    // 0 : 

// }
// dfs(s, 0, dp); 
//    dfs(0) = dfs(1) + dfs(2) 2 + 1
//    res = dfs(s, 1, dp);
//    dfs(1) = dfs(2) + dfs(3) = 1 + 1
//    dfs(2) = dfs(3) = 1
//    res = dfs(s, 2, dp);
//    res = dfs(s, 3, dp) = 1;
// 226
// 2 2 6
// 2 26 
// 22 6

// 1 26


// 2 22 226 2 26 6

// 11106
// 01234
// dp ={
//     5 : 1
//     4 : 1

// }
// dfs(0) = dfs(1) + dfs(2) = 2
// dfs(1) = dfs(2) + dfs(3) = 1
// dfs(2) = dfs(3) + dfs(4) = 1
// dfs(3) = 0
// dfs(4) = dfs(5)  = 1
