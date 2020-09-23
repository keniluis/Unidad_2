/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejesdo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ING OESAGA
 */
public class ListaEmpleado {
    
  ArrayList<Persona> l1 = new ArrayList<Persona>();

    public ListaEmpleado() {}

    public void add(Persona empleado) {
        l1.add(empleado);
    }
    
     public ArrayList<String> EliminaEmpleado(ArrayList<String> listOfElements, int id){

        for (Iterator<String> iterator = listOfElements.iterator(); iterator.hasNext(); ) {
            String value = iterator.next();
            if (value.equals(id)) {
                iterator.remove();
            }
        }
        return listOfElements;
    }
}
