/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex6 {
      public static void main(String[] args) {
        int[] vetor = {10, 21, 32, 43, 54, 65, 76, 87, 98, 109}; // Exemplo de vetor

        System.out.println("Elementos nas posições pares:");

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }
    }
}
