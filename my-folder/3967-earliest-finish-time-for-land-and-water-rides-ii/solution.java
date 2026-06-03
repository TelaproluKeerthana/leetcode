class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFirst = solve(landStartTime,landDuration, waterStartTime, waterDuration);

        int waterFirst = solve(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(landFirst, waterFirst);
    }

    private int solve(int[] s1, int[] e1, int[] s2, int[] e2){

        int finish1 = Integer.MAX_VALUE;
        for(int i = 0; i < s1.length; i++){
            finish1 = Math.min(finish1, s1[i] + e1[i]);
        }

        int finish2 = Integer.MAX_VALUE;
        for(int j = 0; j < s2.length; j++){
            finish2 = Math.min(finish2, Math.max(finish1, s2[j]) + e2[j]);
        }

        return finish2;
    }
}
