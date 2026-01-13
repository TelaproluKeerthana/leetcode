class KthLargest {
    List<Integer> aList = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;                 // store k
        for (int num : nums) {
            aList.add(num);
        }
        Collections.sort(aList);   // sort once initially
    }
    
    public int add(int val) {
        aList.add(val);            // use correct variable name
        Collections.sort(aList);  // keep sorted
        return aList.get(aList.size() - k);  // kth largest
    }
}

