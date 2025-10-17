class Solution {
    public boolean makesquare(int[] matchsticks) {
        int total = Arrays.stream(matchsticks).sum();
        if(total % 4 != 0){
            return false;
        }

        int length = total / 4; //each side length to make the square
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int[] sides = new int[4];
        return dfs(0, length, matchsticks, sides);

    }

    private boolean dfs(int idx, int length, int[] matchsticks, int[] sides){
        if(idx == matchsticks.length){
            return true;
        }

        for(int i = 0; i < 4; i++){
            if(matchsticks[idx] + sides[i] <= length){
                sides[i] += matchsticks[idx];
                if(dfs(idx + 1, length, matchsticks, sides)) return true;
                sides[i] -= matchsticks[idx];
            }

            if(sides[i] == 0) break;
        }

        return false;
    }

     private void reverse(int[] matchsticks) {
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
    }
}


