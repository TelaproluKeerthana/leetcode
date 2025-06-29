class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canEat(mid, piles, h)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;
    }

    private boolean canEat(int minEat, int[] piles, int h){
        int timeToEat = 0;
        for(int pile:piles){
            timeToEat += pile / minEat;
            if(pile % minEat != 0) timeToEat += 1;
        }

        if(timeToEat <= h) return true;
    
    return false;
    }


}
