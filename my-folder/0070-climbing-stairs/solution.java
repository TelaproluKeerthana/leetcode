class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int curr = 2;
        int prev = 1;
        for(int i = 3; i <= n; i++){
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
    
    return curr;
    }
}

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





