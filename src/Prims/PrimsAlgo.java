package Prims;

import java.util.*;

public class PrimsAlgo
{
    static int spanningTree(int V, int E, List<List<int[]>> adj)
    {
        boolean inMST[] = new boolean[V]; // kya vo mera pahile se minimum spaning tree mai hai
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(o -> o[1])); // priority vise element ko store karata hai

        int key[]=new int[V]; // key for storing a weight
        Arrays.fill(key, Integer.MAX_VALUE); // Max value se fill kar diya


        key[0]=0;
        pq.add(new int[]{0, key[0]});

        int sumWeight = 0;

        while (!pq.isEmpty())
        {
            int current[]=pq.poll();
            int u = current[0];

            if(inMST[u])
            {
                continue;
            }

            inMST[u] = true;
            sumWeight += current[1];

            for (int edge[] : adj.get(u))
            {
                int v= edge[0];
                int weight= edge[1];
                if (!inMST[v] && key[v] > weight)
                {
                    key[v] = weight;
                    pq.add(new int[]{v, key[v]});
                }
            }
        }
        return sumWeight;

    }

    public static void main(String[] args) {
        int V=3;
        int E=3;

        List<List<int[]>> adj = new ArrayList<>();
        for (int i=0; i<V;i++)
        {
            adj.add(new ArrayList<>());
        }

        //Example edges
        adj.get(0).add(new int[]{1, 5});
        adj.get(1).add(new int[]{0, 5});

        adj.get(1).add(new int[]{2, 3});
        adj.get(2).add(new int[]{1, 3});

        adj.get(0).add(new int[]{2, 1});
        adj.get(2).add(new int[]{0, 1});

        System.out.println(spanningTree(V, E, adj));
    }
}

