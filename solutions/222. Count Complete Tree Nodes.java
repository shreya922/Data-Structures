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
    public int countNodes(TreeNode root) {
      List<Integer> list=new ArrayList<Integer>();
        list=inorder(root,list);
    return list.size();
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
