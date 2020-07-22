package com.company.Ejecutables;

import com.company.Dijkstra;
import com.company.ImpresionDijkstra;

public class DijkstraPrincipal {
    public static void main(String... arg) {
int source =1;

    int L= Integer.MAX_VALUE;

    int adjacency_matrix[][] = {{0, 10, 0, 0, 0, 0},
                                {0,0, 15, 0, 0, 0},
                                     {15, 0, 0, 4, 10, 0},
                                     {0, 12, 4, 0, 2, 1},
                                     {0, 0, 4, 0, 0, 0},
                                     {0, 15, 4, 0, 5, 0}};

        Dijkstra djk = new Dijkstra();
        djk.dijkstra(adjacency_matrix,source);
        ImpresionDijkstra id = new ImpresionDijkstra(djk.startVertexP, djk.distancesP, djk.parentsP);


    }
}