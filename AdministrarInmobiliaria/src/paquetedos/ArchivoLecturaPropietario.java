/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class ArchivoLecturaPropietario {
     
    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Propietario> lista;

    public ArchivoLecturaPropietario(String n) {
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

                ArrayList<String> linea_partes = new ArrayList<>( Arrays.asList(linea.split(";")));
                String nom = (linea_partes.get(1));
                String ape = (linea_partes.get(2));
                String ced = (linea_partes.get(3));
                Propietario p = new Propietario(nom,ape,ced);
                lista.add(p);

            } // fin de while
        }
    }

    public ArrayList<Propietario> obtenerLista() {
        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Propietario\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s\nNombre: ;%s\nApellido: ;%s\nIdentificacion",
                    obtenerLista().get(i).obtenerNombre(),
                    obtenerLista().get(i).obtenerApellido(),
                    obtenerLista().get(i).obtenerIdentificacion());
        }
        return cadena;
    }

}
