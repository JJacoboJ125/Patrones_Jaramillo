/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_juanjacobojaramillo;

/**
 *
 * @author ASUS
 */
public class notficacionFacebook implements notificacion {

    @Override
    public void notificar(String mensaje) {
        System.out.println("este mensaje se notica por facebook\t"+mensaje);
    }
    
}
