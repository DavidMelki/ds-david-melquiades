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
public class ExercicioAula19 {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Coloque o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Ponha a altura (em metros): ");
        double alturaemM = scanner.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0); 
        
        double pesoideal;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoideal = (72.7 * alturaemM) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoideal = (62.1 * alturaemM) - 44.7;
        } else {
            
            System.out.println("Sexo inrreconhecido, por favor, ponha 'M' para masculino ou 'F' para feminino.");
            scanner.close();
            return;
        }
        
        System.out.printf("%s, seu peso ideal é: %.2f kg\n", nome, pesoideal);
        
        scanner.close();
    }
}

