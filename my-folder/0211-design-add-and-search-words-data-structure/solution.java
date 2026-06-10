class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false;
}
class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            curr.children.putIfAbsent(c, new TrieNode());
            curr = curr.children.get(c);
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return dfs(0, word, root);
    }

    private boolean dfs(int idx, String word, TrieNode root){
        TrieNode node = root;

        for(int i = idx; i < word.length(); i++){
            char c = word.charAt(i);
            if(c == '.'){
                for(TrieNode child : node.children.values()){
                    if(child != null && dfs(i + 1, word, child)){
                        return true;
                    }
                }
                return false;
            }
            else{
                if(!node.children.containsKey(c)){
                    return false;
                }

                node = node.children.get(c);
            }
        }

        return node.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
