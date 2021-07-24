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
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public int[] findMode(TreeNode root) {
      int[] arr=new int[1000];
        int k=0;
        inorder(root);
       List<Integer> list=new ArrayList<Integer>(map.values());
        int max=0;
        for(int i=0;i<list.size();i++)
        {
           max=Math.max(max,list.get(i));
        }
        Set<Integer> set=map.keySet();
        for(int temp:set)
        {
            if(map.get(temp)==max)
                arr[k++]=temp;
        }
        int[] arr1=new int[k];
        for(int i=0;i<k;i++)
            arr1[i]=arr[i];
        return arr1;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
          if(map.containsKey(root.val))
                map.put(root.val,map.get(root.val)+1);
            else
            {
                map.put(root.val,1);
            }
            inorder(root.left);
            inorder(root.right);
    }
}
