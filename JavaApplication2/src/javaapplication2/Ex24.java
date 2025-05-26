/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Ex24 {
        public static void main(String[] args) {
        int[] vetor = {29, 10, 14, 37, 13, 5, 25, 17, 2, 19, 30, 8, 12, 23, 27,
                       15, 9, 21, 3, 20, 6, 7, 11, 18, 1, 22, 24, 26, 28, 4};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int num : vetor) {
            if (num > maior) {
                segundoMaior = maior;
                maior = num;
            } else if (num > segundoMaior && num != maior) {
                segundoMaior = num;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O segundo maior valor é: " + segundoMaior);
    }
}
