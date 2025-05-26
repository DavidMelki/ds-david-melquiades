/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex10 {
    public static void main(String[] args) {
        int[] vetor = {5, -3, 12, -7, 0, 8, -1, 4, -9, 6}; // Exemplo de vetor

        System.out.println("Vetor após substituir valores negativos por zero:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
