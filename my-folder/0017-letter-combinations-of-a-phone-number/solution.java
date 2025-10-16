class Solution {
    Map<Integer, String> directory = new HashMap<>();;
    List<String> res = new ArrayList<>();;
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return res;
        directory.put(2, "abc");
        directory.put(3, "def");
        directory.put(4, "ghi");
        directory.put(5, "jkl");
        directory.put(6, "mno");
        directory.put(7, "pqrs");
        directory.put(8, "tuv");
        directory.put(9, "wxyz");
 
        if(digits.length() == 1){
            int curr = digits.charAt(0) - '0';
            String letters = directory.get(curr);
            for(char letter : letters.toCharArray()){
                res.add(String.valueOf(letter));
            }
            return res;
        }
        
        dfs(0, "", digits);
        return res;
    }

    private void dfs(int idx, String path, String digits){
        if(path.length() == digits.length()){
            res.add(path);
            return;
        }

        int curr = digits.charAt(idx) - '0';
        String letters = directory.get(curr);
        for(char letter : letters.toCharArray()){
            dfs(idx + 1, path + letter, digits);
        }

    }
}

// 2 - 9 digits 
// digits = 2323

// ab ae af bd be bf ce cf cd

// do dfs on all the digits

