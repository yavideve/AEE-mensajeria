

import java.util.GregorianCalendar;

/**
 *
 * @author Kilian David Corrales Pacheco
 */
import java.util.GregorianCalendar;

/**
 *
 * @author Jimenez Marquez Javier
 */
public class Mensaje {

    private final String APIPA = "169.254.0.1";
    private String usuario = "System";
    GregorianCalendar fecha = new GregorianCalendar();
    private String ip;
    private String texto;

    public Mensaje(String usuario, GregorianCalendar fecha, String ip, String texto) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.ip = ip;
        this.texto = texto.toUpperCase();
    }

    public String getAPIPA() {
        return this.APIPA;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public GregorianCalendar getFecha() {
        return this.fecha;
    }

    public String getIp() {
       return this.ip;
    }

    public String getText() {
        return this.texto;
    }

    public boolean esValido(String ip) {
        String ipv4 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        if (ipv4.equals(ip)) {
            return true;
        } else {
            return false;
        }
    }

    public String encripta(String msg) {
        int i;
        String invertido = "";
        char ultimocaracter;
        String desplazado = "";
        String encriptado = "";

        for (i = msg.length() - 1; i >= 0; i--) {
            invertido += msg.charAt(i);
        }
        ultimocaracter = invertido.charAt(invertido.length() - 1);
        for (i = invertido.length() - 1; i >= 1; i--) {
            desplazado = invertido.charAt(i) + desplazado;
        }
        desplazado = ultimocaracter + desplazado;

        for (i = desplazado.length() - 1; i >= 0; i--) {
            encriptado += desplazado.charAt(i) + 3;
        }
        return encriptado;
    }

    public String desencripta(String msg) {
        int i;
        String resultado = "";
        String invertido = "";
        String desplazado = "";
        char primercaracter;
        String desencriptado = "";

        for (i = msg.length() - 1; i >= 0; i--) {
            desencriptado += msg.charAt(i) - 3;
        }
        primercaracter = desencriptado.charAt(0);
        for (i = 0; i <= desencriptado.length() - 2; i++) {
            desplazado = desplazado + desencriptado.charAt(i);
        }
        desplazado = desplazado + primercaracter;

        for (i = desplazado.length() - 1; i >= 0; i--) {
            resultado += desplazado.charAt(i);
        }
        return resultado;
    }

    public String reverse(String cad) {
        int i;
        String inverso = "";
        for (i = cad.length() - 1; i >= 0; i--) {
            inverso += cad.charAt(i);
        }
        return inverso;
    }
}
