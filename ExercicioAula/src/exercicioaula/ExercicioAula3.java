/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula;

/**
 *
 * @author CAMARGO
 */
public class ExercicioAula3 {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String Nome = "Joao";
    float salario_fixo = 10000;
    float total_vendas = 30000;
    float salario_final;
    float comissao;
     
    comissao = total_vendas*0.15f;
    salario_final = salario_fixo + comissao;
    System.out.println("Programa para determinar o salario final");
        System.out.println("O salario final de Joao ao mês é "+salario_final);
    }
}
