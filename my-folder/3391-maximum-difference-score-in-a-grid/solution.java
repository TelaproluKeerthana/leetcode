class Solution {
    public int maxScore(List<List<Integer>> grid) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(0).size(); j++){
                int maxi = Integer.MAX_VALUE;
                if(i == 0 && j == 0) continue;
                if(i != 0) maxi = Math.min(maxi, grid.get(i - 1).get(j));
                if(j != 0) maxi = Math.min(maxi, grid.get(i).get(j - 1));
                ans = Math.max(ans, grid.get(i).get(j) - maxi);
                grid.get(i).set(j, Math.min(grid.get(i).get(j), maxi));
            }
        }

        return ans;
    }
}
