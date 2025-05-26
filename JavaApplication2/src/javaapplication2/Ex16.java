/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex16 {
     public static void main(String[] args) {
        int[] vetor = {5, 12, 7, 20, 3, 15, 8, 10, 6, 18, 9, 14, 2, 11, 16, 4, 13, 1, 19, 17}; // vetor com 20 elementos
        int elementoBuscado = 15; // elemento que queremos encontrar
        int indiceEncontrado = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoBuscado) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.println("Elemento " + elementoBuscado + " encontrado na posição: " + indiceEncontrado);
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado no vetor.");
        }
    }
}
