/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_juanjacobojaramillo;

/**
 *
 * @author ASUS
 */
public class context {
    
    private notificacion not;
    
    public void setNotificacion (notificacion i){
        
        not =i;
    }
    
    public void mostrarMensaje(String mensaje){
        not.notificar(mensaje);
    }
}
