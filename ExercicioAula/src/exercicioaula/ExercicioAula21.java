/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula;
/**
 *
 *@autor davidm
 */
import java.util.Scanner;
public class ExercicioAula21 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipodecombustivel = scanner.next().charAt(0); 
        
        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble(); 
        
        double precoPorLitro = 0.0;
        
        if (tipodecombustivel == 'A' || tipodecombustivel == 'a') {
            precoPorLitro = 2.90; // Preço do litro do álcool
        } else if (tipodecombustivel == 'G' || tipodecombustivel == 'g') {
            precoPorLitro = 3.30; // Preço do litro da gasolina
        } else {
            System.out.println("Tipo de combustível é invalido");
            scanner.close();
            return;
        }
        
        double valortotal = litros * precoPorLitro;
        
        System.out.printf("O valor a ser pago: R$ %.2f\n", valortotal);
        
        scanner.close();
    }
}

