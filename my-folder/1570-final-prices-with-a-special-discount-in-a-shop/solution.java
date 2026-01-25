class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // remove all larger prices than this current price
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? prices[i] : prices[i] - stack.peek();

            stack.push(prices[i]);
        }

        return result;
    }
}

