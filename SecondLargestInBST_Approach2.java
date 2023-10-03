import java.util.*;
class HelloWorld {
    static int count = 0;
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
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

public static int secondLargestInBST(Node root){
        while(root.right != null && root.right.right != null){
            root = root.right;
            
        }
        
        if(root.right != null && root.right.left != null){
            return findLargest(root.right.left);
        }
        
       return root.data;
    }
    
    public static int findLargest(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
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
        //secondLargest(root);
        System.out.println(secondLargestInBST(root));
    }
}
