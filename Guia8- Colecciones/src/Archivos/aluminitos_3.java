
package Archivos;

import java.util.ArrayList;


public class aluminitos_3 {
    
   private String nombre;
    private ArrayList<Integer> notas;

    public aluminitos_3() {
        this.notas = new ArrayList();
    }

    public aluminitos_3(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
    
    
    
    
    
}


