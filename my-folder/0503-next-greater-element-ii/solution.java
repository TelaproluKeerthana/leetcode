class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int len = nums.length;
    Deque<Integer> stack = new ArrayDeque<>();
    int[] res = new int[len];
    Arrays.fill(res, -1);

    for(int i = 0; i < len * 2; i++){  
        int num = nums[i % len];
        while(!stack.isEmpty() && num > nums[stack.peek()]){
            res[stack.pop()] = num;
        }

        if(i  < len){
            stack.push(i);
        }
        }

         return res;
     } 

    }
