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
import javax.swing.JOptionPane;
public class Carro {
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
        JOptionPane.showMessageDialog(null, "Acelerando... A velocidade agora é: " + velocidadeAtual + " km/h");
    }

    // Método para frear o carro (diminui a velocidade)
    public void frear(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) velocidadeAtual = 0; // Evita que a velocidade seja negativa
        JOptionPane.showMessageDialog(null, "Freando... A velocidade agora é: " + velocidadeAtual + " km/h");
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + ", Modelo: " + modelo + ", Velocidade atual: " + velocidadeAtual + " km/h");
    }
}