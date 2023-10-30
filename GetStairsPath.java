// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    
     public static ArrayList<String> getStairPaths(int n) {
        
        if(n == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }else if(n < 0){
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        
        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String path : paths1){
            paths.add(path + 1);
        }
        
        for(String path : paths2){
            paths.add(path + 2);
        }
        
        for(String path : paths3){
            paths.add(path + 3);
        }
        
        return paths;
    }
    public static void main(String[] args) {
         System.out.println(getStairPaths(3));
    }
}
