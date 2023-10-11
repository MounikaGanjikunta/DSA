//Page 242(Cracking the Coding Interview - Given a sorted(increasing order) array with unique integer elements, write an algorithm to create a BST with minimal height)

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
    
    public static Node MinimalBST(int[] arr, int start, int end){
        if(start > end) return null;
        
        int mid = start + (end - start)/2;
        Node root = new Node(arr[mid]);
        root.left = MinimalBST(arr, start, mid - 1);
        root.right = MinimalBST(arr, mid + 1, end);
        return root;
    }
    
    public static void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    
    public static void main(String[] args) {
        int arr[] = {2, 3, 6,7,8,9,12,15,16,18,20};
        
        inorder(MinimalBST(arr, 0, arr.length - 1));
    }
}
