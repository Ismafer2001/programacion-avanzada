/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ismael
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus");
        Vehiculo automovil = new Automovil("Toyota", "Corolla");
        Vehiculo motocicleta = new Motocicleta("Honda", "CBR500R");
        
        vehiculo.arrancar();
        automovil.arrancar();
        motocicleta.arrancar();
    }
}
