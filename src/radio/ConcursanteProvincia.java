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
public class ConcursanteProvincia extends Concursante {
    
    String ciudad;

    public ConcursanteProvincia(String ciudad,String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.ciudad = ciudad;
    }

    @Override
    public void calcularPuntaje(int cantidadLlamadas, int cantidadMensajes) {
        setPuntaje(cantidadLlamadas*4 + cantidadMensajes*2);
    }



        
}
