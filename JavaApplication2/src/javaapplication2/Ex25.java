/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
import java.util.ArrayList;
import java.util.List;
public class Ex25 {
    public static void main(String[] args) {
        int[] vetor = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3, 5, 7, 15, 18, 25,
                       30, 12, 17, 19, 23, 28, 35, 40, 45, 55, 65, 70, 75, 85, 90};

        List<Integer> lis = encontrarLIS(vetor);

        System.out.println("Vetor:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nSubsequência crescente mais longa:");
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> encontrarLIS(int[] vetor) {
        int n = vetor.length;
        int[] dp = new int[n]; // dp[i] = tamanho da LIS terminando em i
        int[] prev = new int[n]; // prev[i] = índice do elemento anterior na LIS

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }

        int maxLength = 1;
        int maxIndex = 0;

        // Preenchendo dp e prev
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] < vetor[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        // Reconstruindo a subsequência
        List<Integer> lis = new ArrayList<>();
        for (int i = maxIndex; i != -1; i = prev[i]) {
            lis.add(0, vetor[i]); // adiciona no início da lista
        }

        return lis;
    }
}

