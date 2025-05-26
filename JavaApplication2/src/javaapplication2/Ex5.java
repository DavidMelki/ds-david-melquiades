/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30}; // Exemplo de vetor

        int pares = 0;
        int impares = 0;

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
