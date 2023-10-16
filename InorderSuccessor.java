/* Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

The successor of a node p is the node with the smallest key greater than p.val.*/
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
    
    
    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        System.out.println(root.data);
        inorder(root.right, list);
    }
    
    
    
    public static void main(String[] args) {
    //   Node root = [5,3,6,2,4,null,null,1];
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       int p = 6;
       ArrayList<Integer> list = new ArrayList<>();
      BinaryTree bt = new BinaryTree();
      Node root = bt.buildTree(nodes);
       inorder(root, list);
       for(int i = 0; i < list.size(); i++){
           if(list.get(i) == p && i == list.size() - 1){
               System.out.println("null");
           }else if(list.get(i) == p){
               System.out.println(list.get(i + 1));
           }
       }
       
       
       
    }
}
