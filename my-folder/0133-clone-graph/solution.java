/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> cloneMap = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        if(cloneMap.containsKey(node.val)){
            return cloneMap.get(node.val);
        }

        Node newNode = new Node(node.val);
        cloneMap.put(newNode.val, newNode);
        for(Node nei : node.neighbors){
            if(cloneMap.containsKey(nei.val)){
                newNode.neighbors.add(cloneMap.get(nei.val));
            }
            else{
                newNode.neighbors.add(cloneGraph(nei));
            }
        }

        return newNode;
    }
}
