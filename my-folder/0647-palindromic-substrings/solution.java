class Solution {
    public int countSubstrings(String s) {
        List<String> substrings = generateSubStrings(s);
        int subs = 0;
        for(int idx = 0; idx < substrings.size(); idx++){
            if(ispalindrome(substrings.get(idx))){
                subs += 1;
            }
        }
        return subs;
    }

    private List<String> generateSubStrings(String s){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                res.add(s.substring(i, j + 1));
            }
        }

        return res;
    }

    private boolean ispalindrome(String s){
        int right = s.length() - 1;
        int left = 0;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
// a ab abc b bc c
// // abc
//     i
//      j
//    a, b, c, ab, bc, ca, abc

