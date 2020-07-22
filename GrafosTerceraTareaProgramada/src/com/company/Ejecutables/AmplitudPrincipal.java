package com.company.Ejecutables;

import com.company.Amplitud;

import java.util.LinkedList;

public class AmplitudPrincipal {

    public static void main(String[] args) {
        Amplitud amplitud= new Amplitud();
        LinkedList<String>despliegue=new LinkedList<>();

        int matrix [][]=  {{0,1,0,1,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0},
                {1,1,0,0,1,1,0},
                {0,1,1,1,0,1,1},
                {0,0,0,1,1,0,1},
                {0,0,0,0,1,1,0}};

        // Hacer otra matriz

        despliegue=Amplitud.breadthFirstSearch(matrix,1);

        for (int i=0;i<despliegue.size();i++){
            System.out.println(despliegue.get(i));

        }


    }
}
