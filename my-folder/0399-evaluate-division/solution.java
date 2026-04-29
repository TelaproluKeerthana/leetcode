class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        Map<String, Map<String, Double>> map = new HashMap<>();
        for(int i = 0; i < values.length; i++){
            List<String> curr = equations.get(i);
            String first = curr.get(0);
            String second = curr.get(1);
            map.putIfAbsent(first, new HashMap<>());
            map.putIfAbsent(second, new HashMap<>());

            map.get(first).put(second, values[i]);
            map.get(second).put(first,  1.0 / values[i]);
        }   

        double[] res = new double[queries.size()];
         for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            if (!map.containsKey(start) || !map.containsKey(end)) {
                res[i] = -1.0;
            } else if (start.equals(end)) {
                res[i] = 1.0;
            }
            else{
                Set<String> visited = new HashSet<>();
                res[i] = dfs(map, start, end, 1.0, visited);
            }
        }
        return res;
    }

    public double dfs(Map<String, Map<String, Double>> map, String curr, String target, double product, Set<String> visited){
        if(curr.equals(target)){
            return product;
        }

        visited.add(curr);
        for(String nei : map.get(curr).keySet()){
            if(!visited.contains(nei)){
                double res = dfs(map, nei, target, product * map.get(curr).get(nei), visited);
                if(res != -1.0){
                    return res;
                }
            }
        }

        return -1.0;
    }


}


// equation a/b = 2 right a = 
