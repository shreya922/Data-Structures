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
    int leftsum=0;
    int rightsum=0;
    public int findTilt(TreeNode root) {
         int x=0;
        root=tempf(root);
        List<Integer> list=new ArrayList<Integer>();
        list=inorder(root,list);
        System.out.print(list);
        for(int i=0;i<list.size();i++)
            x=x+list.get(i);
        return x;
    }
    public TreeNode tempf(TreeNode root)
    {
      if(root==null)
            return null;
        root.val=Math.abs(wrapper(root.left,0)-wrapper(root.right,0));
        tempf(root.left);
        tempf(root.right);
        return root;
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
    public int wrapper(TreeNode root,int sum)
    {
       if(root==null)
           return 0;
        sum=sum+root.val+wrapper(root.left,sum)+wrapper(root.right,sum);
       
        return sum; 
        
    }
}
