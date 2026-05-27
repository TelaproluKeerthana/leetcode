class Solution {
    public int numberOfSpecialChars(String word) {
        // map the character to the character's first occurence
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> last = new HashMap<>();

        int idx = 0; 
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c)) map.putIfAbsent(c, idx);
            else if(Character.isLowerCase(c)) last.put(c, idx);
            idx++;
        }

        int totalSpecial = 0;

        for(char c = 'a'; c <= 'z'; c++){
            char upper = Character.toUpperCase(c);
                if(last.containsKey(c) && map.containsKey(upper) && last.get(c) < map.get(upper)){
                    totalSpecial++;
                }
        }

        return totalSpecial;
    }
}

// {
//     a : 0;
//     A : 2;
//     b : 3;
//     c : 4;
//     B : 5;
//     C : 6
// }

// c = 99 - 97 + 65
// 97 - 97 + 65
// a = 97 
// A = 65

// c - 'a' + 'A'
