/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetição;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class RepetiçãoEx13 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = teclado.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("Valor inválido! Digite um valor entre 1 a 10.");
            }
        } while (numero < 1 || numero > 10);

        
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }        
   }        
}
