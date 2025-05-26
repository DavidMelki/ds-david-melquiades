/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex17 {
       public static void main(String[] args) {
        int[] vetor = {20, 5, 18, 12, 7, 15, 3, 14, 8, 1, 10, 6, 4, 9, 2, 19, 11, 17, 16, 13};

        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor);

        bubbleSort(vetor);

        System.out.println("\nVetor após a ordenação:");
        imprimirVetor(vetor);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
