class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] diffArr = new int[arr.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);
            if(diffA == diffB) return Integer.compare(a, b);
            return Integer.compare(diffA, diffB);
        });
        
        for(int num : arr){
            minHeap.offer(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll());
        }

        Collections.sort(result);
        return result;

    }
}


// arr =  [1,2,3,4,5]
// k = 4 
//     - 4 closest integers to 3

// x = 3
// for an integer to be closer to x it should be |a - x| < |b - x|
// 1- 3 < 2 - 3 
// 2 < 1
// 1 - 3 == 5 - 3 and 1 < 5
//  so 1 is closer to 3 

// 3 - 4 < 3- 5 and 4 < 5
// so 4 is closer 

// 2 - 3 == 4 - 3
// so 2 is closer

// 3 itself is closer so we add 3 

// 1, 2, 3, 4

// 1 : 3 - 1 = 2
// 2 :3 - 2 = 1
// 3 : 3 - 3 = 0
// 4 : 3 - 4 = 1
// 5 : 3 - 5 = 5

// now add them to the list in sorted order and return it if theres a tie we need to return the number which is smallest

// now i need to get minimum difference and the idx if not i need to get min difference is same for multiple indexes then we get the one which is less than the other

