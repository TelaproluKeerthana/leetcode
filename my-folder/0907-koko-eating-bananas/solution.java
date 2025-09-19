class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int currMax = 0;
    for (int pile : piles) {
      currMax = Math.max(currMax, pile);
    }

    int left = 1;
    int right = currMax;

    while (left < right) {
      int mid = left + (right - left) / 2;
      int currTimeTaken = 0;

      for (int pile : piles) {
        currTimeTaken += (pile + mid - 1) / mid; // ceiling division
      }

      if (currTimeTaken <= h) {
        right = mid; // try smaller speed
      } else {
        left = mid + 1; // need faster
      }
    }

    return left; 

    }    

}
