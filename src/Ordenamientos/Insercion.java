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
public class Insercion {
    public static void main(String[] args) {
        Random r = new Random();
        int nElementos = 1000, aux, pos;
        int arreglo[] = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            arreglo[i] = (r.nextInt(nElementos));
        }
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while   ((pos>0) && (arreglo[pos-1]>aux)) {
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.print("\nOrden Ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
