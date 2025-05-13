class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int num:nums){
            if(counter.containsKey(num)){
                counter.computeIfPresent(num, (k, v) -> v + 1);
            }
            else{
                counter.put(num, 1);
            }
        }

        int length = nums.length / 2;
        int majorityElement = 0;
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            if ( entry.getValue() > length){
                majorityElement = entry.getKey();
                break;
            }
        }
        return majorityElement;
    }
}
