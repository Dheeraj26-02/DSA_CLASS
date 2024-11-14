// //Only used in Directed Graph in case of -ve edge(cost)

import java.util.*;

public class Bellmanford_grap {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    // Constructor to initialize the graph with 'n' nodes.
    public Bellmanford_grap(int n) {
        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new HashMap<>());
        }
    }

    // Method to add an edge to the graph.
    public void addEdge(int v1, int v2, int cost) {
        if (!map.containsKey(v1))
            return;
        map.get(v1).put(v2, cost);
    }

    // Helper class to represent an edge (e1, e2, cost)
    class pair {
        int e1;
        int e2;
        int cost;

        public pair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }

        public String toString() {
            return this.e1 + "->" + this.e2 + "->" + this.cost;
        }
    }

    // Method to implement the Bellman-Ford algorithm
    public void BellmanfordAlgo(int src) {
        int v = map.size();
        int[] dist = new int[v + 1]; // Distance array to store shortest paths
        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize all distances to infinity
        dist[src] = 0; // Distance to the source is 0

        // Relax edges (v-1) times
        for (int i = 1; i <= v; i++) {
            List<pair> ll = getAllEdge();
            for (pair p : ll) {
                if (i == v && dist[p.e1] + p.cost < dist[p.e2]) {
                    System.out.println("-ve edge of cycle");
                    return;
                }
                if (dist[p.e1] != Integer.MAX_VALUE && dist[p.e1] + p.cost < dist[p.e2]) {
                    dist[p.e2] = dist[p.e1] + p.cost;
                }
            }
            // for (pair p : ll) {
            // System.out.println(p);
            // }
        }

        // Check for negative weight cycles by performing one more relaxation
        // List<pair> ll = getAllEdge();
        // for (pair p : ll) {
        // if (dist[p.e1] != Integer.MAX_VALUE && dist[p.e1] + p.cost < dist[p.e2]) {
        // System.out.println("-ve edge of cycle");
        // return;
        // }
        // }

        // Print the shortest distances from the source
        for (int i = 1; i <= v; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("INF ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
    }

    public List<pair> getAllEdge() {
        List<pair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new pair(e1, e2, cost));
            }
        }
        return ll;
    }

    public static void main(String[] args) {
        Bellmanford_grap bf = new Bellmanford_grap(5);
        bf.addEdge(1, 2, 8);
        bf.addEdge(1, 4, 5);
        bf.addEdge(1, 3, 4);
        bf.addEdge(2, 5, 2);
        bf.addEdge(5, 2, 1);
        bf.addEdge(4, 5, 4);
        bf.addEdge(3, 4, -3);

        bf.BellmanfordAlgo(1);
    }
}