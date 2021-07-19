/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans= new ArrayList<Integer>();
        List<TreeNode> allnode=new ArrayList<TreeNode>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        HashMap<TreeNode,Integer> map=new HashMap<TreeNode,Integer>();
        q.add(root);
            int count=0;
        while(!q.isEmpty())
        {
            
            int x=q.size();
            for(int i=0;i<x;i++)
            {
                TreeNode temp=q.remove();
                allnode.add(temp);
                map.put(temp,count);
                if(temp.left!=null)
                    q.add(temp.left);
                 if(temp.right!=null)
                    q.add(temp.right);
               
            }
             count++;
        }
        Set<TreeNode> list=map.keySet();
        for(TreeNode temp:list)
        {
            int dis=map.get(target)+map.get(temp)-2*map.get(lowestCommonAncestor(root,temp,target));
            if(dis==k)
                ans.add(temp.val);
         }
        return ans;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null)
           return null;
        if(root==p||root==q)
            return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null)
            return root;
        if(left!=null)
            return left;
        else
        return right;
        
    }
}
