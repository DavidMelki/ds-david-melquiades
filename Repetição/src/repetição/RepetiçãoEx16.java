/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetição;

/**
 *
 * @author CAMARGO
 */

public class RepetiçãoEx16 {
      public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;

        System.out.println("Série de Fibonacci até ultrapassar 500:");

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");

        int proximo = primeiro + segundo;

        while (proximo <= 610) {
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
    }
}
