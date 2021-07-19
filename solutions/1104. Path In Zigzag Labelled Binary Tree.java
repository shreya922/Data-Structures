class Solution {
    //new concepts used of binary tree: depth of a label is log base2(label) which can be calculated by  int depth=(int)(Math.log(label)/Math.log(2)); --as a complete binary tree has number of nodes at each level in GP ... 1,2,4,8,16 and son on.
    //The label of each node at depth d has min value=2^d and max value=2*(d+1)-1
    // if in this question tree was simple means not in a zig zag fashion then we could directly do parent(label)=label/2 (always whether left or right child)
    //But here as it is in zig zag fashion so we are calculating offset which calculates position of given label then we add that offset in min value in order to find actual lable value(without zigzag i.e. 9), then parent(9)=9/2=4(modified label)
    public List<Integer> pathInZigZagTree(int label) {
      List<Integer> list=new ArrayList<Integer>();
        list.add(label);
        while(label!=1)
        {
            int depth=(int)(Math.log(label)/Math.log(2)); //depth of 14=3
            int min=(int)Math.pow(2,depth); //min=8
            int max=(int)Math.pow(2,depth+1)-1; //max=15
            int offset=max-label; //15-14=1
             label=(min+offset)/2; //8+1=9 , 9/2=4
            list.add(label); //add 4 to list
        }
        Collections.sort(list);
        return list;
    }
}
