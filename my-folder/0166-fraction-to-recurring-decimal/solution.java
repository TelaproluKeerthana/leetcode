class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder  sb = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            sb.append("-");
        }

        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        sb.append(num / den);
        long remainder = num % den;
        
        if (remainder == 0) {
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> nd = new HashMap<>();
        while(remainder != 0){
            // this is the case where you have to append both () to the existing string buffer
            if(nd.containsKey(remainder)){
                int idx = nd.get(remainder);
                sb.insert(idx, "(");
                sb.append(")");
                break;
            }

            nd.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder/den);
            remainder %= den;
        }

        return sb.toString();
    }
}

// 1 / 2 = 2)10(0.5
//           10


// 4 / 333 = 333)400(0.012
//               333
//               ---
//                670

