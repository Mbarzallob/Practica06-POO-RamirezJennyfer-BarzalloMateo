/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica06.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica06.ramirezjennyfer.barzallomateo.controlador.ControladorArchivo;
import java.io.File;

/**
 *
 * @author SOPORTETICS
 */
public class PruebasP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ControladorArchivo controladorArchivo = new ControladorArchivo();
//        controladorArchivo.crearArchivo("C:/PruebasProgra", "Pruebas1");
//        controladorArchivo.crearArchivo("C:/PruebasProgra", "Pruebas3");
//        controladorArchivo.crearArchivo("C:/PruebasProgra", "Pruebas4");
//        controladorArchivo.eliminarArchivo("C:/PruebasProgra");
//        controladorArchivo.renombrarArchivo("C:/PruebasProgra", "Pruebas", "Pruebas2");
//        File[] r = controladorArchivo.listar("C:/PruebasProgra");
//        for (File file : r) {
//            System.out.println(file);
//        }
        File archivo = new File("C:/PruebasProgra");
        File[] ar = archivo.listFiles();
        for (File file : ar) {
            System.out.println(file.getName());
        }
    }

}
