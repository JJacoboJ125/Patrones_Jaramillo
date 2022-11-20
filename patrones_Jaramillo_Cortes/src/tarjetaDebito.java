/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class tarjetaDebito implements IOpcionPago {

    @Override
    public boolean realizarCobro(double totalCobro) {
        System.out.println("cobro con tarjeta debito aprobado");
        return true;
      }
    
}
