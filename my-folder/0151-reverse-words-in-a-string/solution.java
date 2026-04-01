class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

        int start = 0;

        for(int end = 0; end <= arr.length; end++){
            if( end == arr.length || arr[end] == ' '){
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return cleanSpaces(arr);
    }

    public void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    private String cleanSpaces(char[] arr){
        int i = 0, j = 0, n = arr.length;
        while(j  < n){
            while(j < n && arr[j] == ' ') j++;

            while(j < n && arr[j] != ' ') arr[i++] = arr[j++];

            while(j < n && arr[j] == ' ') j++;

            if(j < n) arr[i++] = ' ';
        }

        return new String(arr, 0, i);
    }
}
