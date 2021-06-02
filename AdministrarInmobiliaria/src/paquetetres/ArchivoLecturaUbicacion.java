/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class ArchivoLecturaUbicacion {
     private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Ubicacion> lista;

    public ArchivoLecturaUbicacion(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());

        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                // entrada = new Scanner(f);
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                String nB = (linea_partes.get(1));
                String r = (linea_partes.get(2));
                String nC = (linea_partes.get(3));
                Ubicacion p1 = new Ubicacion(nB,r);

                lista.add(p1);

            } // fin de while
        }
    }

    public ArrayList<Ubicacion> obtenerLista() {
        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Ubicaciones\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s\nNombre del barrio: ;%s\nReferencia: ;%s\nNumero de casa: ",
                    obtenerLista().get(i).obtenerNombreBarrio(),
                    obtenerLista().get(i).obtenerReferencia(),
                    obtenerLista().get(i).obtenerNumeroCasa());
        }
        return cadena;
    }
}
