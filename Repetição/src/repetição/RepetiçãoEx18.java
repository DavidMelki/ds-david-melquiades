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
public class RepetiçãoEx18 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos números deseja inserir? ");
        int n = teclado.nextInt();

        int numero;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int contador = 0;

        while (contador < n) {
            System.out.print("Digite o " + (contador + 1) + "º número (entre 0 e 1000): ");
            numero = teclado.nextInt();

            if (numero >= 0 && numero <= 1000) {
                soma += numero;
                if (numero < menor) menor = numero;
                if (numero > maior) maior = numero;
                contador++;
            } else {
                System.out.println("Número inválido! Insira um valor entre 0 e 1000.");
            }
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        teclado.close();
    }
}
