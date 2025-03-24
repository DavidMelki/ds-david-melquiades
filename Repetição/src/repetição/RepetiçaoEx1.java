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
public class RepetiçaoEx1 {
      public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
          System.out.println("Informe um valor");
          double valor = teclado.nextDouble();
          System.out.println("Informe um segundo valor");
          double valor2 = teclado.nextDouble();
          
          while (valor2 == 0)
          {
              System.out.println("Valor inválido");
              valor2 = teclado.nextDouble();
          }
          double divisao = valor/valor2;
          System.out.println("O Resultado entre os valores é:" + divisao);
          
          
      
      }
}
