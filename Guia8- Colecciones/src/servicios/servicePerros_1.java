
package servicios;

import Archivos.perros_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class servicePerros_1 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<String> crearPerros(){
        ArrayList<String> l1 = new ArrayList();
        perros_1 l2 = new perros_1();
        
        boolean Respuesta = true;
        
        do{
            
            System.out.println("Ingrese la raza del perro.");
            l2.setRaza(leer.next());
            
            
            
            l1.add(l2.getRaza());
            
            System.out.println("Desea agregar otro perro? (si o no)");
            String siOno = leer.next();
            if("si".equals(siOno)){
                Respuesta = true;
            }else{
                if("no".equals(siOno)){
                Respuesta = false;
            }
            }
        }while(Respuesta);
        
        Iterator iterator = l1.iterator(); // Devolvemos el iterador
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Ingrese un perro para buscar.");
        String perroEliminar = leer.next();
        boolean fichado = false;
        while (iterator.hasNext()){
             if(iterator.next().equals(perroEliminar)){
                 iterator.remove();
                 fichado = true;
             }
        }
        if(fichado == true){
            System.out.println("El perro fue eliminado. :(");
        }else{
            System.out.println("El perro no se encontro en la lista.");
        }
        
        Collections.sort(l1);
         System.out.println("");
        System.out.println("----------------------");
         System.out.println("Elementos de la lista: ");
   
        for(String cadena : l1){
            System.out.println(cadena);
        }
       
        return l1;
    }
    
    
}
                                                                                  