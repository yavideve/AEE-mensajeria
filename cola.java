
import java.util.LinkedList;

/**
 *
 * @author Jimenez Marquez Javier y Kilian David Corrales Pacheco
 */
public class Cola {
    // Atributos
    private LinkedList<Object> tCola = new LinkedList<>();
    
    // Métodos
    public Cola() {
    }

    public void meterEnCola(Object obj) {
        tCola.offer(obj);
    } // Fin función
    
    public Object sacarDeCola() {
        
            if (tCola.isEmpty() == false) {
               return tCola.poll();
            }
        return null;
    } // Fin función
    public boolean esColaVacia() {
        return tCola.isEmpty();
    } // Fin función
}
