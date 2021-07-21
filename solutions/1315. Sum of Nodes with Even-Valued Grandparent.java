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
//if recursion return some value then it goes to the next line from the call.
//otherwise it continue the same call until we rech base case.
class Solution {
    int x=0;
    public int sumEvenGrandparent(TreeNode root) {
      if(root==null)
          return 0;
        if(root.val%2==0)
        {
            if(root.left!=null&&root.left.left!=null)
                x=x+root.left.left.val;
            if(root.left!=null&&root.left.right!=null)
                x=x+root.left.right.val;
            if(root.right!=null&&root.right.left!=null)
                x=x+root.right.left.val;
            if(root.right!=null&&root.right.right!=null)
                x=x+root.right.right.val;
        }
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        System.out.println(x);
        return x;
            
    }
   
}
