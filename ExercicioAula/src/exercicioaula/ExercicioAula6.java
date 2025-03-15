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
public class ExercicioAula6 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ponha a distância da viagem (em km): ");
        int distanciaemkm = scanner.nextInt();

        System.out.print("Ponha o consumo médio do carro (em km/l): ");
        int consumomedio = scanner.nextInt();

        System.out.print("Coloque o preço do combustível (em R$/litro): ");
        int precodocombustivel = scanner.nextInt();

    
        int custoTotal = (distanciaemkm / consumomedio) * precodocombustivel;


        System.out.println("O custo estimado com combustível é: R$ " + custoTotal);

        scanner.close();
    }
}

