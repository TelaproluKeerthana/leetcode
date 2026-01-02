class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            freqMap.put(curr, i);
        }

        List<Integer> res = new ArrayList<>();
        int currMax = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
             currMax = Math.max(freqMap.get(curr), currMax);

            if(currMax == i){
                res.add(i - start + 1);
                start = i + 1;
            }
        }

        return res;
    }
}

