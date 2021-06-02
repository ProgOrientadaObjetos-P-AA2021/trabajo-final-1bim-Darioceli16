/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;
import paquetecinco.ArchivoEscrituraConstructora;
import paquetecinco.ArchivoLecturaConstructora;
import paquetecinco.Constructora;
import paquetecuatro.ArchivoEscrituraCiudad;
import paquetecuatro.ArchivoLecturaCiudad;
import paquetecuatro.Ciudad;
import paquetedos.ArchivoEscrituraPropietario;
import paquetedos.ArchivoLecturaPropietario;
import paquetedos.Propietario;
import paqueteseis.ArchivoEscrituraCasa;
import paqueteseis.ArchivoEscrituraDepartamento;
import paqueteseis.ArchivoLecturaCasa;
import paqueteseis.ArchivoLecturaDepartamento;
import paqueteseis.Casa;
import paqueteseis.Departamento;
import paquetetres.ArchivoEscrituraUbicacion;
import paquetetres.ArchivoLecturaUbicacion;
import paquetetres.Ubicacion;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        String nombreArchivo = ("propietarios.txt");
        String nombreArchivo2 = ("ciudades.txt");
        String nombreArchivo3 = ("constructoras.txt");
        String nombreArchivo4 = ("casas.txt");
        String nombreArchivo5 = ("departamentos.txt");
        String nombreArchivo6 = ("ubicaciones.txt");
        short n, opcion;
        String nom, ape, id, ciu, prov, cons, idE, barrio, ref;
        // Entrada de datos
        System.out.print("\t<< GESTION INMOBILIARIA CELI>>\n");
        System.out.println("\t===========================\n");
        System.out.print("\t<< BASE DE DATOS>>\n");
        System.out.println("\t===========================\n");
        System.out.print("Ingrese su nombre: ");
        nom = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        ape = sc.nextLine();
        System.out.print("Ingrese su identificacion: ");
        id = sc.nextLine();
        System.out.print("Ingrese el nombre de la cuidad: ");
        ciu = sc.nextLine();
        System.out.print("Ingrese el nombre de la provincia: ");
        prov = sc.nextLine();
        System.out.print("Ingrese el nombre de la constructora: ");
        cons = sc.nextLine();
        System.out.print("Ingrese la identificacion de la empresa: ");
        idE = sc.nextLine();
        System.out.print("Ingrese el nombre del Barrio: ");
        barrio = sc.nextLine();
        System.out.print("Ingrese una refencia: ");
        ref = sc.nextLine();
        System.out.print("CUANTAS INMOBILIARIAS VA A INGRESAR: ");
        n = sc.nextShort();
        for (int x = 0; x <= n - 1; x++) {
            System.out.println("\t===========================\n");
            System.out.print("\t<< TIPO DE INMOBILIARIA>>\n");
            System.out.println("\t===========================\n");
            System.out.println("Digite la opción: \n"
                    + "1 - Ingresar una Casa\n"
                    + "2 - Ingresar un Dapartamento\n"
                    + "3 - Salir");
            opcion = sc.nextShort();

            while (opcion == 1) {
                int nuM, cuarto;
                double preM;
                System.out.print("\t<< INFORMACION DE LA CASA>>\n");
                System.out.println("\t===========================\n");
                System.out.print("Ingrese el numero de metros cuadrados: ");
                nuM = sc.nextInt();
                System.out.print("Ingrese el precio por metro cuadrado: ");
                preM = sc.nextDouble();
                System.out.print("Ingrese el numero de cuartos: ");
                cuarto = sc.nextInt();
                //establecer variables
                Propietario pro1 = new Propietario();
                ArchivoEscrituraPropietario escritura = new ArchivoEscrituraPropietario(nombreArchivo);
                pro1.establecerNombre(nom);
                pro1.establecerApellido(ape);
                pro1.establecerIdentificacion(id);

                escritura.establecerRegistro(pro1);
                escritura.establecerSalida();
                escritura.cerrarArchivo();

                Ubicacion ubi1 = new Ubicacion();
                ArchivoEscrituraUbicacion escritura2 = new ArchivoEscrituraUbicacion(nombreArchivo6);
                ubi1.establecerNombreBarrio(barrio);
                ubi1.establecerReferencia(ref);

                escritura2.establecerRegistro(ubi1);
                escritura2.establecerSalida();
                escritura2.cerrarArchivo();

                Ciudad ciu1 = new Ciudad();
                ArchivoEscrituraCiudad escritura3 = new ArchivoEscrituraCiudad(nombreArchivo2);
                ciu1.establecerNombreCiudad(ciu);
                ciu1.establecerProvincia(prov);

                escritura3.establecerRegistro(ciu1);
                escritura3.establecerSalida();
                escritura3.cerrarArchivo();

                Constructora cons1 = new Constructora();
                ArchivoEscrituraConstructora escritura5 = new ArchivoEscrituraConstructora(nombreArchivo3);
                cons1.establecerNombreConstructora(cons);
                cons1.establecerIdEmpresa(idE);

                escritura5.establecerRegistro(cons1);
                escritura5.establecerSalida();
                escritura5.cerrarArchivo();

                Casa ca1 = new Casa();
                ArchivoEscrituraCasa escritura6 = new ArchivoEscrituraCasa(nombreArchivo4);
                ca1.establecerNumeroMetro(nuM);
                ca1.establecerPrecioMetro(preM);
                ca1.establecerNumeroCuarto(cuarto);
                ca1.establecerCostoFinal();

                escritura6.establecerRegistro(ca1);
                escritura6.establecerSalida();
                escritura6.cerrarArchivo();
                //lectura de datos
                ArchivoLecturaPropietario lec = new ArchivoLecturaPropietario(nombreArchivo);
                lec.establecerLista();
                System.out.println(lec);
                lec.cerrarArchivo();
                ArchivoLecturaUbicacion lec2 = new ArchivoLecturaUbicacion(nombreArchivo2);
                lec2.establecerLista();
                System.out.println(lec2);
                lec2.cerrarArchivo();
                ArchivoLecturaCiudad lec3 = new ArchivoLecturaCiudad(nombreArchivo2);
                lec3.establecerLista();
                System.out.println(lec3);
                lec3.cerrarArchivo();
                ArchivoLecturaConstructora lec5 = new ArchivoLecturaConstructora(nombreArchivo3);
                lec5.establecerLista();
                System.out.println(lec5);
                lec5.cerrarArchivo();
                ArchivoLecturaCasa lec6 = new ArchivoLecturaCasa(nombreArchivo4);
                lec6.establecerLista();
                System.out.println(lec6);
                lec6.cerrarArchivo();
            }
            while (opcion == 2) {
                int nuMeD;
                double preMeD, valorA, precio;
                String nomEdi, ubiD, nuCasa;
                System.out.print("\t<< INFORMACION DEL DEPARTAMENTO>>\n");
                System.out.println("\t===========================\n");
                System.out.print("Ingrese el numero de metros cuadrados: ");
                nuMeD = sc.nextInt();
                System.out.print("Ingrese el precio por metro cuadrado: ");
                preMeD = sc.nextDouble();
                System.out.print("Ingrese el precio de la alicuota mensual: ");
                valorA = sc.nextDouble();
                System.out.print("Ingrese el precio del departamento: ");
                precio = sc.nextDouble();
                System.out.print("Ingrese el nombre del edificio: ");
                nomEdi = sc.nextLine();
                System.out.print("Ingrese la ubicacion del departamento en el edificio: ");
                ubiD = sc.nextLine();
                System.out.print("Ingrese el numero de casa: ");
                nuCasa = sc.nextLine();
                //establecer variables
                Propietario pro2 = new Propietario();
                ArchivoEscrituraPropietario escritura1 = new ArchivoEscrituraPropietario(nombreArchivo);
                pro2.establecerNombre(nom);
                pro2.establecerApellido(ape);
                pro2.establecerIdentificacion(id);

                escritura1.establecerRegistro(pro2);
                escritura1.establecerSalida();
                escritura1.cerrarArchivo();

                Ubicacion ubi2 = new Ubicacion();
                ArchivoEscrituraUbicacion escritura2 = new ArchivoEscrituraUbicacion(nombreArchivo6);
                ubi2.establecerNombreBarrio(barrio);
                ubi2.establecerReferencia(ref);
                ubi2.establecerNumeroCasa(nuCasa);

                escritura2.establecerRegistro(ubi2);
                escritura2.establecerSalida();
                escritura2.cerrarArchivo();

                Ciudad ciu2 = new Ciudad();
                ArchivoEscrituraCiudad escritura3 = new ArchivoEscrituraCiudad(nombreArchivo2);
                ciu2.establecerNombreCiudad(ciu);
                ciu2.establecerProvincia(prov);

                escritura3.establecerRegistro(ciu2);
                escritura3.establecerSalida();
                escritura3.cerrarArchivo();

                Constructora cons2 = new Constructora();
                ArchivoEscrituraConstructora escritura5 = new ArchivoEscrituraConstructora(nombreArchivo3);
                cons2.establecerNombreConstructora(cons);
                cons2.establecerIdEmpresa(idE);

                escritura5.establecerRegistro(cons2);
                escritura5.establecerSalida();
                escritura5.cerrarArchivo();

                Departamento depar1 = new Departamento();
                ArchivoEscrituraDepartamento escritura6 = new ArchivoEscrituraDepartamento(nombreArchivo5);
                depar1.establecerNumeroMetroD(nuMeD);
                depar1.establecerPrecioMetroD(preMeD);
                depar1.establecerValorAlicuota(valorA);
                depar1.establecerPrecio(precio);
                depar1.establecerNombreEdificio(nomEdi);
                depar1.establecerUbicacionDepartamento(ubiD);
                depar1.establecerCostoFinalD();

                escritura6.establecerRegistro(depar1);
                escritura6.establecerSalida();
                escritura6.cerrarArchivo();

                //lectura de datos
                ArchivoLecturaPropietario lec1 = new ArchivoLecturaPropietario(nombreArchivo);
                lec1.establecerLista();
                // llamamos al metdo ToString
                System.out.println(lec1);
                lec1.cerrarArchivo();
                ArchivoLecturaUbicacion lec2 = new ArchivoLecturaUbicacion(nombreArchivo2);
                lec2.establecerLista();
                System.out.println(lec2);
                lec2.cerrarArchivo();
                ArchivoLecturaCiudad lec3 = new ArchivoLecturaCiudad(nombreArchivo2);
                lec3.establecerLista();
                System.out.println(lec3);
                lec3.cerrarArchivo();
                ArchivoLecturaConstructora lec5 = new ArchivoLecturaConstructora(nombreArchivo3);
                lec5.establecerLista();
                System.out.println(lec5);
                lec5.cerrarArchivo();
                ArchivoLecturaDepartamento lec6 = new ArchivoLecturaDepartamento(nombreArchivo4);
                lec6.establecerLista();
                System.out.println(lec6);
                lec6.cerrarArchivo();
                
                while (opcion == 3) {
                    System.out.println("GRACIAS POR SU COLABORACION");
                }
            }
        }
    }

}
