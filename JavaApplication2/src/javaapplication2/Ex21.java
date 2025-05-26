/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex21 {
  public static void main(String[] args) {
        int[] vetor = {29, 10, 14, 37, 13, 5, 25, 17, 2, 19, 30, 8, 12, 23, 27, 15, 9, 21, 3, 20, 6, 7, 11, 18, 1, 22, 24, 26, 28, 4};

        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor);

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("\nVetor após a ordenação:");
        imprimirVetor(vetor);
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, pivoIndex - 1);
            quickSort(vetor, pivoIndex + 1, fim);
        }
    }

    public static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

