/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ismael
 */
class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void arrancar() {
        System.out.println("El automóvil ha arrancado.");
    }
}
