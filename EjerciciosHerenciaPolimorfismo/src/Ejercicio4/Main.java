/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Ismael
 */
public class Main {
    
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        ProductoAlimenticio producto1 = new ProductoAlimenticio("Manzanas", 2.5);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("Leche", 1.5);
        ProductoElectronico producto3 = new ProductoElectronico("Smartphone", 500.0);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        double total = carrito.calcularTotal();

        System.out.println("Total: $" + total);
    }
}
