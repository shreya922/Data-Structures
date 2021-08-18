class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
      double totaltime=-1;
        Map<Integer,List<double[]>> graph=new HashMap<Integer,List<double[]>>();
        graph=build(graph,n,edges,succProb);
        totaltime=dij(graph,n,start,end);
        return totaltime;
    }
    public double dij(Map<Integer,List<double[]>> graph,int n,int start,int end)
    {
        double[] dist=new double[n];
        Arrays.fill(dist,0);
        dist[start]=1;
        PriorityQueue<double[]> q=new PriorityQueue<double[]>((edge1,edge2)->{
            return edge1[1]<edge2[1]?1:-1;
        });
        q.add(new double[]{start,1.0});
        while(!q.isEmpty())
        {
            double[] node=q.remove();
            int src=(int)node[0];
            List<double[]> neibs=graph.get(src);
            for(double[] neib:neibs)
            {
                int dest=(int)neib[0];
                double cost=neib[1];
                double totalcost=dist[src]*cost;
                if(totalcost>dist[dest])
                {
                    dist[dest]=totalcost;
