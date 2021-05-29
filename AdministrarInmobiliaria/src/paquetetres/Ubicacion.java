/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

/**
 *
 * @author reroes
 */
public class Ubicacion {
    
    private String nombreBarrio;
    private String referencia;
    private String numeroCasa;

    public void establecerNombreBarrio(String n) {
        nombreBarrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }

    public void establecerNumeroCasa(String n) {
        numeroCasa = n;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }
    
    public String obtenerReferencia() {
        return referencia;
    }
        
    public String obtenerNumeroCasa() {
        return numeroCasa;
    }

}
