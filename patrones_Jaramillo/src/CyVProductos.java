
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class CyVProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        carroCompra<String,Integer> cc = new carroCompra(1);
        
        Abs_Categorias catv= new vestuario();
        Abs_Categorias cate= new electrodomestico();
        Abs_Categorias catt= new tecnologia();
        Scanner in = new Scanner(System.in);
        IOpcionPago tipoPago=null;
        pagar confirmaPago =new pagar(500000);
        
        String nombre="Iphone 8 plus";
        int codigo = 12345;
        String descripcion="- 3 ram\n - 64 GB \n - blanco";
        double Costo=3000000;
        
        producto pr = new producto(nombre,catv,codigo,descripcion,Costo);
        
        System.out.println(pr);
        String nombre2="Nevera Samsung";
        int codigo2 = 23456;
        String descripcion2="- 3 ram\n - 64 GB \n - blanco";
        double Cost2=2000000;
        System.out.println("__________________________________________________________\n");
        producto pr2 = new producto(nombre2,cate,codigo2,descripcion2,Cost2);
         System.out.println(pr2);
         
        //añadir al carro
        if(!cc.contains(pr.getNombre())){
        cc.put(pr.getNombre(), 1);}
        else {
         cc.put(pr.getNombre(), cc.get(pr.getNombre())+1);
        }
         if(!cc.contains(pr2.getNombre())){
        cc.put(pr2.getNombre(), 1);}
        else {
         cc.put(pr2.getNombre(), cc.get(pr2.getNombre())+1);
        }
         System.out.println("__________________________________________________________\n");
        for(String e:cc.keys()){
            System.out.println(e);
        }
        System.out.println("__________________________________________________________\n");
        System.out.println("pago");
        
        System.out.println("con que desea pagar: \n"
                + "- tarjeta debito -> opcion 1\n"
                + "- tarjeta credito -> opcion 2\n"
                + "- efectivo -> opcion 3\n");
        int op=in.nextInt();
        switch(op){
            
            case 1:
                tipoPago = new tarjetaDebito();
                confirmaPago.seleccionarOpcion(tipoPago);
                confirmaPago.mostrarPago();
                break;
                
            case 2:
                tipoPago = new tarjetaCredito();
                confirmaPago.seleccionarOpcion(tipoPago);
                confirmaPago.mostrarPago();
                break;
                
            case 3:
                tipoPago = new efectivo();
                confirmaPago.seleccionarOpcion(tipoPago);
                confirmaPago.mostrarPago();
                break;
                
        }
        
        
       
        
    }
    
 public void buscarProducto(){
     Proxy px= new Proxy();
     px.realizarBusqueda();
 }
 
}
