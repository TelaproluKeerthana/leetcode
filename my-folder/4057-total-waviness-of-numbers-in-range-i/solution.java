class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2 < 100){
            return 0;
        }

        int waviness = 0;
        for(int i = num1; i <= num2; i++){
            int curr = i;

            // char[] arr = Integer.toString(curr).toCharArray();
            int[] arr = Integer.toString(curr).chars().map(c -> c - '0').toArray();

            for(int j = 1; j < arr.length - 1; j++){
                if(arr[j - 1] < arr[j] && arr[j] > arr[j + 1] ){
                    waviness += 1;
                }  
                else if(arr[j - 1] > arr[j] && arr[j] < arr[j + 1]){
                    waviness += 1;
                }
            }

        }
        return waviness;
    }
}
