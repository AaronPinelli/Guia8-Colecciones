
package servicios;

import Archivos.Pelicula4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ServicePelicula {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula4> Peliculas1 = new ArrayList();
    
    
    public void crearPelicula(){
        
        boolean Respuesta = true;
        
        do{
        Pelicula4 l1  = new Pelicula4();
        System.out.println("--------------------------------------------");
        System.out.println("INGRESE EL NOMBRE DE LA PELICULA");
        l1.setNombreDePelicula(leer.next());
        System.out.println("INGRESE EL NOMBRE DEL DIRECTOR");
        l1.setDirectorDePelicula(leer.next());
        System.out.println("INGRESE LA DURACION");
        l1.setDuracionDePelicula(leer.nextInt());
         Peliculas1.add(l1);
        System.out.println("--------------------------------------------");
        
        System.out.println("_______________________________________________");
        System.out.println("Desea ingresar otra pelicula?(SI o NO)");
        String Res1 = leer.next();
        System.out.println("_______________________________________________");
        
        

        if("si".equals(Res1)){
            Respuesta = true;
        }else{
             if("no".equals(Res1)){
                Respuesta = false;
              }
          }
        }while(Respuesta);
       
        
    }
    
    
    public void mostrarPeliculas(){
         System.out.println("________________________________________________________");
        System.out.println("------------TODAS LAS PELICULAS------------------");
        System.out.println("________________________________________________________");
        for(Pelicula4 cadena : Peliculas1){
            System.out.println(cadena);
        }
        System.out.println("________________________________________________________");
    }
    public void mostrarHora(){
        System.out.println("________________________________________________________");
        System.out.println("------------ PELICULAS MAYOR A 1 HORA------------------");
        System.out.println("________________________________________________________");
         for(Pelicula4 cadena : Peliculas1){
             if(cadena.getDuracionDePelicula() >= 60){
            System.out.println(cadena);
        }
       }
         System.out.println("________________________________________________________");
    }
    public void mostrarMayor(){
        System.out.println("________________________________________________________");
        System.out.println("-------------DE  MENOR A MAYOR----------------");
        System.out.println("________________________________________________________");
        Peliculas1.sort(Pelicula4.compararDuracion);
        for(Object cadena : Peliculas1){
            System.out.println(cadena);
        }
        System.out.println("________________________________________________________");
    }
    public void mostrarMenor(){
        System.out.println("________________________________________________________");
        System.out.println("-------------DE MAYOR A MENOR----------------");
        System.out.println("________________________________________________________");
        Collections.reverse(Peliculas1);
         for(Object cadena : Peliculas1){
            System.out.println(cadena);
        }
        System.out.println("________________________________________________________");
        
    }
    public void porTitulo(){
        System.out.println("________________________________________________________");
        System.out.println("-------------POR TITULO----------------");
        System.out.println("________________________________________________________");
          Peliculas1.sort(Pelicula4.compararNombre);
           for(Object cadena : Peliculas1){
            System.out.println(cadena);
        }
           System.out.println("________________________________________________________");
      }
   public void porDire(){
       System.out.println("________________________________________________________");
        System.out.println("-------------POR DIRECTOR----------------");
        System.out.println("________________________________________________________");
       Peliculas1.sort(Pelicula4.compararDirector);
           for(Object cadena : Peliculas1){
            System.out.println(cadena);
        }
           System.out.println("________________________________________________________");
   }
   
   
   public void menu(){
      mostrarPeliculas();
      mostrarHora();
      mostrarMayor();
      mostrarMenor();
      porTitulo();
      porDire();
   }
}
    

