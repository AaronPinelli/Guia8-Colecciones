
package todosMains;

import java.util.Scanner;
import servicios.serviceTienda;


public class menuTienda {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        serviceTienda LC = new serviceTienda();
        boolean it = true;
       
        do{
            System.out.println("Ingrese el numero del cual hecho quiere que suceda.");
            System.out.println("1 - Ingresar producto");
            System.out.println("2 - Borrar un producto");
            System.out.println("3 - Mostrar todo");
            System.out.println("4 - salir");
            int respuesta = leer.nextInt();
            
            if(respuesta == 1){
                LC.crearProducto();
            }else{
                if(respuesta == 2){
                    LC.eliminarProducto();
                }else{
                    if(respuesta == 3 ){
                    LC.mostrarTodo();
                    }else{
                        if(respuesta == 4 ){
                            it = false;
                        }
                        
                  }
               }
            }
            
            
            
        }while(it);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
