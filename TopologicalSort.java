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
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        
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
    
    public static boolean isCycleDirected(ArrayList<Edge> graph[],int curr, boolean vis[], boolean recStack[]){
        vis[curr] = true;
        recStack[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(recStack[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleDirected(graph, e.dest, vis, recStack)){
                    return true;
                }
            }
        }
        recStack[curr] = false;
        return false;
        
    }
    
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,stack);
            }
        }
        stack.push(curr);
    }
    
    public static void main(String[] args) {
        int V = 6;
        boolean vis[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        //dfs(graph,0,vis);
       // bfs(graph,V);
    //   for(int i = 0; i < V; i++){
    //       if(!vis[i]){
    //           if(isCycleDirected(graph, 0, vis,recStack))
    //           System.out.println(isCycleDirected(graph, 0, vis,recStack));
    //           break;
    //       }
           
    //   }
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                topSort(graph, i , vis, stack);
            }
        }
        
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
       
    }
}
