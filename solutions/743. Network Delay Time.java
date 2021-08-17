            List<int[]> neibs=graph.get(src);
            for(int[] neib:neibs)
            {
                int dest=neib[0];
                int cost=neib[1];
                int totalcost=dist[src]+cost;
                if(totalcost<dist[dest])
                {
                    dist[dest]=totalcost;
                    q.add(new int[]{dest,cost});
                }
            }
        }
        int totaltimes=0,max=-1;
        for(int i=1;i<=n;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
                return -1;
            if(dist[i]>max)
                max=dist[i];
        }
        for(int i=1;i<=n;i++)
            System.out.print(dist[i]+" ");
        return max;
    }
    public Map<Integer,List<int[]>> build(Map<Integer,List<int[]>> graph,int n,int[][] times)
    {
        for(int i=1;i<=n;i++)
            graph.put(i,new ArrayList<>());
        for(int[] edge:times)
        {
            int src=edge[0];
            int dest=edge[1];
            int cost=edge[2];
            graph.get(src).add(new int[]{dest,cost});
        }
        return graph;
    }
}
