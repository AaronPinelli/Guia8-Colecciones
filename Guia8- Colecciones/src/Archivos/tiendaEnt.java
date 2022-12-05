
package Archivos;


public class tiendaEnt {
    
    private String NombreProducto;
    private int precioProducto;

    public tiendaEnt() {
    }

    public tiendaEnt(String NombreProducto, int precioProducto) {
        this.NombreProducto = NombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
    
    
    
}
