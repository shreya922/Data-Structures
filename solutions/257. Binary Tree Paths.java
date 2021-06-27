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
    public List<String> binaryTreePaths(TreeNode root) {
      List<String> list=new ArrayList<String>();  
        String s="";
        return paths(root,list,s);
        
    }
     public List<String> paths(TreeNode root,List<String> list,String s)
    {
        if(root.left!=null||root.right!=null)
        {
            s=s+root.val+"->";
            if(root.left!=null)
            paths(root.left,list,s);
            if(root.right!=null)
              paths(root.right,list,s);
        }
        if(root.left==null&&root.right==null)
        {
            s=s+root.val;
            list.add(s);
            s="";
        }
        return list;
    }
}
