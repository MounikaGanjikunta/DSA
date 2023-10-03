/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null; //obvious case

        if(root.val == p.val || root.val == q.val) // in this case, p or q is the ancestor
        return root;

        // if(root.left == null && root.right == null){ // case when root has no children
        //     return null;
        // }
        
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        
        left = lowestCommonAncestor(root.left, p, q); // search for p or q, if found return root to above level
        
        
        right = lowestCommonAncestor(root.right, p, q);//search for p or q, if found return root to above level
    

        if (left == null) { 
            return right; 
        }else if(right == null){
            return left;
        }else{
            return root;
        }

        

    }

}
