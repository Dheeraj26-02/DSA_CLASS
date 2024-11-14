import java.util.*;
public  class Kruskal{
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
    
    HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
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

    public void kruskalAlgo(){

    }
    public static void main(String[] args) {
        
    }
}