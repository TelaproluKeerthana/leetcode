class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false;
}

class Trie{
    TrieNode root;
    public Trie()
    {
        root = new TrieNode();
    }

    void addword(String word){
        TrieNode curr = root;
        for(char w : word.toCharArray()){
            if(!curr.children.containsKey(w)){
                curr.children.put(w, new TrieNode());
            }
            curr = curr.children.get(w);
        }
        curr.isEnd = true;
    }
}

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        // storing words in hashset for easier lookups
        // Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        Trie trie = new Trie();
        for(String word:dictionary){
            trie.addword(word);
        }

        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 0);
        return  dfs(0, s, dp, trie.root);
    }

    private int dfs(int idx, String s, Map<Integer, Integer> dp, TrieNode root){
        if(dp.containsKey(idx)){
            return dp.get(idx);
        }
        TrieNode curr = root;
        int res = 1 + dfs(idx + 1, s, dp, curr);
        for(int j = idx; j < s.length(); j++){
            // if(dict.contains(s.substring(idx, j + 1))){
            //     res = Math.min(res, dfs(j + 1, s, dp, dict));
            // }
            char c = s.charAt(j);
            if(!root.children.containsKey(c)){
                break;
            }

            root = root.children.get(c);
            if(root.isEnd){
                res = Math.min(res, dfs(j + 1, s, dp, curr));
            }
            
            
        }
        dp.put(idx, res);
        return res;
    }
}
