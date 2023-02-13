import java.util.*;
public class CreateGraph_1 {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s,int d) {
            this.src = s;
            this.dest = d;
        }
    } 

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        } 
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));
            
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<Edge>  graph[] = new ArrayList[v];
        createGraph(graph);

        for(int i=0;i<graph[0].size();i++) {
            Edge e = graph[0].get(i);
            System.out.print(e.src+" ");
            System.out.print(e.dest+" ");
        }
    }
    
}
