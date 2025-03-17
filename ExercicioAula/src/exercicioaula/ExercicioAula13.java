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
public class ExercicioAula13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ponha a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Ponha a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Ponha a idade em dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("A idade total em dias é de: " + idadeEmDias + " dias.");

        scanner.close();
    }
}
