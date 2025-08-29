class Solution {
    public int[] getOrder(int[][] tasks) {
    int len = tasks.length;
    //we store all those tasks with indexing
    int[][] indexedTasks = new int[len][3];
    // indexed all the tasks, now we know which tasks arrive at what time
    for(int i = 0; i < len; i++){
        indexedTasks[i][0] = tasks[i][0];
        indexedTasks[i][1] = tasks[i][1];
        indexedTasks[i][2] = i;
    }
    
    // sorted according to process starting time
    Arrays.sort(indexedTasks, (a, b) -> Integer.compare(a[0], b[0]));

    PriorityQueue<int[]> cpu = new PriorityQueue<>((a, b) -> {if(a[1] == b[1]){
        return Integer.compare(a[2], b[2]);
    } else{ return Integer.compare(a[1], b[1]);}
    }
    );

    int result[] = new int[len];
    
    // the current time
    int time = 0;
    // the current index we're processing
    int idx = 0;
    // the index of the result array
    int resIdx = 0;
    
    // when the cpu is not empty or the index is in bounds 
    while(idx < len || !cpu.isEmpty()){
        // we keep all the indexedtasks into the priorityQueue
        while(idx < len && indexedTasks[idx][0] <= time){
            cpu.offer(indexedTasks[idx]);
            idx++;
        }
       
       // when no tasks are available in priorityQueue, we process the next available task 
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


// [[1,2],[2,4],[3,2],[4,1]]

// indexed = [[1,2, 0],[2,4, 1],[3,2, 2],[4,1, 3]]
// priority queue = []
