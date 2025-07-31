// package Graphs;

import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;

public class BFS {
    // first create the graph and then apply BFS or DFS
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // creation of graph

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph eg. in notes

        // 0-vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1-vertex
        graph[1].add(new Edge(1, 3));

        // 2-vertex
        graph[2].add(new Edge(2, 4));

        // 3-vertex
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // 4-vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // 5-vertex
        graph[5].add(new Edge(5, 6));
    }

    // *** BFS ***

    public static void bfs(ArrayList<Edge>[] graph) {
        // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);// source = 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {// visited current
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {// this loop is used to find neighbors
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }

    }

    // *** DFS ****

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {

        // O(V+E)

        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // *** hasPath question (show that there is any path exist or not between two
    // nodes)

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest=neighbour
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {// recursive function (hasPath)
                return true;
            }
        }
        return false;
    }

    // topological Sorting

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, s);//modified dfs
            }
        }

        //print  elements
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("BFS Traversal");
        bfs(graph);

        System.out.println();

        System.out.println("DFS Traversal");
        dfs(graph, 0, new boolean[V]);

        System.out.println();
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
        System.out.println(hasPath(graph, 1, 2, new boolean[V]));

        System.out.println();

        System.out.println("Topological Sorting");
        topSort(graph);
    }
}
