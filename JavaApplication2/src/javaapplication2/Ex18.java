/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex18 {
     public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // vetor ordenado
        int elementoBuscado = 13;

        int indice = buscaBinaria(vetor, elementoBuscado);

        if (indice != -1) {
            System.out.println("Elemento " + elementoBuscado + " encontrado na posição: " + indice);
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado no vetor.");
        }
    }

    public static int buscaBinaria(int[] vetor, int elemento) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == elemento) {
                return meio;
            } else if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // elemento não encontrado
    }
}
