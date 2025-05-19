/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplogato;

/**
 *
 * @author CAMARGO
 */
public class GatoService {

    public void brincarComGato(Gato gato) {
        System.out.println("Brincando com " + gato.nome + "...");
        gato.miar();
    }

    public void alimentarGato(Gato gato) {
        System.out.println("Alimentando " + gato.nome + "...");
    }
}
