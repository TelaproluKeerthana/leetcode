class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int prevClimb = 1;
        int currClimb = 2;
        for(int i = 3; i <= n; i++){
            int temp = currClimb;
            currClimb = prevClimb + currClimb;
            prevClimb = temp;
        }

        return currClimb;
    }
}

// 3 
// 1 + 2

// // n = 4
// curr = 2
// prev = 1
// ---
// curr = 2 + 1
// prev = 2

// -----
// curr = 3
// prev = 2

// -----

// 4  curr = 5
//    prev = 3
// 1 1 1 1
// 1 2 1
// 1 1 2
// 2 2 
// 2 1 1

// 5 curr 8 prev 5
// 1 1 1 1 1
// 1 2 1 1 
// 1 1 1 2
// 2 1 1 1
// 1 1 2 1
// 2 2 1
// 2 1 2
// 2 2 1





