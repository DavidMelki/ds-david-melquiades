/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author CAMARGO
 */
// Classe que representa um carro esportivo, herda tudo de Carro (e de Veiculo também)
public class CarroEsportivo extends Carro {
    // Novo atributo exclusivo dos carros esportivos
    private int potencia; // Em cavalos (cv)

    // Construtor que inicializa todos os atributos, inclusive os da superclasse
    public CarroEsportivo(String marca, String modelo, int ano, int portas, int potencia) {
        super(marca, modelo, ano, portas); // Chama o construtor de Carro (que chama o de Veiculo)
        this.potencia = potencia;
    }

    // Sobrescreve o método exibirDados para mostrar também a potência do motor
    @Override
    public void exibirDados() {
        super.exibirDados(); // Chama exibirDados da classe Carro
        System.out.println("Potência: " + potencia + " cv"); // Adiciona a potência
    }

    // Método exclusivo da classe CarroEsportivo
    public void ativarModoEsportivo() {
        System.out.println(modelo + " está no modo esportivo!");
    }
}