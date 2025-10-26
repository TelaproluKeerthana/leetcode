class Solution {
    public int bestClosingTime(String customers) {
        int score = 0;
        int maxScore = 0;
        int bestTime = 0;
        for(int i = 0; i < customers.length(); i++){
            char curr = customers.charAt(i);
            if(curr == 'Y') score++; 
            else score--;

            if(score > maxScore){
                maxScore = score;
                bestTime = i + 1;
            }  
        }

        return bestTime;
    }
}
