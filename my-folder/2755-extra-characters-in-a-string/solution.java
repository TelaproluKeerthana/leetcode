class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        // storing words in hashset for easier lookups
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 0);
        return  dfs(0, s, dp, dict);
    }

    private int dfs(int idx, String s, Map<Integer, Integer> dp, Set<String> dict){
        if(dp.containsKey(idx)){
            return dp.get(idx);
        }

        int res = 1 + dfs(idx + 1, s, dp, dict);
        for(int j = idx; j < s.length(); j++){
            if(dict.contains(s.substring(idx, j + 1))){
                res = Math.min(res, dfs(j + 1, s, dp, dict));
            }
        }
        dp.put(idx, res);
        return res;
    }
}
