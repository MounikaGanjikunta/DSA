/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public static void inorder(TreeNode root, List<Integer> inorderList){
        if(root == null){
            return;
        }

        inorder(root.left, inorderList);
        inorderList.add(root.val);
        inorder(root.right, inorderList);

        }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);
        return inorderList.get(k - 1);
        
        
    }
}
