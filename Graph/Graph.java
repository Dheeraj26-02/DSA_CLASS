import java.util.*;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int val) {
        map.get(v1).put(v2, val);
        map.get(v2).put(v1, val);
    }

    public boolean containsEdge(int v1, int v2) {
        boolean ans = false;
        if (map.containsKey(v1)) {
            ans = map.get(v1).containsKey(v2);
        }
        if (map.containsKey(v2)) {
            ans = map.get(v2).containsKey(v1);
        }
        return ans;
    }

    public boolean containsVertex(int v) {
        return map.containsKey(v);
    }

    public int noOfEdge() {
        int edges = 0;
        for (int key : map.keySet()) {
            edges += map.get(key).size();
        }
        return edges / 2;// for removing double edges in map
    }

    public void removeEdge(int v1, int v2) {
        if (containsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v1) {
        if (map.containsKey(v1)) {
            for (int key : map.get(v1).keySet()) {
                map.get(key).remove(v1);
            }
            map.remove(v1);
        }
    }
    public void display(){
        for(int key:map.keySet()){
            System.out.println(key+ "-> "+ map.get(key));
        }
    }
    
    public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
        if (src == dest) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, dest, visited);
                if (ans == true) {
                    return true;
                }
            }
        }
        visited.remove(src);  
        return false;
    }

    public void PrintAllPath(int src, int dest, HashSet<Integer> visited, String ans) {
        if (src == dest) {
            System.out.println(ans + dest);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                PrintAllPath(nbrs, dest, visited, ans + src);
            }
        }
        visited.remove(src);
    }


    //BFS :- Take all neighbours of the vertex at once........................................................................
    
    public boolean BFS(int src, int dest) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            // remove
            int rv = q.poll();
            // ignore
            if (visited.contains(rv)) {
                continue;
            }
            // visited
            visited.add(rv);
            if (rv == dest) {
                return true;
            }
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    q.add(nbrs);
            }
        }
        return false;

    }

    ////DFS :- Take one neighbours of the vertex at once then find the neighbour of neighbours................................

    public boolean DFS(int src, int dest) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(src);
        while (!st.isEmpty()) {
            // remove
            int rv = st.pop();
            // ignore
            if (visited.contains(rv))
                continue;
            // visited
            visited.add(rv);
            // self work
            if (rv == dest) {
                return true;
            }
            // nbrs
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    st.push(nbrs);
            }
        }
        return false;
    }

    //......................................................................................................................
    //We use BFT and DFT only when the source are not connected .

    public void BFT() {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
                // remove
                int rv = q.poll();
                // ignore
                if (visited.contains(rv)) {
                    continue;
                }
                System.out.print(rv + " ");
                // visted
                visited.add(rv);
                //nrbs
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.add(nbrs);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph gr = new Graph(7);
        gr.addEdge(1, 2, 3);
        gr.addEdge(1, 4, 2);
        gr.addEdge(2, 3, 4);
        gr.addEdge(3, 4, 10);
        gr.addEdge(4, 5, 5);
        gr.addEdge(5, 6, 9);
        gr.addEdge(5, 7, 12);
        gr.addEdge(6, 7, 6);

        gr.display();
        System.out.println();
        System.out.println("Has Path:- " + gr.hasPath(1, 6, new HashSet<>()));
        System.out.println();
        System.out.println("All Paths:- ");
        gr.PrintAllPath(1, 6, new HashSet<>(), "");
        System.out.println();
        System.out.println("BFS:- " + gr.BFS(1, 8));
    }
}
