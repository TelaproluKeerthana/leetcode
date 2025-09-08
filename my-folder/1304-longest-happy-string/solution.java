class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        int totalIterations = a + b + c;
        int curra = 0, currb = 0, currc = 0;
        
        for(int i = 0; i < totalIterations; i++){
            if((a >= b && a >= c && curra != 2) || (a  > 0 && (currb == 2 || currc == 2))){
                res.append('a');
                a--;
                curra++;
                currb = 0;
                currc = 0;
            }
            else if((b >= a && b >= c && currb != 2) || (b > 0 && (currc == 2 || curra == 2))){
                res.append('b');
                b--;
                currb++;
                curra = 0;
                currc = 0;
            }
            else if((c >= a && c >= b && currc != 2) || (c > 0 && (curra == 2 || currb == 2))){
                res.append('c');
                c--;
                currc++;
                curra = 0;
                currb = 0;
            }
        }
    
    return res.toString();
    }
}
