class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>  studs = new LinkedList<>();
        
        for(int student : students){
            studs.offer(student);
        }    
        int idx = 0;
        int cnt = 0;
        while(idx < sandwiches.length && cnt < studs.size()){
            if(sandwiches[idx] == studs.peek()){
                studs.poll();
                idx++;
                cnt = 0;
            }
            else if(sandwiches[idx] != studs.peek()){
                int outt =  studs.poll();
                studs.offer(outt);
                cnt++;
            }
        }
        return studs.size();
    }
}
// c = 0
// s = 1

// stud = [1, 1, 0, 0]
//         i
//  [1 0 0 1]
//  [1]
// sand = [1]
// students = [1,1,1]
        //    [0,1,1]
