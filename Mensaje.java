
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
        while (op != 4) {
            switch (op) {
                case 1:
                    mensaje = new Mensaje();
                    colaMensajes.meterEnCola(mensaje);
                    System.out.println(mensaje.getUsuario() + " " + mensaje.getIp() + " " + mensaje.getText());
                    break;
                case 2:
                    System.out.println("Introduce ip");
                    ipv4 = Leer.dato();
                    System.out.println("Introduce texto");
                    text = Leer.dato();
                    System.out.println("Introduce Usuario");
                    user = Leer.dato();
                    mensaje = new Mensaje(user, ipv4, text);
                    colaMensajes.meterEnCola(mensaje);
                    System.out.println(mensaje.getUsuario() + " " + mensaje.getIp() + " " + mensaje.getText());
                    break;
                case 3:
                    mensaje = (Mensaje) colaMensajes.sacarDeCola();
                    System.out.println("Usuario: " + mensaje.getUsuario());
                    System.out.print("Fecha: "+mensaje.fecha.get(Calendar.DATE)); 
                    System.out.print("/" + (mensaje.fecha.get(Calendar.MONTH) + 1)); 
                    System.out.println("/" + mensaje.fecha.get(Calendar.YEAR)); 
                    System.out.println("IP: " + mensaje.getIp());
                    System.out.println("Texto: ");
                    System.out.println(mensaje.getText());
                    break;
            }
            System.out.println("Elija opción");
            op = Leer.datoShort();
        }

    }
}
