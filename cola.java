/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Cola {

    private LinkedList<String> tCola = new LinkedList<>();

    ;

    public Cola() {
    }

    public void meterEnCola(Object obj) {
        tCola.offer((String) obj);
    }

    public Object sacarDeCola() {
        {

            if (tCola.isEmpty()) {
                System.out.println("La cola esta vacia");
            }
            return tCola.poll();

        }
    }

    public boolean esColaVacia() {
        return tCola.isEmpty();
    }
}
