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
public class Ex11 {
      public static void main(String[] args) {
        int[] vetor = {12, 5, 8, 1, 19, 3, 15, 7, 10, 4}; // Exemplo de vetor

        Arrays.sort(vetor); // Ordena o vetor em ordem crescente

        System.out.println("Vetor em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
