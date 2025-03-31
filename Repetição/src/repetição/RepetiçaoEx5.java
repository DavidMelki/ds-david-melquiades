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
public class RepetiçaoEx5 {
     public static void main (String[] args){
         Scanner teclado = new Scanner(System.in);
         System.out.println("Informe a primeira nota");
          double nota = teclado.nextDouble();
          
          while (nota < 0|| nota > 10)
          {
              System.out.println("Valor inválido, informe umam nota de 0 a 10");
              nota = teclado.nextDouble();
          }
          
          System.out.println("Informe uma segunda nota");
          double nota2 = teclado.nextDouble();
          
          while (nota2 < 0|| nota2 > 10)
          {
              System.out.println("Valor inválido");
              nota2 = teclado.nextDouble();
          }
          double soma = nota+nota2;
          double media = soma/2; 
          System.out.println("O Resultado da usa média é:" + media);
         
     
     
     
     
     }
}
