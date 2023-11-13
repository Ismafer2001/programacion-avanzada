/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ismael
 */
public class Main {
    
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("jhon", 100, 5);
        Mago mago = new Mago("Merlín", 80, 7);
        
        System.out.println("----------estado inicial------");
        guerrero.mostrarEstado();
        mago.mostrarEstado();
        System.out.println("------combate-------");

        guerrero.atacar();
        guerrero.ejecutarAtaqueEspecial();

        mago.atacar();
        mago.lanzarHechizo();

        guerrero.recibirDano(20);
        mago.recibirDano(15);
        
        System.out.println("---estado final despues de ataques---- \n");

        guerrero.mostrarEstado();
        mago.mostrarEstado();
    }
    
}
