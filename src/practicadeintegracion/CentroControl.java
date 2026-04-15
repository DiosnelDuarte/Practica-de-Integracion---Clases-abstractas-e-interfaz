/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadeintegracion;

import java.util.ArrayList;

/**
 *
 * @author Diosnel
 */
public class CentroControl {
    //definimos como atributo la clase Vehiculo en un ArrayList
    private ArrayList<Vehiculo> vehiculos;
    
    //constructor de CentroControl
    public CentroControl(){
        this.vehiculos = new ArrayList<>();
    }
    //metodo para registrar un vehiculo a la lista
    public void registrarUnidad(Vehiculo v){
        vehiculos.add(v);
    }
    //metodo para monitorear el movimiento de los vehiculos
    public void monitorearFlota(){
        for(Vehiculo p: vehiculos ){
            System.out.println(p.patronMovimento());
        }
    }
}
