/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class MatrizLoop {
public static void main(String[] args) {
 String[] nome = {"Volvo", "BMW", "Ford", "Mazda"};
 String[] sobrenome = {"da Silva", "dos Santos", "de Souza", "Borba"}; //Os dois próximos "for" só fariam diferença caso eu não soubesse a informação dos vetores
 
  for (int i = 0; i < nome.length; i++) //Esse for e o próximo não fazem diferença nesse codigo
 {
     System.out.println(nome[i]);
 }
  for (int j = 0; j < sobrenome.length; j++) ///Esse for e o anterior não fazem diferença nesse codigo
  {
      System.out.println(sobrenome[j]);
  }   
  
      for (int z = 0; z < nome.length; z++)
      {
      System.out.println("Seu nome é"+nome[z]+" "+sobrenome[z]);
      }
    }
   }
