/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author CAMARGO
 */
// Classe CarroPopular que herda de Carro
public class CarroPopular extends Carro {

    // Construtor que chama o construtor da classe base (Carro)
    public CarroPopular(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobrescreve o método acelerar para um aumento menor de velocidade
    @Override
    public void acelerar(int incremento) {
        // Acelera de forma mais moderada
        super.acelerar(incremento + 0); 
    }
}