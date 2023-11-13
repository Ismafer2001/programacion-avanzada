/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosherenciapolimorfismo;

/**
 *
 * @author Ismael
 */
public class Templeado {
    private final  String nombre;
    private final  int edad;
    private final  String ocupacion;
    private final   int salario;
    
    public Templeado(String nombre, int edad, String ocupacion, int salario){
        this.nombre = nombre;
        this.edad=edad;
        this.ocupacion=ocupacion;
        this.salario=salario;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public int getSalario() {
        return salario;
    }
    
    public String mostrarDatos(){
        return "-----   "+getOcupacion()+"  ----- \n"
                +"nombre: "+getNombre()+
                "\nedad: "+getEdad()+
                "\nsalario: "+getSalario();
                
             
        
        
        
        
        
    }
    public void hola(){
        System.out.println("holaaa");
    }
    
    
}
