/* There is a directed graph of n nodes with each node labeled from 0 to n - 1. The graph is represented by a 0-indexed 2D integer array graph where graph[i] is an integer array of nodes adjacent to node i, meaning there is an edge from node i to each node in graph[i].

A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from that node leads to a terminal node (or another safe node).

Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.
Example 1: Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.
Example 2:
Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]
Explanation:
Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.*/

class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;
        List<Integer> safeNodes = new ArrayList<>();
        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
            isCycleDirected(graph, i, visited, recStack);
            }
        }

        for(int i = 0 ; i < n; i++){
            if(recStack[i] == false){
                safeNodes.add(i);
            }
        }
        
        return safeNodes;
    }
    
   private boolean isCycleDirected(int[][] graph, int course, boolean[] visited, boolean[] recStack) {
        visited[course] = true;
        recStack[course] = true;
        
        for (int neighbor : graph[course]) {
            if (recStack[neighbor]) {
                return true; // If a cycle is detected, return true.
            } else if (!visited[neighbor] && isCycleDirected(graph, neighbor, visited, recStack)) {
                return true; // If a cycle is detected in the DFS subtree, return true.
            }
        }
        
        recStack[course] = false;
        return false;
    }
}
