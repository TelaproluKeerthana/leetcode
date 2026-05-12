class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        // System.out.println(Arrays.deepToString(tasks));
        
        int energy = 0;
        int ans = 0;
        for(int[] task : tasks){
            int actual = task[0];
            int mini = task[1];


            if(energy < mini){
                ans += mini - energy;
                energy = mini;
            }

            energy -= actual;
        }

        return ans;
    }
}

// minStart = tasks[tasks.length - 1][1];
// maxEnd = 10000

// do bs 
// and solve the problem if we are able to complete all tasks 
// then check the values to the mid + 1 and see if you can do with that and return the last possible value of left with which we can complete the 
