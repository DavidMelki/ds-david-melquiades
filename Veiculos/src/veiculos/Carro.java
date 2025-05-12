/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author CAMARGO
 */
// A classe Carro herda os atributos e métodos da classe Veiculo
public class Carro extends Veiculo {
    // Novo atributo específico da classe Carro
    protected int portas;

    // Construtor da classe Carro, que chama o construtor da superclasse (Veiculo)
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano); // Chama o construtor de Veiculo
        this.portas = portas;
    }

    // Sobrescreve o método exibirDados para adicionar o número de portas
    @Override
    public void exibirDados() {
        super.exibirDados(); // Chama o método exibirDados de Veiculo
        System.out.println("Número de portas: " + portas); // Adiciona mais informações
    }
}
