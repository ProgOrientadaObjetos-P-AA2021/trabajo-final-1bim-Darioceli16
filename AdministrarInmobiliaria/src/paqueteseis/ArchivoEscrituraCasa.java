/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

/**
 *
 * @author Smart
 */
public class ArchivoEscrituraCasa {
    
    private String nombreArchivo;
    private String rutaArchivo;
    private Casa registro;
    private Formatter salidaArchivo;

    public ArchivoEscrituraCasa(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());
        // sacar la información del archivo, previo a volver 
        // a trabajar con el mimso.
        establecerInformacionAnterior();

    }

    public void establecerInformacionAnterior() {
        ArchivoLecturaCasa lectura = new ArchivoLecturaCasa(nombreArchivo);
        lectura.establecerLista();
        ArrayList<Casa> lista = lectura.obtenerLista();

        try {
            salidaArchivo = new Formatter(rutaArchivo);
            if (lista != null) {

                if (lista.size() > 0) {
                    for (int i = 0; i < lista.size(); i++) {
                        Casa p1 = lista.get(i);
                        establecerRegistro(p1);
                        establecerSalida();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt", obtenerNombreArchivo());
    }

    public void establecerRegistro(Casa n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Casa obtenerRegistro() {
        return registro;
    }

    // agrega registros al archivo
    public void establecerSalida() {
        try {
            Casa p = obtenerRegistro();
            String cadenaRegistro = String.format("%d;%f:%d;%f\"",
                    p.obtenerNumeroMetro(),
                    p.obtenerPrecioMetro(),
                    p.obtenerNumeroCuarto(),
                    p.obtenerCostoFinal());
            salidaArchivo.format("%s\n", cadenaRegistro);

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }

    }

    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        } // cierra el archivo

    }
}
