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
    Map<Integer, Node> mapNodes = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
         if(mapNodes.containsKey(node.val)){
            return mapNodes.get(node.val);
        }

        Node cNode = new Node(node.val);
        mapNodes.put(node.val, cNode);

        for(Node nei : node.neighbors){
                if(mapNodes.containsKey(nei.val)){
                    cNode.neighbors.add(mapNodes.get(nei.val));
                }
                else{
                    cNode.neighbors.add(cloneGraph(nei));
                }
        }

        return cNode;

    }
}
