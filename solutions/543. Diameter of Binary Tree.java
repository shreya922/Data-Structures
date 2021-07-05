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
    int maxpath=0;
    public int diameterOfBinaryTree(TreeNode root) {
       maxdepth(root);
        return maxpath;
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
            int ldepth=maxdepth(root.left);
              int rdepth=maxdepth(root.right);
            maxpath=Math.max(maxpath,ldepth+rdepth);
            if(ldepth>rdepth)
                return ldepth+1;
            else
                return rdepth+1;
            
}
    }
}
