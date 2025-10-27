class TNode{
    Map<Character, TNode> children = new HashMap<>();
    boolean lastNode = false;
}
class Trie {
    TNode root;
    public Trie() {
        root = new TNode();
    }
    
    public void insert(String word) {
        TNode curr = root;
        for(char w : word.toCharArray()){
            curr.children.putIfAbsent(w, new TNode());
            // if(!curr.children.containsKey(w)){
            //     curr.children.put(w, new TNode());
            // }
            curr = curr.children.get(w);
        }
        curr.lastNode = true;
    }
    
    public boolean search(String word) {
        TNode curr = root;
        for(char w : word.toCharArray()){
            if(!curr.children.containsKey(w)){
                return false;
            }
            curr = curr.children.get(w);
        }

        return curr.lastNode;
    }
    
    public boolean startsWith(String prefix) {
      TNode curr = root;
      for(char pre : prefix.toCharArray()){
        if(!curr.children.containsKey(pre)){
                return false;
        }
        curr = curr.children.get(pre);
      } 
      return true; 
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

// each level has 26 alphabets 
// a
// p
// p
// l 
// e
// HashMap<HashMap<String>>
