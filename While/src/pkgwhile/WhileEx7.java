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
public class WhileEx7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int lado;

       
        do {
            System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
            lado = teclado.nextInt();

            if (lado < 1 || lado > 20) {
                System.out.println("Tamanho inválido. Tente novamente.");
            }
        } while (lado < 1 || lado > 20);

       
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
