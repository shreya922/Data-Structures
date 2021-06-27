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
    public String smallestFromLeaf(TreeNode root) {
        List<String> list=new ArrayList<String>();
        List<String> list1=new ArrayList<String>();
        String s="";
       list=paths(root,list,s);
       
        for(int i=0;i<list.size();i++)
        {
            StringBuilder sb=new StringBuilder(list.get(i)); 
            sb=sb.reverse();
            list1.add(sb.toString());
        }
        Collections.sort(list1);
        System.out.print(list1);
        String sz="";
        for(int i=0;i<list1.get(0).length();i++)
            sz=sz+(list1.get(0).charAt(i));
        return sz;
    }
    public List<String> paths(TreeNode root,List<String> list,String s)
    {
         if(root.left!=null||root.right!=null)
       {
           s=s+(char)(root.val+97);
             if(root.left!=null)
             paths(root.left,list,s);
             if(root.right!=null)
             paths(root.right,list,s);
       }
        if(root.left==null&&root.right==null)
        {
        s=s+(char)(root.val+97);
        list.add(s);
        }
        s="";
        return list;
    }
}
