class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> supply = new HashSet<>();
        for (String sup : supplies) {
            supply.add(sup);
        }

        List<String> availableRecipes = new ArrayList<>();
        boolean added = true;

        while (added) {
            added = false;

            for (int i = 0; i < recipes.length; i++) {
                String curr = recipes[i];

                // skip if already added
                if (supply.contains(curr)) continue;

                boolean canMake = true;

                for (String ing : ingredients.get(i)) {
                    if (!supply.contains(ing)) {
                        canMake = false;
                        break; // small optimization
                    }
                }

                if (canMake) {
                    supply.add(curr);          // 🔥 key fix
                    availableRecipes.add(curr);
                    added = true;
                }
            }
        }

        return availableRecipes;
    }
}
