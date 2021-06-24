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
    public int getMinimumDifference(TreeNode root) {
         List<Integer> list=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        list=inorder(root,list);
    for(int i=0;i<list.size()-1;i++)
    {
        if((list.get(i+1)-list.get(i))<min)
            min=list.get(i+1)-list.get(i);
    }
      return min;  
    }
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
