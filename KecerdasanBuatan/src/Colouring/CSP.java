package Colouring;

import java.util.*;

public class CSP {
    public static void main(String[] args) {
        LinkedList<Integer> color = new LinkedList<>();

        // instansiasi graph
        Graph g = new Graph(10);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(1,5);
        g.addEdge(1,6);
        g.addEdge(1,7);
        g.addEdge(1,8);
        g.addEdge(1,9);
        g.addEdge(2,3);
        g.addEdge(2,9);
        g.addEdge(3,4);
        g.addEdge(3,8);
        g.addEdge(3,9);
        g.addEdge(4,5);
        g.addEdge(4,7);
        g.addEdge(4,8);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,7);
        g.addEdge(7,8);
        g.addEdge(8,9);

        // cetak adjacency vertex atau constrraint
        System.out.println("Constraints : ");
        System.out.println(g.toString());

        // instansiasi domain warna
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Merah");
        map.put(2, "Kuning");
        map.put(3,"Hijau");
        map.put(4, "Biru");
        map.put(5,"Putih");
        map.put(6,"Orange");

        System.out.println("Domain warna : ");
        for(int i = 1 ; i <= map.size(); i++){
            System.out.println((i) + ". " + map.get(i));
            color.add(i);
        }

        LinkedList<int[]> result = g.coloringGraph(color);
        System.out.println("\nHasil Pewarnaan dari salah satu solusi : \n" );
        for(int i = 1 ; i < result.get(1).length; i++){
            System.out.println("R" + (i) + " : " + map.get(result.get(1)[i]));
        }
    }
}

class Graph{
    LinkedList<Integer> adj[];
    int totalVertex;
    Graph(int size){
        this.totalVertex = size;
        this.adj = new LinkedList[totalVertex];
        for(int i = 0 ; i < size; i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v1, int v2){
        adj[v1].add(v2);
        adj[v2].add(v1);
    }
    public LinkedList<int[]>
    coloringGraph(LinkedList<Integer> color){
        LinkedList<int[]> result = new LinkedList<>();
        int[] colorOfVertex = new int[totalVertex];
        csp(color, colorOfVertex, result, 1);
        return result;
    }
    public void csp(LinkedList<Integer> color, int[]
            colorOfVertex, LinkedList<int[]> result, int vertex){
        LinkedList<Integer> availColor = new
                LinkedList<>(color);
        for(int i = 0 ; i < adj[vertex].size(); i++){

            availColor.remove((Integer)colorOfVertex[adj[vertex].get(i)])
            ;
        }
        if(availColor.size() == 0) return;
        else {
            for(int i = 0 ; i < availColor.size(); i++){
                colorOfVertex[vertex] = availColor.get(i);
                boolean filled = true;
                for(int j = 1 ; j < totalVertex; j++){
                    if(colorOfVertex[j] == 0){
                        filled = false;
                        break;
                    }
                }
                if(filled) {
                    boolean solved = true;
                    for (int j = 1; j < totalVertex; j++) {
                        for (int k = 0; k < adj[j].size();
                             k++) {
                            if (colorOfVertex[j] ==
                                    colorOfVertex[adj[j].get(k)]) {
                                solved = false;
                            }
                        }
                        if(!solved) break;
                    }
                    if (solved)
                        result.add(Arrays.copyOf(colorOfVertex,
                                colorOfVertex.length));
                } else {
                    for(int j = 0; j < adj[vertex].size();
                        j++){
                        if(colorOfVertex[adj[vertex].get(j)]
                                == 0){
                            csp(color, colorOfVertex, result,
                                    adj[vertex].get(j));
                            colorOfVertex[adj[vertex].get(j)]
                                    = 0;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 1 ; i < adj.length; i++){
            result += "R" + i + " : ";
            result += String.valueOf(adj[i]);
            result += "\n";
        }
        return result;
    }
}
