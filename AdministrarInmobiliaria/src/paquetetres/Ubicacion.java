/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable {

    private String nombreBarrio;
    private String referencia;
    private String numeroCasa;

    public Ubicacion(String nB, String r) {
        nombreBarrio = nB;
        referencia = r;
    }

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
