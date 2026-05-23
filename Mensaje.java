package mensajeria;

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
        this.texto = texto;
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
        this.ip = ip;
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
        String resultado = "";
        String encriptado = "";
        for (i = msg.length() - 1; i >= 0; i--) {
            invertido += msg.charAt(i);
        }
        for (i = 1; i >= 0; i++) {
            resultado += invertido.charAt(i);
        }
        for (i = resultado.length() - 1; i >= 0; i++) {
            encriptado += resultado.charAt(i) + 3;
        }
        return encriptado;
    }

    public String desencripta(String msg) {
            int i;
        String invertido = "";
        String resultado = "";
        String encriptado = "";
        
        for (i = msg.length() - 1; i >= 0; i--) {
            encriptado += msg.charAt(i) - 3;
        }
        for (i = 1; i >= 0; i--) {
            invertido += encriptado.charAt(i);
        }
        
        for (i = invertido.length() - 1; i >= 0; i++) {
            resultado += invertido.charAt(i);
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
