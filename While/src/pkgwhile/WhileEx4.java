/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class WhileEx4 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int quantidadeAlunos = teclado.nextInt();

        int contador = 0;
        double somaNotas = 0;

        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = teclado.nextDouble();

            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / quantidadeAlunos;
        System.out.printf("A média da turma é: %.2f\n", media);

  
    } 
}
