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
public class ExercicioAula14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponha o número total de eleitores: ");
        int totaldeeleitores = scanner.nextInt();

        System.out.print("Ponha o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Ponha o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Ponha o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        double percentualBrancos = (double) votosBrancos / totaldeeleitores * 100;
        double percentualNulos = (double) votosNulos / totaldeeleitores * 100;
        double percentualValidos = (double) votosValidos / totaldeeleitores * 100;

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}
    


