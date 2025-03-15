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
public class ExercicioAula16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponha o salário mensal atual do funcionário: ");
        double salarioatual = scanner.nextDouble();

        System.out.print("Ponha o percentual de reajuste (%): ");
        double percentualreajuste = scanner.nextDouble();

        double novosalario = salarioatual + (salarioatual * percentualreajuste / 100);

        System.out.printf("O novo salário após o reajuste é: R$ %.2f%n", novosalario);

        scanner.close();
    }
}

