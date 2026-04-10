class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> IngredientToRecipes = new HashMap<>();

        Map<String, Integer> indegree = new HashMap<>();

        for(int i = 0; i < recipes.length; i++){
            String curr = recipes[i];
            indegree.put(curr, ingredients.get(i).size());
        }

        for(int i = 0; i < recipes.length; i++){
            for(String ing : ingredients.get(i)){
                IngredientToRecipes.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipes[i]);
            }
        }
        List<String> result = new ArrayList<>();
        
        Queue<String> que = new LinkedList<>();
        for(String sup : supplies){
            que.offer(sup);
        }
        
        while(!que.isEmpty()){
            String curr = que.poll();
            if(!IngredientToRecipes.containsKey(curr)) continue;

            for(String recipe : IngredientToRecipes.get(curr)){
                indegree.put(recipe, indegree.get(recipe) - 1);

                if(indegree.get(recipe) == 0){
                    que.offer(recipe);
                    result.add(recipe);
                }
            }
        }

        return result;

    }
}
