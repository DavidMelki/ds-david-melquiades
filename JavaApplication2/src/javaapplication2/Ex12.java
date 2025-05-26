/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex12 {
       public static void main(String[] args) {
        int[] vetor = {5, 12, 7, 20, 3, 15, 8, 10, 6, 18}; // Exemplo de vetor

        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }

        double media = (double) soma / vetor.length;

        int contador = 0;
        for (int num : vetor) {
            if (num > media) {
                contador++;
            }
        }

        System.out.println("Média dos elementos: " + media);
        System.out.println("Quantidade de elementos maiores que a média: " + contador);
    }
}
