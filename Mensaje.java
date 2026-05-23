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
        private String invierte(String txt) {
        int i;
        String resultado = "";
        for (i = txt.length() - 1; i >= 0; i--) {
            resultado += txt.charAt(i);
        } // Fin para
}
