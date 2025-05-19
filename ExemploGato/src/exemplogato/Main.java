/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplogato;

/**
 *
 * @author CAMARGO
 */
public class Main {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Mimi", 3, "Branco");

        meuGato.exibirInfo();
        meuGato.miar();
        meuGato.dormir();

        GatoService gatoService = new GatoService();
        gatoService.brincarComGato(meuGato);
        gatoService.alimentarGato(meuGato);
    }
}
