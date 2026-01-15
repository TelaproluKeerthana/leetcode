class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }

        return num % 9 == 0 ? 9 : num % 9;
    }
}

// num = 38
// if(num > 10){
//     take a sum variable
//     sum += num % 10
//     num = num / 10
// }

// sum = 8 
// num = 3

