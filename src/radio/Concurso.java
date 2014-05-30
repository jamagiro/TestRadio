/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radio;

import java.util.ArrayList;

/**
 *
 * @author Darien
 */
public class Concurso {
    
    ArrayList<Concursante> listaConcursante = new ArrayList<>();
    
    public void agregarConcursantes(Concursante con){
        listaConcursante.add(con);
    }

    public ArrayList<Concursante> getListaConcursante() {
        return listaConcursante;
    }

    public void setListaConcursante(ArrayList<Concursante> listaConcursante) {
        this.listaConcursante = listaConcursante;
    }
    
    
}
