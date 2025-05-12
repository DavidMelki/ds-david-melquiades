/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author CAMARGO
 */
// Classe base Carro
public class Carro {
    // Atributos comuns a todos os carros
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0; // Carro começa parado
    }

    // Método para acelerar o carro (aumenta a velocidade)
    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println("Acelerando... A velocidade agora é: " + velocidadeAtual + " km/h");
    }

    // Método para frear o carro (diminui a velocidade)
    public void frear(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) velocidadeAtual = 0; // Evita que a velocidade seja negativa
        System.out.println("Freando... A velocidade agora é: " + velocidadeAtual + " km/h");
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidade atual: " + velocidadeAtual + " km/h");
    }
}