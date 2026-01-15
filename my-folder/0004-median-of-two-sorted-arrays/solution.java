class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int total = num1.length + num2.length;
        int half = (total + 1) / 2;
        int[] arr1 = num1;
        int[] arr2 = num2;
        if(num1.length > num2.length){
            int[] temp = num1;
            arr1 = arr2;
            arr2 = temp;
        }

        int left = 0;
        int right = arr1.length;
        while(left <= right){
            int mid = (left + right) / 2;
            int mid2 = half - mid;
            int aleft = mid > 0 ? arr1[mid - 1] : Integer.MIN_VALUE;
            int aright = mid < arr1.length ? arr1[mid] : Integer.MAX_VALUE;
            int bleft = mid2 > 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int bright = mid2 < arr2.length ? arr2[mid2] : Integer.MAX_VALUE;

            if(aleft <= bright && bleft <= aright){
                if(total % 2 != 0){
                    return Math.max(aleft, bleft);
                }

                return (Math.max(aleft, bleft) + Math.min(bright, aright)) / 2.0;
            }
            else if(aleft > bright){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
