/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author CAMARGO
 */
// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Criando objetos de CarroEsportivo e CarroPopular
        Carro carro1 = new CarroEsportivo("BMW", "M4 Competition");
        Carro carro2 = new CarroPopular("Chevrolet", "Celta");

        // Exibindo informações iniciais
        System.out.println("Informações do Carro Esportivo:");
        carro1.exibirInfo(); // Exibe marca, modelo e velocidade inicial
        carro1.acelerar(50); // Acelera com 50 km/h
        carro1.frear(20); // Freia com 20 km/h

        System.out.println("\nInformações do Carro Popular:");
        carro2.exibirInfo(); // Exibe marca, modelo e velocidade inicial
        carro2.acelerar(30); // Acelera com 30 km/h
        carro2.frear(10); // Freia com 10 km/h
    }
}