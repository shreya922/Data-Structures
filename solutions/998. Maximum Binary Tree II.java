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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
          List<Integer> list=new ArrayList<Integer>();
    list= inorder(root,list);
        int[] arr=new int[list.size()+1];
        int i=0;
        for(i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        arr[i]=val;
     return wrapper(arr,0,arr.length-1);
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
​
    List<Integer> inorder(TreeNode root,List<Integer> list)
    {
         
        if(root!=null)
        {
          inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
         return list;
    }
   
  
}
