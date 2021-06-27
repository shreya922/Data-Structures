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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         List<Integer> list1=new ArrayList<Integer>();
         List<Integer> list2=new ArrayList<Integer>();
       list1=leaffound(root1,list1);
       list2=leaffound(root2,list2);
        if(list1.equals(list2))
            return true;
        return false;
    }
    public List<Integer> leaffound(TreeNode root,List<Integer> list)
    {
      if(root.left!=null||root.right!=null)
       {
          
             if(root.left!=null)
             leaffound(root.left,list);
             if(root.right!=null)
             leaffound(root.right,list);
       }
        if(root.left==null&&root.right==null)
        {
        list.add(root.val);
        }
        return list;
}
}
