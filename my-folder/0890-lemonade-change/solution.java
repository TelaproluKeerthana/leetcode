class Solution 
{
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> counts = new HashMap<>();
         counts.put(5, 0);
         counts.put(10, 0);
         counts.put(20, 0);
         for(int bill:bills){ 
            if(bill == 5){
                counts.put(5, counts.get(5) + 1);
            }
            else if(bill == 10){
                counts.put(10, counts.get(10) + 1);
                if(counts.get(5) < 1){
                    return false;
                }
                else{
                    counts.put(5, counts.get(5) - 1);
                }
            }
            else{
                counts.put(20, counts.get(20) + 1);
                if (counts.get(10) > 0 && counts.get(5) > 0) {
                    // give one 10 and one 5
                    counts.put(10, counts.get(10) - 1);
                    counts.put(5, counts.get(5) - 1);
                } else if (counts.get(5) >= 3) {
                    // give three 5s
                    counts.put(5, counts.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
    return true;
 } }
