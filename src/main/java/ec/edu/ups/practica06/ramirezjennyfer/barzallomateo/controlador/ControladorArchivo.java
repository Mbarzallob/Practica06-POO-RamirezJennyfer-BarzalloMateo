/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica06.ramirezjennyfer.barzallomateo.controlador;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorArchivo {

    public ControladorArchivo() {
    }

    public boolean crearArchivo(String url, String nombre) {
        try {
            String urlFinal = url + "/" + nombre + ".txt";
            File archivo = new File(urlFinal);
            archivo.createNewFile();
            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public void eliminarArchivo(String url) {

        File archivo = new File(url);
        if (archivo.isDirectory()) {
            File[] archivos = archivo.listFiles();
            if (archivos != null) {
                for (File ar : archivos) {
                    eliminarArchivo(ar.getAbsolutePath());
                }
            }
        }
        archivo.delete();

    }

    public void renombrarArchivo(String url, String urlren, String renombrar) {

        File archivoR = new File(urlren);
        if (archivoR.isDirectory()) {
            File archivoD = new File(url + "/" + renombrar);

            archivoR.renameTo(archivoD);
        } else if (archivoR.isFile()) {
            File archivoD = new File(url + "/" + renombrar + ".txt");

            archivoR.renameTo(archivoD);
        }
    }

}
