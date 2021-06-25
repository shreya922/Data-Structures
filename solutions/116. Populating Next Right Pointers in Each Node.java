/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
​
    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
​
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
       List<List<Integer>> list=new ArrayList<List<Integer>>();
        Queue<Node> q=new LinkedList<Node>();
        List<Integer> lis=new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty())
        {
            int x=q.size();
            for(int i=0;i<x;i++)
            {
            Node temp=q.remove();
                if(!q.isEmpty()&&i<(x-1))
                temp.next=q.peek();
                if(temp.left!=null){
                q.add(temp.left);
                }
                if(temp.right!=null)
                q.add(temp.right);
            }
            
        }
        System.out.print(lis);
        return root;
    }
}
