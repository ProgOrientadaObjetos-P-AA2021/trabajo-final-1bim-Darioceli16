/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable {

    private double precioMetro;
    private int numeroMetro;
    private double costoF;
    private int numeroCuarto;
    private Propietario propietario;
    private Ubicacion ubicacion;
    private Constructora constructora;
    private Ciudad ciudad;

    public void establecerPrecioMetro(double n) {
        precioMetro = n;
    }

    public void establecerNumeroMetro(int n) {
        numeroMetro = n;
    }

    public void establecerCostoFinal() {
        costoF = (numeroMetro * precioMetro);
    }

    public void establecerNumeroCuarto(int n) {
        numeroCuarto = n;
    }

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerUbicacion(Ubicacion n) {
        ubicacion = n;
    }

    public void establecerConstructora(Constructora n) {
        constructora = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public double obtenerPrecioMetro() {
        return precioMetro;
    }

    public int obtenerNumeroMetro() {
        return numeroMetro;
    }

    public double obtenerCostoFinal() {
        return costoF;
    }

    public int obtenerNumeroCuarto() {
        return numeroCuarto;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

}
