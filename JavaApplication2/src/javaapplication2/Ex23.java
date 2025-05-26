/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex23 {
    public static void main(String[] args) {
        int[] vetor = {29, 10, 14, 37, 13, 5, 25, 17, 2, 19, 30, 8, 12, 23, 27,
                       15, 9, 21, 3, 20, 6, 7, 11, 18, 1, 22, 24, 26, 28, 4};

        System.out.println("Vetor antes da rotação:");
        imprimirVetor(vetor);

        rotacionarDireita(vetor);

        System.out.println("\nVetor após rotacionar para a direita em uma posição:");
        imprimirVetor(vetor);
    }

    public static void rotacionarDireita(int[] vetor) {
        int n = vetor.length;
        int ultimo = vetor[n - 1]; // guarda o último elemento

        for (int i = n - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1]; // desloca elementos para a direita
        }

        vetor[0] = ultimo; // coloca o último elemento na primeira posição
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
