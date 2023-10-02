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
    //built BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data < val){
            root.right = insert(root.right,val);
        }else if(root.data > val){
            root.left = insert(root.left, val);
        }
        return root;
    }
    //inorder traversal of BST
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //search in BST
    public static boolean searchBST(Node root, int key){
        if(root == null){
            return false;
        }
        
        if(root.data > key){
            return searchBST(root.left, key);
        }else if(root.data < key){
            return searchBST(root.right, key);
        }else{
            return true;
        }
        
        
    }
    //delete a node in BST
    public static Node deleteBST(Node root, int val){
        if(root.data > val){
            root.left = deleteBST(root.left, val);
        }else if(root.data < val){
            root.right = deleteBST(root.right, val);
        }else{
            //case 1:
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2:
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            //case 3:
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteBST(root.right, IS.data);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    //Print in range of X and Y(inclusive) in BST
    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left,X,Y);
            System.out.println(root.data + " ");
            printInRange(root.right,X,Y);
           
        }else if(root.data <= X){
            printInRange(root.right,X,Y);
        }else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
    }
    //print all paths from Root to leaf in a BST
    public static void printRootToLeaf(Node root, ArrayList<Integer> Path){
        if(root == null){
            return;
        }
        
        
        Path.add(root.data);
        //leaf
        if(root.left == null && root.right == null){
            printPath(Path);
        }else{//non leaf
            printRootToLeaf(root.left,Path);
            printRootToLeaf(root.right,Path);
        }
        
        Path.remove(Path.size() - 1);
    }
    
    public static void printPath(ArrayList<Integer> Path){
        for(int i = 0; i < Path.size(); i++){
            System.out.print(Path.get(i) + "->");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        
        inorder(root);
        System.out.println();
        System.out.println(searchBST(root, 8));
        deleteBST(root, 5);
        inorder(root);
        printInRange(root, 3, 12);
        printRootToLeaf(root, new ArrayList<>());
    }
}
