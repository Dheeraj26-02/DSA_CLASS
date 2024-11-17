import java.util.*;

public class Kruskal {

    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Kruskal(int v) {
        map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class Pair {
        int e1;
        int e2;
        int cost;

        public Pair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.e1 + "-" + this.e2 + "->" + this.cost;
        }
    }

    public List<Pair> getAllEdge() {

        List<Pair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new Pair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void kruskalAlgo() {

        List<Pair> ll = getAllEdge();
        Collections.sort(ll, new Comparator<Pair>() {
            public int compare(Pair o1, Pair o2) {
                return o1.cost - o2.cost;
            }
        });
        for (int key : map.keySet()) {
            CreateSet(key);
        }
        int ans = 0;
        for (Pair e : ll) {
            int re1 = find(e.e1);
            int re2 = find(e.e2);
            if (re1 == re2) {

            } else {
                union(e.e1, e.e2);
                ans += e.cost;
                System.out.println(e);
            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Kruskal ks = new Kruskal(7);
        ks.addEdge(1, 2, 1);
        ks.addEdge(1, 4, 2);
        ks.addEdge(2, 3, 4);
        ks.addEdge(3, 4, 9);
        ks.addEdge(4, 5, 6);
        ks.addEdge(5, 7, 2);
        ks.addEdge(5, 6, 5);
        ks.addEdge(6, 7, 3);
        ks.kruskalAlgo();

    }

    // DSU...........................................................................................................

    class Node {
        int val;
        int rank;
        Node parent;
    }

    HashMap<Integer, Node> map1 = new HashMap<>();

    public void CreateSet(int v) {// O(1)
        Node nn = new Node();
        nn.val = v;
        nn.rank = 0;
        nn.parent = nn;
        map1.put(v, nn);
    }

    public int find(int v) {
        Node nn = map1.get(v);
        return find(nn.parent).val;
    }

    private Node find(Node node) {
        if (node == node.parent) {
            return node;
        }
        Node nn = find(node.parent);
        node.parent = nn;// path compression(tail recursion) saving the value of parent while coming
                         // back.
        return nn;
    }

    // Union..........................................
    public void union(int e1, int e2) {
        Node n1 = map1.get(e1);
        Node n2 = map1.get(e2);

        Node rn1 = find(n1);
        Node rn2 = find(n2);

        if (rn1.rank == (rn2.rank)) {
            rn1.parent = rn2;
            rn2.rank++;

        } else if (rn1.rank > rn2.rank) {
            rn2.parent = rn1;

        } else {
            rn1.parent = rn2;
        }
    }
}