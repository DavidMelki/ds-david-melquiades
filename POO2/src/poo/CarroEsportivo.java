/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author CAMARGO
 */
// Classe CarroEsportivo que herda de Carro
public class CarroEsportivo extends Carro {

    // Construtor que chama o construtor da classe base (Carro)
    public CarroEsportivo(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobrescreve o método acelerar para um aumento maior de velocidade
    @Override
    public void acelerar(int incremento) {
        // Acelera mais rápido que o carro normal
        super.acelerar(incremento + 0); 
    }
}