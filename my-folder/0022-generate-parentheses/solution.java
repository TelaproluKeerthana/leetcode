class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        getAll("",0, n, result);
        return result;
    }

    private void getAll(String curr, int index, int n, List<String> result){
        if(curr.length() == n * 2){
            if(isValid(curr)){
                result.add(curr);
            }
            return;
        }

        getAll(curr + "(", index + 1, n, result);
        getAll(curr + ")", index + 1, n, result);
    }

    private boolean isValid(String curr){
        int balanced = 0;
        for(char c:curr.toCharArray()){
            if(c == '(') balanced += 1;
            else balanced -= 1; 
            if(balanced < 0) return false;
        }
        return balanced == 0;
    }


}
