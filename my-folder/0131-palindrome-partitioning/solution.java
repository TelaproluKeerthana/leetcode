class Solution {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
      result = new ArrayList<>();
      dfs(0, s, new ArrayList<>());
      return result;
    }

    private void dfs(int idx, String s, ArrayList<String> path){
        if(idx == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int curr = idx; curr < s.length(); curr++){
            if(isPalindrome(idx, curr, s)){
                path.add(s.substring(idx, curr + 1));
                dfs(curr + 1, s, path);
                path.remove(path.size() - 1);
            }
        }
    }

// check if each partition is a palindrome
    private boolean isPalindrome(int left, int right, String s){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
