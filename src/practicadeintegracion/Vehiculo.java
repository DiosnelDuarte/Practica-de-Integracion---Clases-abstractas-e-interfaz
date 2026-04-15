/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadeintegracion;

/**
 *
 * @author Diosnel
 */
public abstract class Vehiculo implements Iconectable {
    //atributos de vehiculo
    protected String nombre;
    protected int id;
    
    //constructos
    public Vehiculo(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }
    
    //getter de id
    public int getId(){
        return id;
    }
    
    //getter de nombre
    public String getNombre(){
        return nombre;
    }
    //metodo para cambiar el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //metodo abstracto para patron el patron del moviemiento
    public abstract String patronMovimento();
}
