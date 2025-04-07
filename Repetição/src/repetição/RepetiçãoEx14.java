/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetição;

/**
 *
 * @author CAMARGO
 */
public class RepetiçãoEx14 {
       public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaA = 0.03; 
        double taxaB = 0.015; 
        int anos = 0;

        
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("A população do país A vai ultrapassar ou igualar a de B em " + anos + " anos.");
        System.out.println("População de A: " + populacaoA);
        System.out.println("População de B: " + populacaoB);
    }
}
