package com.company;

    public class ImpresionDijkstra {
        public ImpresionDijkstra(int startVertex, int[] distances, int[] parents) {
            int nVertices = distances.length;
            System.out.print("Vertice\t Distancia\tCamino de nodos");

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (vertexIndex != startVertex) {
                    System.out.print("\n" + startVertex + " -> ");
                    System.out.print(vertexIndex + " \t\t ");
                    System.out.print(distances[vertexIndex] + "\t\t");
                    printPath(vertexIndex, parents);
                }
            }
        }

        private static void printPath(int currentVertex, int[] parents) {

            if (currentVertex == -1) {
                return;
            }
            printPath(parents[currentVertex], parents);
            System.out.print(currentVertex + " ");
        }
    }
