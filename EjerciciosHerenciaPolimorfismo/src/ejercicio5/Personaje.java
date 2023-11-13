/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ismael
 */
class Personaje {
    private String nombre;
    private int salud;
    private int nivel;

    public Personaje(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    

    public int getSalud() {
        
       
return salud;
    }

    

    public int getNivel() {
        return nivel;
    }

    

    public void atacar() {
        System.out.println(nombre + " ataca con un golpe básico.");
    }

    public void recibirDano(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe " + dano + " puntos de daño. Salud restante: " + salud);
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Nivel: " + nivel+"\n");
    }
}
