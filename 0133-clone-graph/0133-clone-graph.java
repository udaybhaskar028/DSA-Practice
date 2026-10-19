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
    private Node dfs(Node node, HashMap<Node,Node> map){
    //check if already cloned
    if(map.containsKey(node)){
        
        return(map.get(node));
    }
    //create a new node 
    Node clone = new Node(node.val);
    //save the node mapping in map 
    map.put(node,clone);

    // clone neighbours
    for(Node n:node.neighbors){
        Node cloneneighbour = dfs(n,map);
        clone.neighbors.add(cloneneighbour);
    }

    return clone;
}
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node ans = dfs(node, map);
       return ans;
        
    }
}