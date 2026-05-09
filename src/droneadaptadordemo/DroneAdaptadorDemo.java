/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package droneadaptadordemo;

/**
 *
 * @author sistemas
 */
public class DroneAdaptadorDemo {
    public static void main(String[] args) {
        Drone miDrone = new Drone();
        Pato adaptador = new AdaptadorDrone(miDrone);

        System.out.println("Probando el Drone como si fuera un Pato:");
        adaptador.cuack();
        adaptador.vuelo();
    }
}