/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ModificMatrizLoop {
public static void main(String[] args) {
     Scanner Read = new Scanner(System.in);
     String[] Name = new String[4]; //Declarando o array de Strings com 4 elementos
     
     //Lê 4 nomes do usuário
     for(int i = 0; i < Name.length; i++) {
        System.out.print("Digite o nome" + (1+1) + "; ");
        Name[i] = Read.nextLine ();
        }
     
     //Exibe os nomes armazenados no array
     System.out.println("\nNomes obtidos:");
     for(int i = 0; i< Name.length; i++){
         System.out.println(Name[i]);
     }
     
     Read.close(); //Fecha o Scanner
    }
}
