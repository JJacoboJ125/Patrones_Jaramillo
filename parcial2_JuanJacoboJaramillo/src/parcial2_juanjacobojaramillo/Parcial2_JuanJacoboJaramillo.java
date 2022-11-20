/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2_juanjacobojaramillo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Parcial2_JuanJacoboJaramillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner in = new Scanner(System.in);
        context cont = new context();
        notificacion n = null;

        System.out.println("digite el mensaje que desea notificar: ");
        String mensaje = in.nextLine();

        System.out.println("desea que se notifique el mensaje a: \n"
                + "1. SMS \n"
                + "2. Facebook \n"
                + "3. Slack \n"
                + "4. SMS y Facebook \n"
                + "5. SMS y Slack\n"
                + "6. Facebok y Slack \n"
                + "7. notificar a las 3 apps \n");
        op = in.nextInt();
        
        switch (op) {
            case 1:
                n = new noficiacionSMS();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 2:
                n = new notficacionFacebook();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 3:
                n = new notificacionSlack();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 4:
                n = new noficiacionSMS();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                n = new notficacionFacebook();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 5:
                n = new noficiacionSMS();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                n = new notificacionSlack();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 6:

                n = new notficacionFacebook();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                n = new notificacionSlack();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
            case 7:
                n = new noficiacionSMS();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);
                
                 n = new notficacionFacebook();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                n = new notificacionSlack();
                cont.setNotificacion(n);
                cont.mostrarMensaje(mensaje);

                break;
        }
    }

}
