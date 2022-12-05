/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todosMains;

import servicios.servicePais;

/**
 *
 * @author Jesica
 */
public class menuPaises {

   
    public static void main(String[] args) {
        
        
        servicePais LC = new servicePais();
        
        LC.crearPais();
    }
    
}
