class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        for (char task : tasks) {
            frequency[task - 'A']++;
        }
        // Count frequency of each task (A–Z)

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : frequency) {
            if (freq > 0) {
                maxHeap.offer(freq);
            }
        }
        // Max heap stores the remaining count of each task (highest frequency first)

        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        // Queue stores tasks that are cooling down: [remainingCount, nextAvailableTime]

        while (!queue.isEmpty() || !maxHeap.isEmpty()) {
            time++;
            
            // If heap was empty but queue wasn't, time jumps to next available task
            if (maxHeap.isEmpty()) {
                time = queue.peek()[1];
            }
            else{
                // Take the most frequent task and process it
                int count = maxHeap.poll() - 1;
                if (count > 0) {
                    // If the task still has occurrences left, put it in cooldown
                    queue.offer(new int[]{count, time + n});
                }
            }

            // Check if any task finished its cooldown at this time
            if (!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.offer(queue.poll()[0]);
            }
            
        }
        return time;
    }
}

