class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
       int resultSize=Integer.MAX_VALUE;
        int resultCity=-1;
        Map<Integer,List<int[]>> map=new HashMap<>();
        map=buildGraph(map,edges,n);
      //  System.out.print(map);
        for(int i=0;i<n;i++)
        {
            int size=dij(map,distanceThreshold,n,i);
            if(size<=resultSize)
            {
                resultSize=size;
                resultCity=i;
            }
            
        }
        return resultCity;
    }
    public int dij( Map<Integer,List<int[]>> map,int distanceThreshold,int n,int start)
    {
        int[] dist=new int[n];
       Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;
        PriorityQueue<int[]> q=new PriorityQueue<int[]>((edge1,edge2)->{
            return Integer.compare(edge1[1],edge2[1]);//edge1[1]-edge2[1]>0?1:-1;   --min priority queue
        });
​
        q.add(new int[]{start,0});
        while(!q.isEmpty())
        {
            int[] node=q.remove();
            int src=node[0];
            List<int[]> neibs=map.get(src);
            for(int[] neib:neibs)
            {
                int dest=neib[0];
                int cost=neib[1];
                int totalcost=dist[src]+cost;
                if(dist[dest]>totalcost)
                {
                   dist[dest]=totalcost; 
                    q.add(new int[]{dest,cost});
                }
             }
       
