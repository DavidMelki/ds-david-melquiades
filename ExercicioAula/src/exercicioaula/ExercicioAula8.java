/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula;

/**
 *
 * @autor davidm
 */
import java.util.Scanner;
public class ExercicioAula8 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Coloque a distância da viagem (em km): ");
        double distanciaemkm = scanner.nextDouble();

        System.out.print("Coloque o consumo do carro (em km/l): ");
        double consumodocarro = scanner.nextDouble();

        System.out.print("Coloque o preço do combustível (em R$/litro): ");
        double precodocombustivel = scanner.nextDouble();


        double litrosNecessarios = distanciaemkm / consumodocarro;

  
        double custoTotal = litrosNecessarios * precodocombustivel;


        System.out.printf("Será necessários %.2f litros de combustível.%n", litrosNecessarios);
        System.out.printf("O custo estimado com combustível é: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}

