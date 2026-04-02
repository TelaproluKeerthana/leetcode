class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int totalSum = 0;
        for(int roll : rolls){
            totalSum += roll;
        }

        int totalLen = rolls.length + n;

        int diff = (totalLen * mean) - totalSum;
        if (diff < n || diff > 6 * n) {
            return new int[0];
        }

        int equals = diff / n;
        int remains = diff % n;

        // i need to check if diff can be split into n quarters
        int[] res = new int[n];

        for(int i = 0; i < res.length; i++){
            res[i] = equals;
        }
        
        for(int i = 0; i < remains; i++){
            res[i]++;
        }

        return res;
    }
}


// rolls = [3,2,4,3], mean = 4, n = 2

// 3 + 2 + 4 + 3 + x
// 12  +  x 
// --------   = 4
//   6             
// [1, 5, 6] mean = 3, n = 4 

// 12 + x 
// ------  = 3
// 7

// 3 + 2 + 2 + 2
// 21 - 12 = 9

// [1, 2, 3, 4, 5, 6]
