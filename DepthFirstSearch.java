// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static class Edge{
        int src;
        int dest;
        
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
        
    }
    
    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> Que = new LinkedList<>();
        boolean vis[] = new boolean[V];
        Que.add(0);
        while(!Que.isEmpty()){
            int curr = Que.remove();
            if(vis[curr] != true){
                System.out.println(curr + " ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    Que.add(e.dest);
                }
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.println(curr);
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest] != true){
                dfs(graph,e.dest,vis);
            }
            
        }
    }
    
    public static void main(String[] args) {
        int V = 7;
        boolean vis[] = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        dfs(graph,0,vis);
       // bfs(graph,V);
    }
}
