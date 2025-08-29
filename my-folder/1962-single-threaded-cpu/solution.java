class Solution {
    public int[] getOrder(int[][] tasks) {
        int len = tasks.length;

        // Extend each task with its original index: [enqueueTime, processingTime, index]
        int[][] indexedTasks = new int[len][3];
        for (int i = 0; i < len; i++) {
            indexedTasks[i][0] = tasks[i][0]; // enqueue time
            indexedTasks[i][1] = tasks[i][1]; // processing time
            indexedTasks[i][2] = i;           // original index
        }

        // Sort tasks by enqueue time so we know in what order they become available
        Arrays.sort(indexedTasks, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap (priority queue) to pick the next task:
        //  1. Task with the shortest processing time first
        //  2. If tie, the task with the smaller original index
        PriorityQueue<int[]> cpu = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[2], b[2]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        int[] result = new int[len]; // stores the order of task indices

        int time = 0;      // current CPU time
        int idx = 0;       // pointer into indexedTasks (sorted by enqueue time)
        int resIdx = 0;    // pointer into result array

        // Keep running until we've considered all tasks
        while (idx < len || !cpu.isEmpty()) {

            // Add all tasks that have arrived by 'time' into the priority queue
            while (idx < len && indexedTasks[idx][0] <= time) {
                cpu.offer(indexedTasks[idx]);
                idx++;
            }

            if (cpu.isEmpty()) {
                // No tasks are available yet → jump time forward
                time = indexedTasks[idx][0];
            } else {
                // Pick the next task from the queue
                int[] task = cpu.poll();
                result[resIdx++] = task[2];  // record its original index
                time += task[1];             // increase time by its processing duration
            }
        }

        return result;
    }
}

