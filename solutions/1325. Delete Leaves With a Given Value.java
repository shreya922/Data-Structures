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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
      return wrapper(root,target);
    }
    public TreeNode wrapper(TreeNode root,int target)
    {
      if(root==null)
          return null;
         root.left=wrapper(root.left,target);
        root.right=wrapper(root.right,target);
      if(root.val==target&&root.left==null&&root.right==null)
          root=null;
       
        return root;
    }
       
    
   
}
