/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex13 {
      public static void main(String[] args) {
        int[] vetor = {3, 5, 9, 12, 14, 18, 20, 21, 25, 30}; // Exemplo de vetor

        System.out.println("Elementos múltiplos de 3:");

        for (int num : vetor) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
