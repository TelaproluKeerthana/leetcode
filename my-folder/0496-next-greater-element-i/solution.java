class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length = nums2.length - 1;
        // int[] res = new int[length];
        Map<Integer, Integer> res = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){

            while (!stack.isEmpty() && stack.peek() < num) {
               res.put(stack.pop(), num);
            }
            stack.push(num);
        } 
       

       int[] result = new int[nums1.length];
       for(int i = 0; i < nums1.length; i++){
        result[i] = res.getOrDefault(nums1[i], -1);
       }

       return result;
    }
}
