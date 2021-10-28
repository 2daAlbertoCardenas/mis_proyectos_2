/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class collection {

    
    public static void main(String[] args) {
        //-----------------------------------------------------------------------
        //Arrays
        String[] nombresArray=new String[5];//creacion de un objeto del tipo
                                           //"Sttring", es decir un arreglo de 
                                           // 1 dimensionado y 5 lugares para 
                                           //guardar ingformación.
        //Se introducen de manera automatica los valores con un "for".
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito" + (i+1);
        }
        //Muestra de valres con una nueva forma.
        for (String var : nombresArray) {
            System.out.println(var);
        }
        //---------------------------------------------------------------------
        //Collections
        ArrayList<String> nombresArrayList=new ArrayList();//se instacia con new
                                                           //el new lo hace nacer.
        //Esto añade tres objetos al ArryList
        nombresArrayList.add("chiqui");
        nombresArrayList.add("chiqui");
        nombresArrayList.add("chiqui");
        
        System.out.println(nombresArrayList.size());
        nombresArrayList.remove("chiqui");
        
        System.out.println(nombresArrayList.size());
        
        for (String var2 : nombresArrayList) {
            System.out.println(var2);
        }
        
    }
    
}
