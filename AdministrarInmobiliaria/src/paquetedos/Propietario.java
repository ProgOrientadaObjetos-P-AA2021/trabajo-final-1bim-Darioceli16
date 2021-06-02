/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Propietario implements Serializable {

    private String nombre;
    private String apellido;
    private String id;

    public Propietario(String a, String b, String c) {
        nombre = a;
        apellido = b;
        id = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String b) {
        apellido = b;
    }

    public void establecerIdentificacion(String c) {
        id = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIdentificacion() {
        return id;
    }
}
