
package Archivos;

import java.util.Comparator;


public class paises5 {
    
    private String nombrePais;

    public paises5() {
    }

    public paises5(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
     public static Comparator<paises5> compararNombres = new Comparator<paises5>(){
    @Override    
    public int compare(paises5 p1,paises5 p2){
        return p1.getNombrePais().compareTo(p2.getNombrePais());
    }
    
    };
    
    
    
}
