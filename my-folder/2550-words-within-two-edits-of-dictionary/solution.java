class TrieNode{
    Map<Character, TrieNode> children;
    boolean isEnd;
    public TrieNode(){
        children = new HashMap<>();
        isEnd = false;
    }
}
class Solution {
    List<String> result;
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        TrieNode root = new TrieNode();
        for(String word : dictionary){
            TrieNode curr = root;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(!curr.children.containsKey(c)){
                    curr.children.put(c, new TrieNode());
                }
                curr = curr.children.get(c);
            }
            curr.isEnd = true;   
        }

        result = new ArrayList<>();
        for(String query : queries){
            if(dfs(query, 0, root, 0)){
                result.add(query);
            }
        }
        return result;
    }

    private boolean dfs(String query, int idx, TrieNode node, int edits){
        if(edits > 2){
            return false;
        }

        if(idx == query.length()){
            return node.isEnd;
        }

        char curr = query.charAt(idx);

        for(char nextNode : node.children.keySet()){
            TrieNode child = node.children.get(nextNode);
            if(curr == nextNode){
                if(dfs(query, idx + 1, child, edits)) return true;
            }
            else{
                if(dfs(query, idx + 1, child, edits + 1)) return true;
            }
        }
        return false;
    }    
}
// my approach is to build a trie
// then within the queires i will check if the first letter of the word exists if so i will iterate over there and check if i can build entire word with 2 edits 
//for edits keep a counter and track the number of counts you can get when there's a different character, if exceeds 2 then check the next letter
//add all letters that are in result array and return it

// w   n m
// o   o o
// o   t a
// d   e t

