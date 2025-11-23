class Solution {
    private Map<Integer, Boolean> memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new HashMap<>();
        memo.put(s.length(), true);
        return dfs(s, wordDict, 0);
    }

    private boolean dfs(String s, List<String> wordDict, int idx){
        if(memo.containsKey(idx)){
            return memo.get(idx);
        }

        for(String word : wordDict){
            if(idx + word.length() <= s.length() && s.substring(idx, idx + word.length()).equals(word)){
                if(dfs(s, wordDict, idx + word.length())){
                    memo.put(idx, true);
                    return true;
                }
            }
        }

        memo.put(idx, false);
        return false;
    }
}
