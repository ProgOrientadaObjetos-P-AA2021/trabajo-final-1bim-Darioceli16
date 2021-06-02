/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    
    private String nombreCiudad;
    private String provincia;
    
    public Ciudad(String nC, String p) {
        provincia = p;
        nombreCiudad = nC;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }
    
    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }

}
