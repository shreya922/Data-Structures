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
       Boolean flag=false;
    public TreeNode pruneTree(TreeNode root) {
        return wrapper(root);
    }
    public TreeNode wrapper(TreeNode root)
    {
      if(root==null)
          return null;
         root.left=wrapper(root.left);
        root.right=wrapper(root.right);
      if(root.val==0&&root.left==null&&root.right==null)
          root=null;
       
        return root;
    }
       
    
   
}
