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
    int i=0;
    public void recoverTree(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
    list= new ArrayList(inorder(root,list));
         List<Integer> list1=new ArrayList<Integer>(list);
        Collections.sort(list);
        System.out.print(list+" "+list1);
          //int x=0,y=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=list1.get(i))
            {
                int x=list1.get(i);
                int y=list.get(i);
                 swap(root,x,y);
                break;
            }
        }
      
       
    }
    public void swap(TreeNode root,int x,int y)
    {
        Boolean flag=false;
        if(root!=null)
        {
          swap(root.left,x,y);
            if(root.val==x)
            {
                root.val=y;
                flag=true;
            }
            else if(root.val==y&&flag==false)
                root.val=x;
            swap(root.right,x,y);
           
        } 
    }
    
    List<Integer> inorder(TreeNode root,List<Integer> list)
