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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map=inorder(root,map);
        int max=0,k=0,freq=0,ele=0;
        for(Integer i:map.keySet())
        {
            freq=map.get(i);
            if(freq>max)
            {
                max=freq;
                freq=map.get(i);
                ele=i;
            }
        }
        System.out.print(map);
        System.out.print(max+" "+ele);
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(Integer i:map.keySet())
        {
            if(map.get(i)==max)
            {
                arr1.add(i);
            }
        }
        int[] arr=new int[arr1.size()];
        k=0;
        for(int i=0;i<arr1.size();i++)
        {
            arr[k++]=arr1.get(i);
        }
        return arr;
    }
    public HashMap<Integer,Integer> inorder(TreeNode root,HashMap<Integer,Integer> map)
    {
        if(root!=null)
        {
            inorder(root.left,map);
            if(map.containsKey(root.val))
                map.put(root.val,map.get(root.val)+1);
            else
            {
                map.put(root.val,1);
            }
            inorder(root.right,map);
        }
