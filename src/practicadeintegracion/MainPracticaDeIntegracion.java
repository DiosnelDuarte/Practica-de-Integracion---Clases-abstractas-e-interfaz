/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadeintegracion;

/**
 *
 * @author Diosnel
 */
public class MainPracticaDeIntegracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciamos la clase CentroControl
        CentroControl centro = new CentroControl();
        
        //registramos vehiculos
        centro.registrarUnidad(new DronTransporte("Dron",0500));
        centro.registrarUnidad(new CamionAutonomo("Scania 360",1000));

        centro.monitorearFlota();
    }
    
}
