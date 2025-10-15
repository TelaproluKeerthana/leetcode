class Solution {
    public boolean canTransform(String start, String result) {
        int left = 0, right = 0;
        int len = start.length();
        while(left < len || right < len){

            while(left < len && start.charAt(left) == 'X') left++;
            while(right < len && result.charAt(right) == 'X') right++;
            
            if(left == len && right == len){
                return true;
            }

            if(left == len || right == len){
                return false;
            }

            // look for early returns rather adding more cases 
            if(start.charAt(left) != result.charAt(right)){
                return false;
            }

            // invalid cases 
            if((left < right && start.charAt(left) == 'L') || (left > right && start.charAt(left) == 'R') ){
                return false;
            }

            left++;
            right++;
        }
    return true;
    }
}
