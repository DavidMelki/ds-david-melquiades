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
public class ExercicioAula10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Coloque o consumo do carro (em km/l): ");
        double consumodocarro = scanner.nextDouble();

        System.out.print("Coloque a distância a ser percorrida (em km): ");
        double distanciaemkm = scanner.nextDouble();

        System.out.print("Coloque o preço do litro de combustível (em R$): ");
        double precodocombustivel = scanner.nextDouble();
    
        double custo = (distanciaemkm / consumodocarro) * precodocombustivel;

        System.out.printf("O custo estimado com combustível é: R$ %.2f%n", custo);

        scanner.close();
    }
}

