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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return wrapper(nums,0,nums.length-1);
    }
    public TreeNode wrapper(int[] nums,int start,int end)
    {
        int j=0;
        if(start>end)
            return null;
        int max=-1;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                j=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=wrapper(nums,start,j-1);
        root.right=wrapper(nums,j+1,end);
        return root;
    }
}
