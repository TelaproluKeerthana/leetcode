class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str:strs){
            int[] key = new int[26];
            for(char c : str.toCharArray()){
                key[c - 'a'] += 1;
            }
            String keyStr = Arrays.toString(key);
            anagrams.computeIfAbsent(keyStr, k -> new ArrayList<>()).add(str);   
        }
        return new ArrayList<>(anagrams.values());
    }
}
