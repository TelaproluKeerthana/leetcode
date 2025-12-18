class Solution {
    public int numOfWays(int n) {
        int mod = (int) (1e9 + 7);

        long color2 = 6;
        long color3 = 6;

        for(int i = 2; i <= n; ++i){
            long tempColor3 = color3;
            color3 = (2 * color2 + 2 * color3) % mod;
            color2 = (2 * tempColor3 + 3 * color2) % mod;
        }

        return (int) (color3 + color2) % mod;  
    }
}
