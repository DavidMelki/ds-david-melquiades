/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex7 {
      public static void main(String[] args) {
        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50}; // Exemplo de vetor
        int soma = 0;

        for (int num : vetor) {
            soma += num;
        }

        double media = (double) soma / vetor.length;

        System.out.println("A média dos elementos do vetor é: " + media);
    }
}
