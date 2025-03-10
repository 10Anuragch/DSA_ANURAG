// package ShortestPath;
import java.lang.reflect.Array;
import java.util.*;

public class dijkstra {
    static class Edge{
        int src,dest,wt;
        Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }

    //creation of graph

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4,3,2));
    
    }

    //Dijkstra(greedy algorthm)

    //time complexity = O(V + ElogV) --if we use priority queue
    //if we don't use priority queue the it is O(n^2)
    static class pair implements Comparable<pair>{//it is used to store the pair of source and the weight of source (pair of shortest path)
        int n;
        int path;

        public pair(int n,int path){
            this.n=n;
            this.path=path; 
        }
        // @Override
        public int compareTo(pair p2){
            return this.path - p2.path;
        }
    }
    public static void Dijkstra(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;//infinity
            }
        }

        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;

                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[v]>dist[u]+wt){//update distance from source to v
                        dist[v]=dist[u]+wt;
                        pq.add(new pair(v,dist[v]));
                    }
                }
            }
        }

        //print all source to vertices shortest path
        for(int i=0;i<dist.length;i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        int src=0;
        Dijkstra(graph, src);
    }
}
