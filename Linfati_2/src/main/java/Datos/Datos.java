/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author gilio
 */
public class Datos {

    public static ArrayList<String> leerArchivo(String ruta) {
        ArrayList<String> texto = new ArrayList();
        File archivo = new File(ruta);
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            br.readLine();
            while ((line = br.readLine()) != null) {
                texto.add(line);
            }
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }

    public static String seleccionarArchivo() {
        boolean estado = true;
        String ruta = "";
        while (estado) {
            try {
                JFileChooser j = new JFileChooser();
                j.showOpenDialog(j);
                ruta = j.getSelectedFile().getAbsolutePath();
                estado = false;
            } catch (Exception e) {
                System.out.println("Error al selecionar archivo");
            }
        }
        return ruta;
    }

    public static String recibirPalabra() {
        String num = " ";
        boolean estado = true;

        while (estado) {

            try {
                System.out.println("Ingrese el texto que desea agregar");
                Scanner sc = new Scanner(System.in);

                num = sc.nextLine();
                estado = false;

            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es una palabra, intentelo nuevamente.");
                estado = true;
            }

        }
        return num;
    }

    public static String recibirRuta() {

        String ruta = JOptionPane.showInputDialog("Escriba la ruta del archivo");

        return ruta;
    }
}
