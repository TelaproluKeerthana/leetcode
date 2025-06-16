class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        getAll("",0, 0, n, result);
        return result;
    }

    private void getAll(String curr, int open, int close, int max, List<String> result){
        if(curr.length() == max * 2){
            result.add(curr);
            return;
        }
        if(open < max){
            getAll(curr + "(", open + 1, close, max, result);
        }
        if(close < open){
            getAll(curr + ")", open, close + 1, max, result);
        }
    }


}
