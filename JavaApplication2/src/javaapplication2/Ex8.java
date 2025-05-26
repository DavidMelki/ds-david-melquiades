/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex8 {
    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Exemplo de vetor
        int constante = 3;

        System.out.println("Vetor após multiplicação por " + constante + ":");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * constante;
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
