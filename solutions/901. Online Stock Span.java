class StockSpanner {
    
   int[] arr=new int[10000];
    int[] ans=new int[10000];
     int k=0;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        arr[k]=price;
        ans[k]=1;
        int x=k;
       
        while(x>0&&price>=arr[x-1])
        {
            ans[k]++;
            x--;
        }
        k++;
        return ans[k-1];
    }
}
​
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
