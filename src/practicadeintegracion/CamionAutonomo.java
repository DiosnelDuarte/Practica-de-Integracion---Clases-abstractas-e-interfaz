/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadeintegracion;

/**
 *
 * @author Diosnel
 */
public class CamionAutonomo extends Vehiculo{
    //constructor de camnionAutonomo
    public CamionAutonomo(String nombre, int id){
        super(nombre, id);
    }
    //sobreescritura del metodo abstracto de la clase Iconectable
    @Override
    public void sincronizarGPS(){
        System.out.println("sincronizando GPS...");
    }
    //sobreescritura del metodo abstracto de la clase Vehiculo
    @Override
    public String patronMovimento() {
        return "El vehiculo "+ nombre +" se esta moviendo por ruta 1";
    }
}
