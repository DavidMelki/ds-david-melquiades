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
public class WhileEx5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int maior = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            int numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("\nO maior número digitado foi: " + maior);
    }
}
