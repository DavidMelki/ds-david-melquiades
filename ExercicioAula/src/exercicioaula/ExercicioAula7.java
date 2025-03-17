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
public class ExercicioAula7 {
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Coloque a distância da viagem (em km): ");
        double distanciaemkm = scanner.nextDouble();

        System.out.print("Coloque o consumo do carro com a gasolina (em km/l): ");
        double consumodaGasolina = scanner.nextDouble();

        System.out.print("Coloque o consumo do carro com o álcool (em km/l): ");
        double consumodoAlcool = scanner.nextDouble();

        System.out.print("Coloque o preço da gasolina (em R$/litro): ");
        double precodaGasolina = scanner.nextDouble();

        System.out.print("Coloque o preço do álcool (em R$/litro): ");
        double precodoAlcool = scanner.nextDouble();

        System.out.print("Coloque o tipo de combustível (1 para gasolina, 2 para álcool): ");
        int tipoCombustivel = scanner.nextInt();

    
        double custoTotal = 0;
        if (tipoCombustivel == 1) {
            custoTotal = (distanciaemkm / consumodaGasolina) * precodaGasolina;
            System.out.printf("O custo estimado com gasolina é: R$ %.2f%n", custoTotal);
        } else if (tipoCombustivel == 2) {
            custoTotal = (distanciaemkm / consumodoAlcool) * precodoAlcool;
            System.out.printf("O custo estimado com álcool é: R$ %.2f%n", custoTotal);
        } else {
            System.out.println("Tipo de combustível inválido!");
        }

        scanner.close();
    }
}

