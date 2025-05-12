/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author CAMARGO
 */
// Classe principal com o método main, ponto de entrada do programa
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        carro.exibirDados();  // Chama o método exibirDados da classe Carro
        carro.ligar();        // Chama o método da classe Veiculo
        carro.desligar();

        System.out.println("-----------------------");

        // Criação de um objeto da classe CarroEsportivo
        CarroEsportivo esportivo = new CarroEsportivo("Ferrari", "F8 Tributo", 2023, 2, 720);
        esportivo.exibirDados();         // Mostra todos os dados (herdados e novos)
        esportivo.ligar();               // Método herdado da classe Veiculo
        esportivo.ativarModoEsportivo(); // Método exclusivo da classe CarroEsportivo
        esportivo.desligar();
    }
}