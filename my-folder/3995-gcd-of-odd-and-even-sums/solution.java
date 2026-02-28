class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n * n, n * n + n);
    } 

    public int gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
