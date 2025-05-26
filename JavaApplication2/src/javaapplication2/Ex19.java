/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Ex19 {
    public static void main(String[] args) {
        int[] vetor = {5, 12, 7, 5, 3, 15, 8, 10, 6, 18, 7, 14, 2, 11, 3, 4, 13, 1, 19, 10};

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(vetor));

        // Usando LinkedHashSet para remover duplicados mantendo a ordem
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int num : vetor) {
            conjunto.add(num);
        }

        // Converter o Set de volta para um array
        int[] vetorSemDuplicados = new int[conjunto.size()];
        int index = 0;
        for (int num : conjunto) {
            vetorSemDuplicados[index++] = num;
        }

        System.out.println("Vetor sem elementos duplicados:");
        System.out.println(Arrays.toString(vetorSemDuplicados));
    }
}
