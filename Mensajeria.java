

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jimenez Marquez Javier y Kilian David Corrales Pacheco
 */
public class Mensajeria {

    public static void main(String[] args) {
        // Entorno
        short op;
        char respuesta;
        boolean continuar = false;
        String ipv4, text, user;
        Cola colaMensajes = new Cola();
        Mensaje mensaje;
        // Algoritmo
        System.out.println("1. Envío instantaneo");
        System.out.println("2. Enviar mensaje");
        System.out.println("3. Recibir mensaje");
        System.out.println("4. Salir");
        System.out.println("Elija opción");
        op = Leer.datoShort();
        while (op != 0) {
            switch (op) {
                case 1:
                    mensaje = new Mensaje();
                    colaMensajes.meterEnCola(mensaje);
                    System.out.println(mensaje.getUsuario() + " " + mensaje.getIp() + " " + mensaje.getText());
                    break;
                case 2:
                    System.out.println("Introduce Usuario");
                    user = Leer.dato();
                    System.out.println("Introduce ip");
                    ipv4 = Leer.dato();
                    System.out.println("Introduce texto");
                    text = Leer.dato();
                    mensaje = new Mensaje(user, ipv4, text);
                    colaMensajes.meterEnCola(mensaje);
                    System.out.println(mensaje.getUsuario() + " " + mensaje.getIp() + " " + mensaje.getText());
                    break;
                case 3:
                    if (colaMensajes.esColaVacia() == false) {
                        mensaje = (Mensaje) colaMensajes.sacarDeCola();
                        System.out.println("Usuario: " + mensaje.getUsuario());
                        System.out.print("Fecha: " + mensaje.fecha.get(Calendar.DATE));
                        System.out.print("/" + (mensaje.fecha.get(Calendar.MONTH) + 1));
                        System.out.println("/" + mensaje.fecha.get(Calendar.YEAR));
                        System.out.println("IP: " + mensaje.getIp());
                        System.out.println("Texto: ");
                        System.out.println(mensaje.getText());
                        // Fin si
                    } else {
                        System.out.println("No hay más mensajes");

                    } // Fin funcion
                    break;
                case 4:
                    if (colaMensajes.esColaVacia() == true) {
                        op = 0;
                        // Fin si
                    } else if (colaMensajes.esColaVacia() == false) {
                        System.out.println("Hay mensajes pendientes de recibir ¿Salir de todas formas? (S/N)");
                        respuesta = Leer.datoChar();
                        if (respuesta == 'S') {
                            op = 0;
                            // Fin si
                        } else if (respuesta != 'S') {
                            break;
                        } // Fin funcion

                    }// Fin funcion

            }  // Fin segun sea
            if (op != 0) {
                System.out.println("Elija opción");
                op = Leer.datoShort();
            }
        } //Fin mientras
    }
}
