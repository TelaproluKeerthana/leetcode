class Solution {
    public String reorganizeString(String s) {
        int len = s.length();
        int[] freqArray = new int[26];
        for(int idx:s.toCharArray()){
            freqArray[idx - 'a']++;
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxChar = 0;
        for(int i= 0; i < 26; i++){
            if(freqArray[i] > maxFreq){
                maxFreq = freqArray[i];
                maxChar = i;
            }
        }

        if(maxFreq  > (len + 1) / 2) return "";

        char[] res = new char[len];
        int idx = 0;
        
        // we're placing characters all over the result leaving a gap between
        while(freqArray[maxChar] > 0){
            res[idx] = (char) (maxChar + 'a');
            idx += 2;
            freqArray[maxChar]--;
        }

        // now we need to place the remaining characters into the result array
        for(int i = 0; i < 26; i++){
            while(freqArray[i] > 0){
                // reset idx to 1
                if(idx >= len){
                    idx =  1;
                }
                res[idx] = (char)(i + 'a');
                idx += 2;
                freqArray[i]--;
            }
        }

        return new String(res);




    }
}
