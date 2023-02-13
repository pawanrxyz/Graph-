import java.util.*;
public class PracticeGraph {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    public static int size = 0;
    public static void graphCreate(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,2));
        graph[0].add(new Edge(0, 3,4));
        size++;

        graph[1].add(new Edge(1, 0,-1));
        graph[1].add(new Edge(1, 4,9));
        size++;
        
        graph[2].add(new Edge(2, 0,5));
        graph[2].add(new Edge(2, 4,7));
        size++;

        graph[3].add(new Edge(3, 0,8));
        size++;

        graph[4].add(new Edge(4, 1,-3));
        graph[4].add(new Edge(4, 2,-7));
        size++;
    }

    public static void main(String args []) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];

        graphCreate(graph);

        for(int i=0;i<graph[0].size();i++) {
            Edge e = graph[0].get(i);
            System.out.println(e.src+" "+e.dest+" "+e.wt);
        }
        System.out.println("The Total Size of graph is = "+size);

    }    
}
