class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];
        for(int i = n1 - 1; i >= 0; i--){
            int d1 = num1.charAt(i) - '0';
            for(int j = n2 - 1; j >= 0; j--){
                int d2 = num2.charAt(j) - '0';
                int sum = d1 * d2 + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum/10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : res){
            //skip leading zeros and  start adding sb when you see the first non zero digit
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num); 
            }
        }

        return sb.toString();
    }
} 
//       0,1,2,3,4,5
// res = [0,0,1,3,6,8]  after 3*456
// res = [0,1,0,4,8,8]  23 * 456
// res = [0,5,6,0,8,8]  after 123 * 456 remove leading 0 and return the string 
//   i 
//  123
// 456x

