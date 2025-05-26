/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex2 {
       public static void main(String[] args) {
        int[] vetor = {5, 8, 3, 2, 7, 10, 4, 6, 1, 9}; // exemplo de vetor com 10 números
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

