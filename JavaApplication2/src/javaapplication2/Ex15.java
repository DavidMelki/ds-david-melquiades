/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex15 {
      public static void main(String[] args) {
        int[] vetor = {10, 21, 32, 43, 54, 65, 76, 87, 98, 109}; // Exemplo de vetor

        System.out.println("Elementos nas posições ímpares:");

        for (int i = 1; i < vetor.length; i += 2) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
