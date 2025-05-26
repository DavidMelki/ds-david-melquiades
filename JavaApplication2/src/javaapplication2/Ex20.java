/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
import java.util.ArrayList;
public class Ex20 {
      public static void main(String[] args) {
        int[] vetor = {5, 12, 7, 4, 3, 15, 8, 10, 6, 18, 7, 14, 2, 11, 3, 4, 13, 1, 19, 10};

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // Convertendo ArrayLists para arrays
        int[] vetorPares = new int[pares.size()];
        int[] vetorImpares = new int[impares.size()];

        for (int i = 0; i < pares.size(); i++) {
            vetorPares[i] = pares.get(i);
        }

        for (int i = 0; i < impares.size(); i++) {
            vetorImpares[i] = impares.get(i);
        }

        System.out.println("Elementos pares:");
        for (int num : vetorPares) {
            System.out.print(num + " ");
        }

        System.out.println("\nElementos ímpares:");
        for (int num : vetorImpares) {
            System.out.print(num + " ");
        }
    }
}
