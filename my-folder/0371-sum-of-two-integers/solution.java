class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = (a & b) << 1; // for carry overs
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}

// 0001
// 0010
// ----

// 0010
// 0011
// ----
// 0010 << 1 = 0100 
        //     0001 
        //     ----
        //     0101

