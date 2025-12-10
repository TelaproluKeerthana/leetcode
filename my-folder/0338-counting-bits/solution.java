class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        if(n == 0){
            return res;
        }
        res[0] = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            int currnum = i;
            while(currnum > 0){
                currnum = currnum & currnum - 1;
                cnt++;
            }
            res[i] = cnt;
        }

        return res;
    }
}




