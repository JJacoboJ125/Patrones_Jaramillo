/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class iteradorCarro {
    public producto [] arregloAIterar;
    public int posicion;

    public iteradorCarro(producto[] arregloAIterar) {
        this.arregloAIterar = arregloAIterar;
        posicion=0;
        
    }
    
    public void primero(){
        posicion =0;
    }
    
    public producto siguiente(){
        return arregloAIterar[posicion++];
    }
    
    public boolean estaHecho(){
        return posicion>=arregloAIterar.length;
    }
    
    public producto actualItem(){
       return arregloAIterar[posicion];
    }
    
    
    
    
}
