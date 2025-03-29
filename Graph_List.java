public class Graph_List {
    int [][] matrix;
    Graph_List(int nodes){
        this.matrix=new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
    }
    public static void main(String[] args) {
        
    }
}
