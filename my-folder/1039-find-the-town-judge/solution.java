class Solution {
    public int findJudge(int n, int[][] trust) {
      Map<Integer, Set<Integer>> trusts = new HashMap<>();
      Map<Integer, Integer> trustedCount = new HashMap<>();

    for(int i = 1; i <= n; i++){
        trusts.put(i, new HashSet<>());
        trustedCount.put(i, 0);
    }

    for (int[] t : trust) {
        int a = t[0], b = t[1];
        trusts.get(a).add(b);             
        trustedCount.put(b, trustedCount.get(b) + 1);  
    }

    for(int person = 1; person <= n; person++){
        boolean trustedByEveryOne = trustedCount.get(person) == n - 1;
        boolean trustsNoOne = trusts.get(person).isEmpty();
        if(trustedByEveryOne && trustsNoOne){
            return person;
        }
    }

    return -1;
    //  int judge  = -1;
    //  int idx = 1;
    //  for(Map.Entry<Integer, Set<Integer> t : trusts.entrySet>){
    //     int curr = t.getkey();
    //     int values = t.getValue();
    //     if(values.contains(curr)){
    //         continue;
    //     }

    //     if(idx != curr){
    //         judge = curr;
    //     }
    //     else{
    //         idx++;
    //     }
    //  }
    
    // return judge;
    }
}

// 1 : [1,3]
// 2 : [2,3]
// since 3 doesn;t trust anybody the answer would be 3 no  trust relationships exists and everybody trusts 3

// 1 : 1, 3
// 2 : 2, 3
// 3 : 3, 1
// since by the end there is no judge we return -1
