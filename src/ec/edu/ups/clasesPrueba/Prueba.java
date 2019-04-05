/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesPrueba;

import java.util.ArrayList;

/**
 *
 * @author jonnathan
 */
public class Prueba {
    public static void main(String[]arg){
         
         ArrayList<String>Carrera;
      Carrera=new ArrayList<String>();
      
      Carrera.add("2019");
      Carrera.add("Computacion");
      Carrera.add("Sistemas");
      
      for(int i=0;i<Carrera.size();i++){
          System.out.println("-->"+Carrera.get(i)); 
      }
        
    }
    
}
