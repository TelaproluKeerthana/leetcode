class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int left = 0;
        for(int i = 1; i <= n; i++){
            if(left == target.length){
                return result;
            }

            if(i == target[left]){
                result.add("Push");
                left += 1;
            }
            else{
                result.add("Push");
                result.add("Pop");
            }   
        }

    return result;
    }
}

// res = push, 
// left = 1
// // [1, 3]
//     target[1] == 3
// i = 1

// n = 3
// [1, 2, 3]

// [push, push, pop, push]


// target = [1, 2]
//           i

// i in range(n)
// i + 1 == target[i]:
