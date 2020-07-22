package com.company;

import java.util.*;

    public class Amplitud {



        public static LinkedList breadthFirstSearch(int[][] matrix, int source){
            LinkedList<String> list= new LinkedList<>();
            boolean[] visited = new boolean[matrix.length];
            visited[source-1] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);
            System.out.println(" El root del grafo es "+ source);
            while(!queue.isEmpty()){
                int x = queue.poll();
                int i;
                for(i=0; i<matrix.length;i++){
                    if(matrix[x-1][i] == 1 && visited[i] == false){
                        queue.add(i+1);;
                        visited[i] = true;
                       String display= (x+"---->"+(i+1));
                       list.add(display);
                    }
                }
            }
            return list;
    }




}
