/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadeintegracion;

/**
 *
 * @author Diosnel
 */
public class DronTransporte extends Vehiculo{
    //constructor de DronTransporte 
    public DronTransporte(String nombre, int id){
        super(nombre, id);
    }
    //sobreescritura del metodo abstracto de la clase Iconectable
    @Override
    public void sincronizarGPS(){
        System.out.println("Sincronizando GPS...");
    }
    //sobreescritura del metodo abstracto de la clase Vehiculo
    @Override
    public String patronMovimento() {
        return "El Dron "+ nombre +" esta volando por los aires con direccion al sur";
    }
}
