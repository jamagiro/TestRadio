/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testradio;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;
import radio.Concursante;
import radio.ConcursanteLima;
import radio.ConcursanteProvincia;
import radio.Concurso;

/**
 *
 * @author Darien
 */
public class TestRadio {

    public TestRadio() {
    }

    @Test
    public void deboPoderConocerCantidadDeConcursantesDeUnDistrito() {
        Concurso concurso = new Concurso();
        ConcursanteLima concursante1 = new ConcursanteLima("Los Olivos", "Janina", "Giraldo", "47834622");        
        concurso.agregarConcursantes(concursante1);
        
        ConcursanteLima concursante2 = new ConcursanteLima("Los Olivos", "Davis", "Rixi", "45726179");        
        concurso.agregarConcursantes(concursante2);

        ConcursanteLima concursante3 = new ConcursanteLima("Los Olivos", "Alexis", "Giraldo", "46654655");
        concurso.agregarConcursantes(concursante3);
        
        assertEquals(3, concurso.getListaConcursante().size());
        
    }

    @Test
    public void deboPoderCrearConcursanteDeLimaConSusDatosCompletos() {
         ConcursanteLima concursante1 = new ConcursanteLima("Los Olivos", "Janina", "Giraldo", "47834622");        
         assertEquals("Janina", concursante1.getNombre());
    }

    @Test
    public void deboPoderconocerElPuntajeDeCualquierConcursante() {
         ConcursanteLima concursante2 = new ConcursanteLima("Los Olivos", "Davis", "Rixi", "45726179");   
         concursante2.calcularPuntaje(5, 6);
         System.out.println("" +concursante2.getPuntaje() );
         assertEquals(28.0, concursante2.getPuntaje(),28.0);
    }

    @Test
    public void deboPoderConocerLaCantidadTotalDeConcursantesQueParticipan() {

        Concurso concurso = new Concurso();
        ConcursanteLima concursante1 = new ConcursanteLima("Los Olivos", "Janina", "Giraldo", "47834622");        
        concurso.agregarConcursantes(concursante1);
        
        ConcursanteLima concursante2 = new ConcursanteLima("Los Olivos", "Davis", "Rixi", "45726179");        
        concurso.agregarConcursantes(concursante2);

        ConcursanteProvincia concursante3 = new ConcursanteProvincia("Huanuco", "Chrish", "Rixi", "45897685");
        concurso.agregarConcursantes(concursante3);
        
        assertEquals(3, concurso.getListaConcursante().size());
    }
}
