class Solution {
    public boolean canTransform(String start, String result) {
       int i = 0;
       int j = 0;
       int length = start.length();

       while(i < length || j < length){

            while (i < length && start.charAt(i) == 'X') i++;
            while(j < length && result.charAt(j) == 'X') j++;

            // case when both reached the end of the array
            if(i == length && j == length){
                return true;
            }

            // when one of the ptr reaches end of the array
            if(i == length || j == length){
                return false;
            }

            if(start.charAt(i) != result.charAt(j)){
                return false;
            }

            if (start.charAt(i) == 'L' && i < j) return false; // L can't move right
            if (start.charAt(i) == 'R' && i > j) return false; // R can't move left

            i++;
            j++;
       }

       return true;
    }
}
