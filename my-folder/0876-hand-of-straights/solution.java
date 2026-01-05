class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        
        Map<Integer, Integer> hm = new HashMap<>();
        for(int val: hand){
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.keySet());

        while(!pq.isEmpty()){
            int start = pq.peek();
            for(int i = 0; i < groupSize; i++){
                int curr = start + i;
                if(!hm.containsKey(curr)){
                    return false;
                }

                hm.put(curr, hm.get(curr) - 1);
                if(hm.get(curr) == 0){
                    hm.remove(curr);
                    pq.poll();
                }
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






