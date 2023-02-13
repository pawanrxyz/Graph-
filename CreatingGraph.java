import java.util.*;
public class CreatingGraph { 
    public static class Edge {
        private int src;
        private int dest;

        public Edge(int s,int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void buildGraph(ArrayList<Edge>graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        
        graph[6].add(new Edge(6, 5));


    }
    
    public static void main(String args[]) {
        int v = 8;
        ArrayList<Edge>graph[] = new ArrayList[v];        
        buildGraph(graph);
        for(int i=0;i<graph[2].size();i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.src+" ");
            System.out.print(e.dest+" ");
        }
    }
    
}
