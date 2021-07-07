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
    int total=0;
    public int goodNodes(TreeNode root) {
         wrapper(root,Integer.MIN_VALUE);
        return total;
    }
    public int wrapper(TreeNode root,int max)
    {
        if(root==null)
            return 0;
        if(root.val>=max)
        {
            total++;
            max=root.val;
        }
        wrapper(root.left,max);
        wrapper(root.right,max);
        return total;
    }
}
