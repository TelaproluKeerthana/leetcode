class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        ArrayList<Integer> alist = new ArrayList<>();
        for(int num : nums){
            counter.put(num, 1 + counter.getOrDefault(num , 0));
        }
            while(alist.size() < k){
                Map.Entry<Integer, Integer> maxEntry = Collections.max(counter.entrySet(), Map.Entry.comparingByValue());
                alist.add(maxEntry.getKey());
                counter.remove(maxEntry.getKey());
            }
        
        int[] frequentNumbers = new int[alist.size()];
        for(int i = 0; i < alist.size(); i++){
            frequentNumbers[i] = alist.get(i);
        }
        return frequentNumbers;
    }
}
