/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {

    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String nC, String i) {
        idEmpresa = i;
        nombreConstructora = nC;
    }

    public void establecerNombreConstructora(String n) {
        nombreConstructora = n;
    }

    public void establecerIdEmpresa(String n) {
        idEmpresa = n;
    }

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public String obtenerIdEmpresa() {
        return idEmpresa;
    }
}
