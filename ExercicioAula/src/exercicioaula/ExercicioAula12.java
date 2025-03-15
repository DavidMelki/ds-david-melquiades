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
public class ExercicioAula12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponha a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Ponha a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Ponha a idade em dias: ");
        int dias = scanner.nextInt();

        System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        scanner.close();
    }
}

