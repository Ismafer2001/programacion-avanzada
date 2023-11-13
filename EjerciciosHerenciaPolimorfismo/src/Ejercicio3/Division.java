/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Ismael
 */
class Division extends OperacionMatematica {
    
    @Override
    double calcular(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }
}
