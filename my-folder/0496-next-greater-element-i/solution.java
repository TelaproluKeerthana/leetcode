class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length = nums2.length - 1;
        // int[] res = new int[length];
        Map<Integer, Integer> res = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = length; i >= 0; i--){
            int curr = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res.put(curr, -1);
            }
            else{
                res.put(curr, stack.peek());
            }

            stack.push(nums2[i]); 
        } 
       

       int[] result = new int[nums1.length];
       for(int i = 0; i < nums1.length; i++){
        result[i] = res.get(nums1[i]);
       }

       return result;
    }
}
