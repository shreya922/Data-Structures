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
    long max=0;
    long totalsum=0;
    public int maxProduct(TreeNode root) {
          totalsum=cal(root);
         cal(root);
        return (int)(max % (int)(Math.pow(10, 9) + 7));
    }
    public long cal(TreeNode root)
    {
        if(root==null)
            return 0;
         long left=cal(root.left);
        long right=cal(root.right);
        long currnodesum1= root.val+left+right;
        long currnodesum2=totalsum-currnodesum1;
        max=Math.max(max,currnodesum1*currnodesum2);
       return currnodesum1;
    }
}
