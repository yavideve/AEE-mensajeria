
import java.util.GregorianCalendar;

/**
 *
 * @author Jimenez Marquez Javier y Kilian David Corrales Pacheco
 */
public class Mensaje {
    private final String APIPA = "169.254.0.1";
    private String usuario = "System";
    GregorianCalendar fecha = new GregorianCalendar();
    private String ip = APIPA;
    private String texto = "POR DEFECTO";
    
    public Mensaje() {
        this.usuario = usuario;
        this.fecha = fecha;
        this.ip = ip;
        this.texto = encripta(texto.toUpperCase());
    }
    public Mensaje(String usuario, String ip, String texto) {
        this.usuario = usuario;
        this.fecha = fecha;
        if (esValido(ip)) {
         this.ip = ip;
        } else {
            this.ip = APIPA;
        }
        this.texto = encripta(texto.toUpperCase());      
        
    }
    public String getAPIPA() {
        return this.APIPA;
    } // Fin función

    public String getUsuario() {
        return this.usuario;
    } // Fin función

    public GregorianCalendar getFecha() {
        return this.fecha;
    } // Fin función

    public String getIp() {
       return this.ip;
    } // Fin función

    public String getText() {
        return desencripta(this.texto);
    } // Fin función

    public boolean esValido(String ip) {
        String ipv4 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        if (ipv4.equals(ip)) {
            return true;
        } else {
            return false;
        }
    } // Fin función

    public String encripta(String msg) {
        int i;
        String invertido = "";
        char ultimocaracter;
        String desplazado = "";
        String encriptado = "";

        for (i = msg.length() - 1; i >= 0; i--) {
            invertido += msg.charAt(i);
        }
        for (i = invertido.length() - 1; i >= 0; i--) {
            encriptado += (char)(invertido.charAt(i) + 3);
        }
        return encriptado;
    } // Fin función

    public String desencripta(String msg) {
        int i;
        String resultado = "";
        String invertido = "";
        String desencriptado = "";

        for (i = msg.length() - 1; i >= 0; i--) {
            desencriptado += (char)(msg.charAt(i) - 3);
        }
        for (i = desencriptado.length() - 1; i >= 0; i--) {
            resultado += desencriptado.charAt(i);
        }
        return resultado;
    } // Fin función

    public String reverse(String cad) {
        int i;
        String inverso = "";
        for (i = cad.length() - 1; i >= 0; i--) {
            inverso += cad.charAt(i);
        }
        return inverso;
    } // Fin función
}
