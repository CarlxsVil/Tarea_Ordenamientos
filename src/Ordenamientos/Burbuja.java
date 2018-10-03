/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

import java.util.Random;

/**
 *
 * @author CARLOS
 */
public class Burbuja {
    public static void main(String[] args) {
        Random r = new Random();
        int aux;
        int nElementos = 500000;
        int arreglo[] = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            arreglo[i] = (r.nextInt(nElementos));
        }
        for (int i = 0; i < nElementos - 1; i++) {
            for (int j = 0; j < nElementos - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo en forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.print("");
    }
}
