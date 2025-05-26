/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex14 {
     public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 9, 4, 6, 2, 8, 0, 5}; // Exemplo de vetor

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 5) {
                vetor[i] = 5;
            }
        }

        System.out.println("Vetor após substituição:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
