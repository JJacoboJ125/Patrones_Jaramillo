/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pagar {
    public double totalCobro;
    IOpcionPago opc;

    public pagar(double totalCobro) {
        this.totalCobro = totalCobro;
    }
    
    
    public void seleccionarOpcion(IOpcionPago opcion){
        opc=opcion;
    }
    public void mostrarPago(){
        opc.realizarCobro(totalCobro);
    }
}
