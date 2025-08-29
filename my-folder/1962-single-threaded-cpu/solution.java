class Solution {
    public int[] getOrder(int[][] tasks) {
    int len = tasks.length;
    int[][] indexedTasks = new int[len][3];
    // indexed all the tasks, now we know which tasks arrive at what time
    for(int i = 0; i < len; i++){
        indexedTasks[i][0] = tasks[i][0];
        indexedTasks[i][1] = tasks[i][1];
        indexedTasks[i][2] = i;
    }
    
    // sorted according to process starting time
    Arrays.sort(indexedTasks, (a, b) -> Integer.compare(a[0], b[0]));

    PriorityQueue<int[]> cpu = new PriorityQueue<>((a, b) -> a[1] == b[1] ? Integer.compare(a[2], b[2]) : Integer.compare(a[1], b[1]));

    int result[] = new int[len];
    
    // total time it is taking
    int time = 0;
    int idx = 0;
    int resIdx = 0;

    while(idx < len || !cpu.isEmpty()){
        while(idx < len && indexedTasks[idx][0] <= time){
            cpu.offer(indexedTasks[idx]);
            idx++;
        }

        if(cpu.isEmpty()){
            time = indexedTasks[idx][0];
        }
        else{
            int[] task = cpu.poll();
            result[resIdx++] = task[2];
            time += task[1];
        }
    }

    return result;

}
}
