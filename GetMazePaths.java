// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        
        if(sc < dc){
            hpath = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpath = getMazePaths(sr + 1, sc, dr, dc);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String path : hpath){
            paths.add(path + 'h');
        }
        
        for(String path : vpath){
            paths.add(path + 'v');
        }
        
        return paths;
    }
    
    public static void main(String[] args) {
        System.out.println(getMazePaths(1, 1,3, 3));
    }
}
