class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int cnt = 0;
        for(int num : nums){
            if(cnt == 0){
                majorityElement = num;
            }

            if(majorityElement == num){
                cnt++;
            }
            else{
                cnt--;
            }
            
        }

        return majorityElement;
    }
}

// 3 == n
