class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = Long.MAX_VALUE;
        long ans = 0;
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(canRepair(ranks, cars, mid)){
                right = mid - 1;
                ans = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return ans;    
    }
// -> total time = (rank * cars * cars)
    private boolean canRepair(int[] ranks, int cars, long time){
        long totalCars = 0;
        for(int rank : ranks){
            long currCars =  (long)Math.sqrt((double)time / rank);
            totalCars += currCars;
            if(totalCars >= cars){
                return true;
            }        
        }

        return false;
    }
}
