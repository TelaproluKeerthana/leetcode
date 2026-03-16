class Solution {
    public int minOperations(int n) {
        int totalOps = 0;
        
        while(n != 0){
        int x = (int)Math.floor(Math.log(n) / Math.log(2));
        System.out.println(x);
        int temp1 = 1 << x;
        int temp2 = 1 << (x + 1);

        int lowerDifference = n - temp1;
        int higherDifference = temp2 - n;

        if(higherDifference  <=  lowerDifference){
            n = higherDifference;
        }
        else{
            n = lowerDifference;
        }

            totalOps += 1;
        }

        // get which value is closer to the power 
        // 39 - 32 or 64 - 39
        // which 
        return totalOps;
    }
}

// -> either subtract or add to n - 2^x value and return in how many operations you can make it 0
// 2 ^ x is closer to n 

// 2 ^ x - n  

