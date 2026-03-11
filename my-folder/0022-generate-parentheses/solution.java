class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int op = 0, cp = 0;
        getAllParanthesis(0, 0, n, "", result);
        return result;
    }

    private void getAllParanthesis(int op, int cp, int n, String curr, List<String> result){
        if(curr.length() == n * 2){
            result.add(curr);
            return;
        }

        if(op < n) getAllParanthesis(op + 1, cp, n, curr + '(', result);
        if(cp < op) getAllParanthesis(op, cp + 1, n, curr + ')', result);

    }
}
