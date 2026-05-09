/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droneadaptadordemo;

/**
 *
 * @author sistemas
 */
public class SuperDrone implements Drone {
    public void beep() {
        System.out.println("Beep Beep");
    }
    public void girarRotor() {
        System.out.println("Rotor girando");
    }
    public void despegar() {
        System.out.println("Drone despegando");
    }
}