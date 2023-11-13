/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ismael
 */
class Mago extends Personaje {
    public Mago(String nombre, int salud, int nivel) {
        super(nombre, salud, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza una bola de fuego.");
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " lanza un hechizo de congelación.");
    }
}
