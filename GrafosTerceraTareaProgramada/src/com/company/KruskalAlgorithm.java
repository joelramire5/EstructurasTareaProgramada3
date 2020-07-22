package com.company;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class KruskalAlgorithm {

    public static class Graph {

        int noVertex;
        int[][] matrix;
        boolean[] markedVertex;
        Route[] routes;

        public String result = "";

        public Graph(int[][] matrix) {
            this.matrix = matrix;
            this.noVertex = matrix.length;
            this.routes = new Route[matrix.length - 1];
            this.markedVertex = new boolean[matrix.length];

            initMarks();
        }

        public void initMarks() {
            for (int i = 0; i < noVertex; i++) {
                markedVertex[i] = false;
            }
        }

        class Route {

            int weigth;
            int source;
            int destiny;

            public Route(int source, int destiny, int weigth) {
                this.source = source;
                this.destiny = destiny;
                this.weigth = weigth;
            }

        }

        public Route getMinimalRoute() {

            int minWeigth = Integer.MAX_VALUE;
            int minSource = 0;
            int minDestiny = 0;

            for (int x = 0; x < noVertex; x++) {
                for (int y = 0; y < matrix[x].length; y++) {
                    if (matrix[x][y] < minWeigth && !markedVertex[y] && matrix[x][y] != 0 && x != y) {
                        minSource = x;
                        minDestiny = y;
                        minWeigth = matrix[x][y];

                    }
                }
            }

            markedVertex[minDestiny] = true;

            return new Route(minSource, minDestiny, minWeigth);

        }

        public void kruskal() {
            int index = 0;
            while (index < noVertex - 1) {
                Route route = getMinimalRoute();
                if (route != null) {
                    routes[index] = route;
                }
                index++;

            }
        }

        public void getKruskalSolution() {
            int index = 0;
            kruskal();

            while (index < noVertex - 1) {
                this.result = this.result + "Ruta desde: " + routes[index].source + 1 + " hasta " + routes[index].destiny + 1 + " con un peso de " + routes[index].weigth + "\n";

                index++;
            }

        }
    }

}
