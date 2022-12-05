
package servicios;

import Archivos.tiendaEnt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class serviceTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String,Integer> NombreMap = new HashMap();
    tiendaEnt l1 = new tiendaEnt();
    
    public  void crearProducto(){
        System.out.println("-------------------------------------");
        System.out.println("Ingrese  el nombre del nuevo producto :");
        l1.setNombreProducto(leer.next());
        System.out.println("Ingrese el precio del producto : ");
        l1.setPrecioProducto(leer.nextInt());
        NombreMap.put(l1.getNombreProducto(),l1.getPrecioProducto());
        System.out.println("-------------------------------------");
    }
    public void eliminarProducto(){
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el producto que desea eliminar: ");
        String ProductoEliminar = leer.next();
        System.out.println("");
        Boolean res = false;
        for(String nombre : NombreMap.keySet()){
            if(ProductoEliminar.equals(nombre)){
                NombreMap.remove(nombre);
                res = true;
            }
        }
        if(res == false){
            System.out.println("No se encontro el producto en la tienda.");
        }else{
            if(res == true){
                System.out.println("El producto fue eliminado.");
            }
        }
        System.out.println("-------------------------------------");
    }
    public void mostrarTodo(){
        System.out.println("-------------------------------------");
        for(Map.Entry<String,Integer> cadena : NombreMap.entrySet()){
            System.out.println("°  | Producto = " + cadena.getKey() + " |  Precio = " + cadena.getValue());
        }
        System.out.println("-------------------------------------");
    }
    
    
    
    
    
    
    
}
