package com.company.Ejecutables;

import com.company.KruskalAlgorithm;

public class KruskalPrincipal {

    public static void main(String[] args) {

        int adjacency_matrix[][] = {{0, 0, 0, 0},
                {10, 0, 0, 0},
                {6, 0, 0, 0},
                {5, 15, 4, 0}};


        KruskalAlgorithm.Graph graph = new KruskalAlgorithm.Graph(adjacency_matrix);

        graph.getKruskalSolution();
        System.out.print(graph.result);

    }
}
