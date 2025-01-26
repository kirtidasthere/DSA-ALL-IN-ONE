package Prims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dist[]= new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        dist[S]=0;
        pq.add(new int[]{S, 0});

        while (!pq.isEmpty())
        {
            int current[]=pq.poll();
            int u=current[0];
            int d=current[1];

            if(d>dist[u]) continue;


            for(ArrayList<Integer> edge : adj.get(u))
            {
                int v = edge.get(0);
                int weight = edge.get(1);

                if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                {
                    dist[v] = dist[u] + weight;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (u -> v, weight)
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(3, 1)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(2, 4)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(4, 3)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(2, 1)));

        int S = 0; // Source vertex
        int[] dist = dijkstra(V, adj, S);

        // Print the shortest distances from the source vertex
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]));


        }
    }
}
