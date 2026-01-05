class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        
        Map<Integer, Integer> hm = new HashMap<>();
        for(int val: hand){
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        for(int val : hand){
            int start = val;
            // when there are elements smaller than the start in the hm
            while(hm.getOrDefault(start - 1, 0) > 0) start--;
            while(start <= val){
                while(hm.getOrDefault(start, 0) > 0){
                    for(int i = start; i < start + groupSize; i++){
                        if(hm.getOrDefault(i, 0) == 0) return false;
                        hm.put(i, hm.get(i) - 1);
                    }
                }
                start++;
            }
        } 
        return true; 
    }
}

// 1, 2, 2, 3, 3, 4, 6, 7, 8
// [1, 2, 3, 6, 2, 3, 4, 7, 8]
// 1 : 1
// 2 : 2
// 3 : 2
// 4: 1
// 6 : 1
// 7 : 1
// 8 : 1

// minheap.poll() = 1
// check in hm if 2 is there present 
// if the groupsize isn't met, we check for 2+1 in hm if present remove 3 only if the freq is 0 then we poll that from minheap


// groupsize = 0
// next small value 2
// if 2 + 1 is present incr grpsize, decrement count
// 3 is there if count is 0 poll from minheap
// 4 is there count poll from minheap 

// groupsize = 0
// minheap poll next min is 6






