/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.io.File;
import java.sql.Connection;
/**
 *
 * @author ASUS
 */
public class conexionBaseDatos {
    
    public Connection iniciarBase(){
        String separador=File.separator;
        String proyecto= System.getProperty("user.dir")+separador+"productos";
        File url = new File(proyecto);
        
        if(url.exists()){
            System.out.println("la base de datos ya fue creada.");
        }else{
            try{
            Class.forName(proyecto);
            }catch(ClassNotFoundException ex){
             
            }
            
        }
        return null;
        
    }
}
