class Solution {
    public List<List<Integer>> kSmallestPairs(int[] num1, int[] num2, int k) {
        PriorityQueue<int[]> pq = 
            new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {

                int sum = num1[i] + num2[j];

                if (pq.size() < k) {
                    pq.offer(new int[]{sum, num1[i], num2[j]});
                } else if (sum < pq.peek()[0]) {
                    pq.poll();
                    pq.offer(new int[]{sum, num1[i], num2[j]});
                } else {
                    break;  
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            res.add(Arrays.asList(curr[1], curr[2]));
        }

        return res;
    }
}
