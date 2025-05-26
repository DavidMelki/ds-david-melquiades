/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
import java.util.Arrays;
public class Ex22 {
     public static void main(String[] args) {
        int[] vetor = {29, 10, 14, 37, 13, 5, 25, 17, 2, 19, 30, 8, 12, 23, 27,
                       15, 9, 21, 3, 20, 6, 7, 11, 18, 1, 22, 24, 26, 28, 4};

        // Ordena o vetor
        Arrays.sort(vetor);

        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        double mediana;
        int n = vetor.length;

        if (n % 2 == 0) {
            // Se o número de elementos for par, mediana é a média dos dois centrais
            mediana = (vetor[n / 2 - 1] + vetor[n / 2]) / 2.0;
        } else {
            // Se ímpar, mediana é o elemento central
            mediana = vetor[n / 2];
        }

        System.out.println("\nMediana dos elementos: " + mediana);
    }
}
