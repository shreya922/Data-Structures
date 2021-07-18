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
    public int widthOfBinaryTree(TreeNode root) {
        int max=0;
          if(root==null)
            return 0;
          Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        HashMap<TreeNode,Integer> map=new  HashMap<TreeNode,Integer>();
        map.put(root,1);
        while(!q.isEmpty())
        {
            int start=0,end=0;
            int curr=0;
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
             if(i==0)
              start= map.get(temp);
             if(i==(x-1))
              end=map.get(temp);
            if(temp.left!=null)
            {
            q.add(temp.left);
                map.put(temp.left,2*map.get(temp));
            }
             if(temp.right!=null)
             {
            q.add(temp.right);
                 map.put(temp.right,2*map.get(temp)+1);
             }
            }
            curr=end-start+1;
            if(curr>max)
            max=curr;
        }
        List<Integer> list=new ArrayList<Integer>(map.values());
     System.out.print(list);
        return max;
    }
}
