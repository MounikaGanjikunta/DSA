// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    
    public static void modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if(q.isEmpty() || k > q.size()){
            return;
        }
        if(k <= 0){
            return;
        }
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i <k; i++){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        for(int i = 0; i <q.size() - k; i++){
            q.add(q.remove());
        }
        
    
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        modifyQueue(q,k);
        System.out.println(q);
    }
}
