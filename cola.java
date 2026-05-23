/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;

import java.util.LinkedList;

/**
 *
 * @author Administrador
 */
public class Cola {

    LinkedList<String> tCola = new LinkedList<>();

    public Cola() {
    }

    public void meterEnCola(Object obj) {
    tCola.offer((String) obj);
    }

    public Object sacarDeCola() {
    return tCola.peek();
    }

    public boolean esColaVacia() {
        return tCola.isEmpty();
}
}
