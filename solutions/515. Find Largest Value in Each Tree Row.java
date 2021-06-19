 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
         List<List<Integer>> list1=new ArrayList<List<Integer>>();
        List<Integer> d=new ArrayList<Integer>();
           if(root==null)
            return d;
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<Integer>();
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            TreeNode temp=q.remove();
            list.add(temp.val);   
            if(temp.left!=null)
            q.add(temp.left);
             if(temp.right!=null)
            q.add(temp.right);
            }
            list1.add(list);
        }
        List<Integer> f=new ArrayList<Integer>();
        for(int i=0;i<list1.size();i++)
        {
            int max=Integer.MIN_VALUE;
            List<Integer> temp=list1.get(i);
            for(int j=0;j<temp.size();j++)
            {
               if(temp.get(j)>max) 
                   max=temp.get(j);
            }
            f.add(max);
        }
        return f;
    }
}
