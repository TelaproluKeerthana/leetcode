class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1HS = new HashSet<>();
        HashSet<Integer> num2HS = new HashSet<>();
        for(int num: nums1){
            num1HS.add(num);
        }

        for(int num : nums2){
            num2HS.add(num);
        }
        
        List<Integer> res = new ArrayList<>();
        if(num1HS.size() < num2HS.size()){
            res = compareSets(num1HS, num2HS);
        }else{
            res = compareSets(num2HS, num1HS);
        }

        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
    }

    public List<Integer> compareSets(Set<Integer> set1, Set<Integer> set2){
        List<Integer> result = new ArrayList<>();
        for(int num : set1){
            if(set2.contains(num)){
                result.add(num);
            }
        }

        return result;
    }
    
}
