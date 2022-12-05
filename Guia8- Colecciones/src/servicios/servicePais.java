
package servicios;

import Archivos.paises5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class servicePais {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> paisesList = new HashSet();
   Iterator<String> iterador = paisesList.iterator();
    
    public void crearPais(){
        String respuesta;
        do{
            paises5 l1 = new paises5();
            
             boolean fichado;
             boolean info;
         
                 System.out.println("Ingrese un nuevo pais.");
                 l1.setNombrePais(leer.next());
             do{
                 info = false;
                 fichado = false;
                 while (iterador.hasNext()){
                      if(iterador.next().equals(l1.getNombrePais())){
                          fichado = true;
                          info = true;
                      }
                 }
                  if( info == true){
                      System.out.println("El pais ingresado ya esta dentro de la lista, Ingrese uno diferente");
                       l1.setNombrePais(leer.next());
                  }
                 
                 
                 
            }while(fichado);    
            paisesList.add(l1.getNombrePais());
            
            
            System.out.println("¿Desea añadir otro pais? (s/n)");
            respuesta = leer.next();
        }while("s".equalsIgnoreCase(respuesta));
        
        mostrarPaises();
        
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese un pais para eliminar.");
        String paisBuscado = leer.next();
         while (iterador.hasNext()){
                      if(iterador.next().equals(paisBuscado)){
                          paisesList.remove(paisBuscado);
                          System.out.println("El pais se elimino.");
                      }else{
                          System.out.println("El pais ingresado no se encuentra en la coleccion.");
                      }
                 }
          for(String cadena : paisesList){
            System.out.println(cadena);
        }
        
        
        
        
    }
    
    public void mostrarPaises(){
        System.out.println("----------------------------");
        System.out.println("todos los paises ingresados");  
        System.out.println("----------------------------");
        for(String cadena : paisesList){
            System.out.println(cadena);
        }
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("los paises ordenados alfabeticamente");
        System.out.println("----------------------------");
         ArrayList<String> ListaNombres =  new ArrayList(paisesList);
         Collections.sort(ListaNombres);
         for(String cadena : paisesList){
            System.out.println(cadena);
        }
        System.out.println("----------------------------");
        
    }
    
}
       