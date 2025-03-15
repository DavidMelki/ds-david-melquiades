/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula;

/**
 *
*
 */
import java.util.Scanner;
public class ExercicioAula18 {
    
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ponha o número de carros vendidos: ");
        int numdecarrosvendidos = scanner.nextInt();
        
        System.out.print("Ponha o valor total de vendas: R$ ");
        double valortotaldevendas = scanner.nextDouble();
        
        System.out.print("Ponha o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Ponha o valor da comissão por carro vendido: R$ ");
        double comissaoporcarro = scanner.nextDouble();
        
        double comissaoTotal = numdecarrosvendidos * comissaoporcarro;
        double comissaoPorVendas = 0.05 * valortotaldevendas; // 5% do valor total das vendas
        double salarioFinal = salarioFixo + comissaoTotal + comissaoPorVendas;
        
        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);
        
        scanner.close();
    }
}