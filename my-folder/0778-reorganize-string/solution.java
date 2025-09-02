// class Solution {
//     public String reorganizeString(String s) {
//         if(s.length == 1){
//             return s;
//         }
//         Map<Character, Integer> counter = new HashMap<>();
//         for(Char c:toCharArray(s)){
//             counter.put(c,getOrDefault(0) + 1);
//         }

//         PriorityQueue<int[]> pq = new PriorityQueue<>();

//     }
// }

import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        if (s.length() == 1) {
            return s;
        }

        // Step 1: Count character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max heap based on frequency
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] - a[0] // higher count first
        );
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            maxHeap.offer(new int[]{entry.getValue(), entry.getKey()});
        }

        StringBuilder result = new StringBuilder();
        int[] prev = null;

        // Step 3: Build the result string
        while (!maxHeap.isEmpty() || prev != null) {
            if (prev != null && maxHeap.isEmpty()) {
                return ""; // not possible to reorganize
            }

            int[] curr = maxHeap.poll();
            result.append((char) curr[1]);
            curr[0]--;

            if (prev != null) {
                maxHeap.offer(prev);
                prev = null;
            }

            if (curr[0] > 0) {
                prev = curr;
            }
        }

        return result.toString();
    }
}


// s="aab"
// hm = {
//     a : 2
//     b : 1
// }
