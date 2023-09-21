/* There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.*/
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // Populate the graph with prerequisites.
        for (int[] prerequisite : prerequisites) {
            int courseA = prerequisite[0];
            int courseB = prerequisite[1];
            graph[courseB].add(courseA); // courseB depends on courseA.
        }
        
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && isCycleDirected(graph, i, visited, recStack)) {
                return false; // If a cycle is detected, return false.
            }
        }
        
        return true; // If no cycle is detected, return true.
    }
    
    private boolean isCycleDirected(ArrayList<Integer>[] graph, int course, boolean[] visited, boolean[] recStack) {
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
