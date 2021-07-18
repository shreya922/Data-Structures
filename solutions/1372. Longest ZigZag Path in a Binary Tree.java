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
    int c=1;
    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root==null)
            return 0;
       if(root!=null)
       {
           findlongest1(root.left,"left",1);
            findlongest1(root.right,"right",1);
           
       }
        return max;
    }
    public void findlongest1(TreeNode root,String direction,int step)
    {
        if(root==null)
            return;
        if(direction.equals("left"))
        {
       findlongest1(root.right,"right",step+1);
           findlongest1(root.left,"left",1);
        }
        else
        {
       findlongest1(root.left,"left",step+1);
             findlongest1(root.right,"right",1);
        }
        max=Math.max(max,step);
        
    }
     
}
