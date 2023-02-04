package com.company;

public class Graph {

    // Vertex -> A, B, C, D, E
    // Graph Matrix / Adjacency Matrix -> 2D Matrix to represent a graph.

    /* Weighted ? --> NO! -> Unweighted Graph
    *  Directed ? --> No! -> for every a -> b, there does not exist b -> a.
    *       A   B   C   D   E
    * A     0   1   0   0   1
    * B     0   0   1   1   0
    * C     0   0   0   0   0
    * D     1   0   1   0   1
    * E     0   1   0   1   0
    *
     */


    // Implement an unweighted, non-directed graph.
    private int noOfVertex;
    private int[][] adjMatrix;
    Graph(int noOfVertex) {
        this.noOfVertex = noOfVertex;
        this.adjMatrix = new int[noOfVertex][noOfVertex];
        for(int i=0; i < noOfVertex; i++)
            for(int j=0; j < noOfVertex; j++)
                adjMatrix[i][j] = 0;
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        // if the graph is non-directed
        adjMatrix[destination][source] = 1;
    }

    public void display() {
        for(int i=0; i < noOfVertex; i++) {
            for (int j = 0; j < noOfVertex; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);                                     // noOfVertex = 5; adjMatrix -> 5x5
        // graph.addEdge(vertex1, vertex2);
        /*
        * * Directed ? --> Yes! -> for every a -> b, there exists b -> a.
         *       0   1   2   3   4
         * 0     F   T   F   T   T
         * 1     T   F   T   T   T
         * 2     F   T   F   T   F
         * 3     T   T   T   0   T
         * 4     T   T   F   T   F
         * */

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.display();
    }
}
