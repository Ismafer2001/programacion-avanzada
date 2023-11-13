/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ismael
 */
class Guerrero extends Personaje {
    public Guerrero(String nombre, int salud, int nivel) {
        super(nombre, salud, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca con su espada.");
    }

    public void ejecutarAtaqueEspecial() {
        System.out.println(getNombre() + " ejecuta un ataque especial: Corte Mortal.");
    }
}
