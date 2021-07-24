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
    int leftsum=0;
    int rightsum=0;
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        root.val=Math.abs(wrapper(root.left,0)-wrapper(root.right,0));
        findTilt(root.left);
        findTilt(root.right);
        return wrapper(root,0);
    }
    public int wrapper(TreeNode root,int sum)
    {
       if(root==null)
           return 0; sum=root.val+wrapper(root.left,sum)+wrapper(root.right,sum);
        return sum; 
        
    }
}
