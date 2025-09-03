class Solution {
    public String reorganizeString(String s) {
        if(s.length() == 1){
            return s;
        }
        Map<Character, Integer> counter = new HashMap<>();
        for(char c:s.toCharArray()){
            counter.put(c,counter.getOrDefault(c,0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for(Map.Entry<Character, Integer> entry : counter.entrySet()){
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        StringBuilder res = new StringBuilder();
        // to store the previously accessed element
        int[] prev = null;
        while(!pq.isEmpty() || prev != null){
            // case when you're left with no other elements
            if(prev != null && pq.isEmpty()){
                return "";
            }

            int[] curr = pq.poll();
            res.append((char)curr[1]);
            curr[0]--;

            if(prev != null){
                pq.offer(prev);
                prev = null;
            }


            if(curr[0] > 0){
                prev = curr;
            }
        }

        return res.toString();
    }
}



// s="aab"
// hm = {
//     a : 2
//     b : 1
// }
