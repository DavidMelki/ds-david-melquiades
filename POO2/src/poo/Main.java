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
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // Pedir ao usuário para escolher o tipo de carro
        String tipoCarro = JOptionPane.showInputDialog("Escolha o tipo de carro:\n1 - Carro Esportivo\n2 - Carro Popular");

        Carro carro;
        if (tipoCarro.equals("1")) {
            // Criando o carro esportivo
            String marcaEsportiva = JOptionPane.showInputDialog("Digite a marca do Carro Esportivo:");
            String modeloEsportivo = JOptionPane.showInputDialog("Digite o modelo do Carro Esportivo:");
            carro = new CarroEsportivo(marcaEsportiva, modeloEsportivo);
        } else {
            // Criando o carro popular
            String marcaPopular = JOptionPane.showInputDialog("Digite a marca do Carro Popular:");
            String modeloPopular = JOptionPane.showInputDialog("Digite o modelo do Carro Popular:");
            carro = new CarroPopular(marcaPopular, modeloPopular);
        }

        // Exibindo informações iniciais
        carro.exibirInfo(); // Exibe marca, modelo e velocidade inicial

        // Pedir ao usuário para acelerar
        String acelerarInput = JOptionPane.showInputDialog("Quanto você deseja acelerar? (em km/h)");
        int acelerar = Integer.parseInt(acelerarInput);
        carro.acelerar(acelerar);

        // Pedir ao usuário para frear
        String frearInput = JOptionPane.showInputDialog("Quanto você deseja frear? (em km/h)");
        int frear = Integer.parseInt(frearInput);
        carro.frear(frear);
    }
    }
