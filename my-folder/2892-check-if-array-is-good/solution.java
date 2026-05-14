class Solution {
    public boolean isGood(int[] nums) { 

        int maxi = 0;
        for(int num : nums){
            if(num > maxi){
                maxi = num;
            }
        }

        int[] freq = new int[201];
        for(int num : nums){
            freq[num]++;
        }

        for(int i = 1; i < maxi ; i++){
            if(freq[i] != 1){
                return false;
            }
        }

        return freq[maxi] == 2;   
    }
}
