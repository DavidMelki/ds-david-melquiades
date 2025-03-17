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
public class ExercicioAula17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponha o custo de fábrica do carro: ");
        double custodefabrica = scanner.nextDouble();
        
        double custodistribuidor = custodefabrica * 28 / 100;
        double custoimpostos = custodefabrica * 45 / 100;

        double custoFinal = custodefabrica + custodistribuidor + custoimpostos;

        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}

