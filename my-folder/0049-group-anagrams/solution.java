class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] key = new int[26];
            for(int i = 0; i < str.length(); i++){
                char curr = str.charAt(i);
                key[curr - 'a'] += 1;
            }

            String keyStr = Arrays.toString(key);
            map.computeIfAbsent(keyStr, k -> new ArrayList()).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> val : map.values()){
            result.add(val);
        }

        return result;

    }
}

// ["eat","tea","tan","ate","nat","bat"]

