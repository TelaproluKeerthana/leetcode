class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long total = 0;
        for(int t : target){
            total += t;
            pq.offer(t);
        }

        while(true){
            int largest = pq.poll();
            long remain = total - largest;

            if(largest == 1 || remain == 1){
                return true;
            }
            if(remain == 0 || largest < remain){
                return false;
            }

            long prev = largest % remain;
            if(prev == 0){
                return false;
            }
            pq.offer((int)prev);
            total = prev + remain;
        }


    }
}

// [9, 3, 5]
// sum = 17
// pop max = 9 
// 17 - 9 = 8
// prev = 9 % 8 = 1
// 1 + rest = tot
// [1, 3, 5]
// sum = 9
// pop max = 5
// 5 - 4 diff = 1
// [1, 1, 1]
// if(sum == len(arr)) break;
// max = 3 - 2diff = 1

