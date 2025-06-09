import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> alist = new ArrayList<>();

        for (int idx = 0; idx < operations.length; idx++) {
            String curr = operations[idx];

            if (curr.equals("C")) {
                if (!alist.isEmpty()) {
                    alist.remove(alist.size() - 1);
                }
            } else if (curr.equals("D")) {
                if (!alist.isEmpty()) {
                    alist.add(alist.get(alist.size() - 1) * 2);
                }
            } else if (curr.equals("+")) {
                int size = alist.size();
                if (size >= 2) {
                    alist.add(alist.get(size - 1) + alist.get(size - 2));
                }
            } else {
                alist.add(Integer.parseInt(curr));
            }
        }

        int total = 0;
        for (int score : alist) {
            total += score;
        }

        return total;
    }
}

