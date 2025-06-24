class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        // if number is less than 2 it cant have any more squares than itself
        int left = 2;
        int right = x / 2;
        while(left <= right){
            int pivot = left  + (right - left) / 2;
            long num = (long)pivot * pivot;
            if(num > x){
                right = pivot - 1;
            }
            else if(num < x){
                left = pivot + 1;
            }
            else{
                return pivot;
            }
        }
        // if no exact square found then we return the integer part of square number
        return right;
    }
}
