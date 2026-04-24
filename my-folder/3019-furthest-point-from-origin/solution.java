class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int gaps = 0;
        for(char move : moves.toCharArray()){
            if(move == 'L'){
                left++;
            }
            else if(move == 'R'){
                right++;
            }
            else{
                gaps++;
            }
        }

        if(left > right){
            return (left + gaps) - right;
        }
        
        return (right + gaps) - left;
    }
}

// L_RL__R
// i

// -1 + 1 = 0 
// 0 + 1 = 1
// 1 - 1 = 0
// 1 + 1 + 1 = 3

// __ can be either left or right
