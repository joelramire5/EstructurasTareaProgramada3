package com.company.Ejecutables;

import com.company.Profundidad;

import java.util.LinkedList;

public class ProfundidadPrincipal {

    public static void main(String[] args) {

        Profundidad profundidad =new Profundidad();
        LinkedList<String> despliegue=new LinkedList<>();

        int matrix [][]=  {{0,1,0,1,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,1,0,0},
                {1,1,0,0,1,1,0},
                {0,1,1,1,0,1,1},
                {0,0,0,1,1,0,1},
                {0,0,0,0,1,1,0}};

        despliegue=profundidad.depthFirstSearch(matrix,2);

        for (int i=0;i<despliegue.size();i++){
            System.out.println(despliegue.get(i));

        }

    }
}


