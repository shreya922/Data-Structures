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
    int maxdiff=0;
    int currdiff=0;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)
            return 0;
        wrapper(root,root.val);
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
        return maxdiff;
    }
    public void wrapper(TreeNode root,int rootvalue)
    {
        if(root==null)
            return;
       wrapper(root.left,rootvalue);
        if(root.left!=null)
        {
              currdiff=Math.abs(rootvalue-root.left.val); 
              if(currdiff>maxdiff)
            maxdiff=currdiff;
        }
      
          wrapper(root.right,rootvalue);
         if(root.right!=null)
         {
            currdiff=Math.abs(rootvalue-root.right.val);
             if(currdiff>maxdiff)
            maxdiff=currdiff;
         }
        
    }
}
