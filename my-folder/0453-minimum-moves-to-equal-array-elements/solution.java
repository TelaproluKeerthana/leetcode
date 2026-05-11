class Solution {
    public int minMoves(int[] nums) {
      int min = Arrays.stream(nums).min().getAsInt();
    
      int total = 0;
      for(int num : nums){
            total  += num - min;
      } 

      return total;  
    }
}
