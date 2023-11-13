/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ismael
 */
class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }
    
    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }
}
