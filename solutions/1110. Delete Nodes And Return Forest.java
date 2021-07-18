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
     List<TreeNode> ans=new ArrayList<TreeNode>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<Integer> deletedNodes=new ArrayList<Integer>();
        for(int i=0;i<to_delete.length;i++)
            deletedNodes.add(to_delete[i]);
      
            delete(root,deletedNodes);
      if(deletedNodes.contains(root.val))
      {
          if(root.left!=null)
            ans.add(root.left);
          if(root.right!=null)
          ans.add(root.right);
      }
        else
            ans.add(root);
        return ans;
    }
    public void delete(TreeNode root,List<Integer> list)
    {
      if(root==null) return;
      if(root!=null&&root.left!=null)
        delete(root.left,list);
      if(root!=null&&root.right!=null)
          delete(root.right,list);
      if(root!=null&&root.left!=null&&list.contains(root.left.val))
        {
           if(root.left.left!=null&&!list.contains(root.left.left.val))
               ans.add(root.left.left);  
           if(root.left.right!=null&&!list.contains(root.left.right.val))
               ans.add(root.left.right); 
              root.left=null;
        }
        if(root!=null&&root.right!=null&&list.contains(root.right.val))
        {
           if(root.right.left!=null&&!list.contains(root.right.left.val))
               ans.add(root.right.left);  
                  if(root.right.right!=null&&!list.contains(root.right.right.val))
               ans.add(root.right.right);
                root.right=null;
        }
     
    }
}
