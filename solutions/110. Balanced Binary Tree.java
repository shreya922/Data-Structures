/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(maxdepth(root.left)-maxdepth(root.right))>1)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int maxdepth(TreeNode root)
    {
        int h=(root==null)?0:1+Math.max(maxdepth(root.left),maxdepth(root.right));
        return h;
    }
    
    
}
