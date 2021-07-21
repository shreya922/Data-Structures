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
      int[] count=new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
 if(root==null)
            return 0;
       count[root.val]++;
        pseudoPalindromicPaths(root.left);
        pseudoPalindromicPaths(root.right);
        if(root.left==null&&root.right==null)
        {
            
            if(palindrome(count))
                total++;
           
        }
        count[root.val]--;
        return total;
    }
     public Boolean palindrome( int[] count)
    {
        
      
        int od=0;
        for(int i=0;i<=9;i++)
        {
            if(count[i]%2!=0)
                od++;
        }
