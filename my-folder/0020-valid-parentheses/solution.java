class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;

        Map<Character, Character> pairs = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}

