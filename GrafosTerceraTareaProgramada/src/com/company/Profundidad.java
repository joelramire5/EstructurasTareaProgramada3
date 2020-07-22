package com.company;


import java.util.LinkedList;
import java.util.Stack;

public class Profundidad{

    public LinkedList depthFirstSearch(int[][] matrix, int source){

        LinkedList<String> list= new LinkedList<>();

        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        System.out.println("El Root del Grafo es: "+source);
        int i,x;
        while(!stack.isEmpty()){
            x = stack.pop();
            for(i=0; i<matrix.length; i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    stack.push(x);
                    visited[i] = true;
                    String display=x+"---->"+(i+1);
                    list.add(display);
                    x = i+1;
                    i = -1;
                }
            }
        }
        return list;
    }

}



