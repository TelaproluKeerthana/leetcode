class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int finish = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length; 
        for(int l = 0; l < n; l++){
            for(int j = 0; j < m; j++){
                int land = landStartTime[l] + landDuration[l];
                int land_water = Math.max(land, waterStartTime[j]) + waterDuration[j];

                finish = Math.min(finish, land_water);


                int water = waterStartTime[j] + waterDuration[j];

                int water_land = Math.max(water, landStartTime[l]) + landDuration[l];


                finish = Math.min(finish, water_land); 

            }
        }

         return finish;
    }
}


// sort start times

// [2, 8]
// end times = [4, 1]

