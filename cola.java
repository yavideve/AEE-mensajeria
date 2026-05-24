import java.util.LinkedList;

/**
 *
 * @author Jimenez Marquez Javier y Kilian David Corrales Pacheco
 */
public class Cola {
    private LinkedList<Object> tCola = new LinkedList<>();

    public Cola() {
    }

    public void meterEnCola(Object obj) {
        tCola.offer(obj);
    }

    public Object sacarDeCola() {
        
            if (tCola.isEmpty() == false) {
               return tCola.poll();
            }
        return null;
    }
    public boolean esColaVacia() {
        return tCola.isEmpty();
    }
}
