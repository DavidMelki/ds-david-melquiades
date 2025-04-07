/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class WhileEx3 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int limite = teclado.nextInt();

        System.out.println("\nNúmeros pares de 1 até " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNúmeros ímpares de 1 até " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
