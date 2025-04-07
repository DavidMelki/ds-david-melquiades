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
public class RepetiçãoEx11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;

       
        do {
            System.out.print("Digite um valor maior que 0: ");
            N = teclado.nextInt();
            if (N <= 0) {
                System.out.println("Valor inválido! deve ser maior que 0!");
            }
        } while (N <= 0);

        
        System.out.println("Contando de 1 até " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
      }
    }
  
