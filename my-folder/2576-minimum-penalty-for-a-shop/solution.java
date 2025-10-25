class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] yays = new int[n + 1];
        int[] nays = new int[n + 1];
        int idx = 1;
        if(customers.charAt(0) == 'Y'){
            yays[0] = 1;
            nays[0] = 0;
        }
        else{
            nays[0] = 1;
            yays[0] = 0;
        }
        // for (int i = 1; i <= n; i++) {
        // char c = customers.charAt(i - 1);        
        // yays[i] = yays[i - 1];
        // nays[i] = nays[i - 1];

        // if (c == 'Y') {
        //     yays[i]++;
        // } else {
        //     nays[i]++;
        // }
        // }
        for (int i = 1; i <= n; i++) {
            char c = customers.charAt(i - 1);
            yays[i] = yays[i - 1] + (c == 'Y' ? 1 : 0);
            nays[i] = nays[i - 1] + (c == 'N' ? 1 : 0);
        }

        int minPenality = Integer.MAX_VALUE;
        int bestHour = 0;

        for(int i = 0; i <= n; i++){
                int penality = nays[i] + (yays[n] - yays[i]);
                if(penality < minPenality){
                    minPenality = penality;
                    bestHour = i;
                }
        }
    return bestHour;
}
}




// y = [1 2 2 3]
// n = [0 0 1 0]

//      1  2 1 3


