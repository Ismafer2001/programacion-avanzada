/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Ismael
 */
public class Main {
    
    public static void main(String[] args) {
        OperacionMatematica suma = new Suma();
        OperacionMatematica resta = new Resta();
        OperacionMatematica multiplicacion = new Multiplicacion();
        OperacionMatematica division = new Division();

        double resultadoSuma = suma.calcular(5, 3);
        double resultadoResta = resta.calcular(10, 4);
        double resultadoMultiplicacion = multiplicacion.calcular(7, 2);
        double resultadoDivision = division.calcular(8, 0);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
    }
    
}
