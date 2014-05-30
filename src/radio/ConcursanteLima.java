/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radio;

/**
 *
 * @author Darien
 */
public class ConcursanteLima extends Concursante {
    
    String distrito;

    public ConcursanteLima(String distrito,String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.distrito = distrito;
    }

    @Override
    public void calcularPuntaje(int cantidadLlamadas, int cantidadMensajes) {
        setPuntaje(cantidadLlamadas*2 + cantidadMensajes*3);
    }



        
}
