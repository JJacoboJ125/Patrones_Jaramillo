/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class carroCompra {
 private producto [] prodAgregados;
 
 public iteradorCarro crearIterador(){
     return new iteradorCarro(prodAgregados);
 }
}
