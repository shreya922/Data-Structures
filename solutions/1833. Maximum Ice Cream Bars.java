class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0,res=0;
        for(int i=0;i<costs.length;i++)
        {
           res=res+costs[i]; 
            count++;
            if(res==coins)
                return count;
            if(res>coins)
                return count-1;
        }
        return count;
    }
}
