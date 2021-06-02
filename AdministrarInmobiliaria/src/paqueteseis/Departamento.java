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
public class Departamento implements Serializable {

    private double precioMetroD;
    private int numeroMetroD;
    private double costoFiD;
    private double valorAli;
    private double precio;
    private String nombreEdificio;
    private String ubicacionDepar;
    private Propietario propietario;
    private Ubicacion ubicacion;
    private Constructora constructora;
    private Ciudad ciudad;

    public void establecerPrecioMetroD(double n) {
        precioMetroD = n;
    }

    public void establecerNumeroMetroD(int n) {
        numeroMetroD = n;
    }

    public void establecerCostoFinalD() {
        costoFiD = (numeroMetroD * precioMetroD) + (valorAli * 12);
    }

    public void establecerValorAlicuota(double n) {
        valorAli = n;
    }

    public void establecerPrecio(double n) {
        precio = n;
    }

    public void establecerNombreEdificio(String n) {
        nombreEdificio = n;
    }

    public void establecerUbicacionDepartamento(String n) {
        ubicacionDepar = n;
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

    public double obtenerPrecioMetroD() {
        return precioMetroD;
    }

    public int obtenerNumeroMetroD() {
        return numeroMetroD;
    }

    public double obtenerCostoFinalD() {
        return costoFiD;
    }

    public double obtenerValorAlicuota() {
        return valorAli;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacionDepartamento() {
        return ubicacionDepar;
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
