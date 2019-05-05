/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Validador.Validador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gilio
 */
public class Menu {

    ArrayList<Polera> poleras = new ArrayList();
    Validador val = new Validador();

    public void verPoleras() {
        for (int i = 0; i < poleras.size(); i++) {
            System.out.println(i);
            System.out.println(" Talla: " + poleras.get(i).getTalla());
            System.out.println(" Material: " + poleras.get(i).getMaterial());
            System.out.println(" Estampado: " + poleras.get(i).getEstanpado());
            System.out.println("");
        }
    }

    public void agregarPolera() {
        boolean estado = true;
        boolean estampado;
        String material = "Algodon";
        String talla = "XL";
        estampado = false;
        recibirPolera(talla, material, estampado);
    }

    public void recibirPolera(String talla, String material, boolean estampado) {
        Polera pol = new Polera(talla, material, estampado);
        poleras.add(pol);
    }

    public void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?");
        System.out.println();
        System.out.println("1.- Ver poleras");
        System.out.println("2.- Agregar polera");
        System.out.println("3.- Cerrar programa");

        int opcn = val.validarNumero();
        seleccion(opcn);
    }

    public void seleccion(int opcn) {

        switch (opcn) {
            case 1:
                verPoleras();
                menu();
                break;

            case 2:
                menu();
                break;

            case 3:
                System.out.println("Que tenga un buen día.");
                System.exit(0);
                break;

            default:
                menu();
                break;
        }

    }
}
