/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosherenciapolimorfismo;

/**
 *
 * @author Ismael
 */
import java.util.Scanner;
public class EjerciciosHerenciaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Templeado gerente,secretaria;
        gerente = new Tgerente("josé",30, "gerente",2000);
        secretaria = new Tsecretaria("maria", 27,"secretaria",1000);
        
        String _gerente = gerente.mostrarDatos();
        String _secretaria = secretaria.mostrarDatos();
        
        System.out.println(_gerente);
        System.out.println(_secretaria);
        gerente.hola();
        
        
        
        
        
        
    }
    
}
