class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
        List<Character>  validateParams = new ArrayList<>();
        for(int idx = 0; idx < s.length(); idx++){
            char curr = s.charAt(idx);
            if(pairs.containsKey(curr)){
                if(validateParams.isEmpty() || validateParams.get(validateParams.size() - 1) != pairs.get(curr)){
                    return false;
                }
                validateParams.remove(validateParams.size() - 1);
            }
            else{
                validateParams.add(curr);
            }
        }

        return validateParams.isEmpty();
    }
}
