class Solution {
    public int numberOfSpecialChars(String word) {
    int[] lower = new int[26];
    int[] upper = new int[26];

    Arrays.fill(lower, -1);
    Arrays.fill(upper, -1);
    int idx = 0;
    for(char c : word.toCharArray()){
        if(Character.isLowerCase(c)){
            lower[c - 'a'] = idx;
        }
        else{
            if(upper[c - 'A'] != -1) continue;
            else upper[c - 'A'] = idx;
        }
        idx++;
    }

    int totalSC = 0;
    for(int i = 0; i < 26; i++){
        if(lower[i] != -1 && lower[i] < upper[i]) totalSC++;
    }

    return totalSC;
}
}
