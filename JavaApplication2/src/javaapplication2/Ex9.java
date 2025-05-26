/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex9 {
     public static void main(String[] args) {
        int[] vetor = {5, 18, 25, 12, 30, 7, 41, 16, 28, 9}; // Exemplo de vetor
        int valorEspecifico = 20;

        System.out.println("Elementos maiores que " + valorEspecifico + ":");

        for (int num : vetor) {
            if (num > valorEspecifico) {
                System.out.println(num);
            }
        }
    }
}
