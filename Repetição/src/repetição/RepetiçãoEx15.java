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
public class RepetiçãoEx15 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        n = teclado.nextInt();

        int primeiro = 1, segundo = 1;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        if (n >= 1) {
            System.out.print(primeiro + " ");
        }
        if (n >= 2) {
            System.out.print(segundo + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
      } 
    }
