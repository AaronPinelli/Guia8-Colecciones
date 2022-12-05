
package Archivos;

import java.util.ArrayList;
import java.util.Comparator;


public class Pelicula4 {
    
   private ArrayList<String> Peliculas;
    private String nombreDePelicula;
    private String directorDePelicula;
    private double duracionDePelicula;

    public Pelicula4() {
         this.Peliculas =  new ArrayList();
    }

    public Pelicula4(ArrayList<String> Peliculas, String nombreDePelicula, String directorDePelicula, double duracionDePelicula) {
       
        this.nombreDePelicula = nombreDePelicula;
        this.directorDePelicula = directorDePelicula;
        this.duracionDePelicula = duracionDePelicula;
    }

    public ArrayList<String> getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(ArrayList<String> Peliculas) {
        this.Peliculas = Peliculas;
    }

    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public String getDirectorDePelicula() {
        return directorDePelicula;
    }

    public void setDirectorDePelicula(String directorDePelicula) {
        this.directorDePelicula = directorDePelicula;
    }

    public double getDuracionDePelicula() {
        return duracionDePelicula;
    }

    public void setDuracionDePelicula(double duracionDePelicula) {
        this.duracionDePelicula = duracionDePelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + " nombreDePelicula = " + nombreDePelicula + " | directorDePelicula = " + directorDePelicula + " |  duracionDePelicula= " + duracionDePelicula + '}';
    }
    
    public static Comparator<Pelicula4> compararDuracion = new Comparator<Pelicula4>(){
    @Override    
    public int compare(Pelicula4 p1, Pelicula4 p2){
        return Double.compare(p1.getDuracionDePelicula(),p2.getDuracionDePelicula());
    }
    
    };
     public static Comparator<Pelicula4> compararDirector = new Comparator<Pelicula4>(){
    @Override    
    public int compare(Pelicula4 p1, Pelicula4 p2){
        return p1.getDirectorDePelicula().compareTo(p2.getDirectorDePelicula());
    }
    
    };
     public static Comparator<Pelicula4> compararNombre = new Comparator<Pelicula4>(){
    @Override    
    public int compare(Pelicula4 p1, Pelicula4 p2){
        return p1.getNombreDePelicula().compareTo(p2.getNombreDePelicula());
    }
    
    };
    
    
}


