class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length == 1){
            return 1;
        }
        int boats = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left += 1;
            }
            right -= 1;
            boats += 1;
        }

        return boats;
    }
}

// [1, 2, 2, 3]
//        left right
// left
