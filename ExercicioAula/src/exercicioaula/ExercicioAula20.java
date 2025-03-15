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
public class ExercicioAula20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ponha o tipo de combustível (Álcool ou Gasolina): ");
        String combustivel = scanner.nextLine().toLowerCase();
        
        System.out.print("Ponha a quantidade de litros: ");
        double litros = scanner.nextDouble();
        
        double precoporlitro = 0.0;
        double desconto = 0.0;

        if (combustivel.equals("alcool")) {
            precoporlitro = 3.50;
            desconto = (litros <= 20) ? 0.03 : 0.05; 
        } else if (combustivel.equals("gasolina")) {
            precoporlitro = 4.50; 
            desconto = (litros <= 20) ? 0.04 : 0.06; 
        } else {
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        double valorsemodesconto = litros * precoporlitro;
        double valorcomodesconto = valorsemodesconto * desconto;
        double valorFinal = valorsemodesconto - valorcomodesconto;
        
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorFinal);
        
        scanner.close();
    }
}