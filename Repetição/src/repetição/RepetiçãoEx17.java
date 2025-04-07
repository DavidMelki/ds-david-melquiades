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
public class RepetiçãoEx17 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro para calcular o fatorial: ");
        int numero = teclado.nextInt();
        
        long fatorial = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i != 1) {
                System.out.print(" . ");
            }
        }

        System.out.println(" = " + fatorial);
        
        teclado.close();
     }
}
