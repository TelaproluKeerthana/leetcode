class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> Seen = new HashSet<>();
        while(n != 1 && !Seen.contains(n)){
            Seen.add(n);
            n = getSquares(n);
        }

        return n == 1; 
    }

    private int getSquares(int num){
        int lD = 0, totalSum = 0;
        while(num > 0){
            lD = num % 10;
            totalSum += lD * lD;
            num /= 10;
        }
        
        return totalSum;
    }
}
