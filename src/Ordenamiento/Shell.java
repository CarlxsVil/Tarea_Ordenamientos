/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.util.Random;

/**
 *
 * @author CARLOS
 */
public class Shell {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("Ordenamiento ShellSort");
        int nElementos = 1000000;
        int array[] = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            array[i] = (r.nextInt(nElementos));
        }
        System.out.println("\nValores antes del sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        shellSort(array);
        System.out.print("\nValores despues del sort:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void shellSort(int[] a) {
        for (int k = a.length / 2; k > 0; k /= 2) {
            for (int i = k; i < a.length; i++) {
                for (int j = i; j >= k && a[j - k] > a[j]; j -= k) {
                    int tmp = a[j];
                    a[j] = a[j - k];
                    a[j - k] = tmp;
                }
            }
        }
    }

}
