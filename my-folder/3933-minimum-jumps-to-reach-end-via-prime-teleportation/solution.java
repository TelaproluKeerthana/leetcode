class Solution {
    public int minJumps(int[] nums) {
        HashMap<Integer, List<Integer>> primeMap = new HashMap<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            Set<Integer> primes = getPrimeFactors(nums[i]);

            for (int p : primes) {
                primeMap.putIfAbsent(p, new ArrayList<>());
                primeMap.get(p).add(i);
            }
        }

        int steps = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[len];

        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int curr = q.poll();

                if (curr == len - 1) return steps;

                if (curr - 1 >= 0 && !visited[curr - 1]) {
                    visited[curr - 1] = true;
                    q.offer(curr - 1);
                }

                if (curr + 1 < len && !visited[curr + 1]) {
                    visited[curr + 1] = true;
                    q.offer(curr + 1);
                }

                if (isPrime(nums[curr]) && primeMap.containsKey(nums[curr])) {
                    for (int next : primeMap.get(nums[curr])) {
                        if (!visited[next]) {
                            visited[next] = true;
                            q.offer(next);
                        }
                    }

                    primeMap.remove(nums[curr]);
                }
            }

            steps++;
        }

        return -1;
    }

    private Set<Integer> getPrimeFactors(int n) {
        Set<Integer> res = new HashSet<>();

        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        return res;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
