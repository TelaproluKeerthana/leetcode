class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 1;
        int cnt1 = 0, cnt2 = 0;
        
        // by the end you will have 2 candidates whose
        for(int num : nums){
            if(c1 == num){
                cnt1++;
            } else if(c2 == num){
                cnt2++;
            }  else if(cnt1 == 0){
                c1 = num;
                cnt1 = 1;
            } else if(cnt2 == 0){
                c2 = num;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }


        // check the counts of c1 anc c2 
        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums){
            if(num == c1) cnt1++;
            else if(num == c2) cnt2++;
        }

        List<Integer> result = new ArrayList<>();
        int midLen = nums.length / 3;
        if(cnt1  > midLen){
            result.add(c1);
        }
        if(cnt2  > midLen){
            result.add(c2);
        }

        return result;
    }
}


// for any array there can be atmost 2 candidates who have > n/3 occurances

