// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
            
        }
    }
    
    public static ArrayList<Integer> Inorder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = root;
        Stack<Node> st = new Stack<Node>();
        while(true){
            if(curr!= null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                if(st.isEmpty()) break;
                
                curr = st.pop();
                list.add(curr.data);
                curr = curr.right;
            }
        }
        return list;
    }
    
    public static void PreOrder(Node root){
        Stack<Node> st = new Stack<>();
        Node curr = root;
        st.push(curr);
        while(!st.isEmpty()){
            curr = st.pop();
            System.out.println(curr.data);
            if(curr.right!= null){
                st.push(curr.right);
            }
            if(curr.left!= null){
               st.push(curr.left);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree bt = new BinaryTree();
       Node root = bt.buildTree(nodes);
       //System.out.println(Inorder(root));
       PreOrder(root);
    }
}
