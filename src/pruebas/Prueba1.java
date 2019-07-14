/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import entidades.Asistente;
import entidades.Entrada;
import entidades.Evento;
import entidades.Expositor;
import entidades.Hora;
import java.util.ArrayList;
import util.MisConstantes;

/**
 *
 * @author JHONATAN
 */
public class Prueba1 {

    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();
        Evento ev = new Evento("CJAVA");

        Hora horaIngreso = new Hora(8, 0, 0);
        Hora horaSalida = new Hora(19, 0, 0);

        ev.setHoraIngreso(horaIngreso);
        ev.setHoraSalida(horaSalida);
        ev.setDireccion("Jr. Independencia 424 Breña");
        ev.setIsAlta(true);

        Expositor e = new Expositor();
        ev.agregarExpositor(e);

        ArrayList<Asistente> ListaAsistentes1 = new ArrayList<>();

        Asistente asistente = new Asistente();
        asistente.setUbicacion('P');
        Asistente asistente2 = new Asistente();
        asistente.setUbicacion('P');

        ListaAsistentes1.add(asistente);
        ListaAsistentes1.add(asistente2);
        eventos.add(ev);

        for (Asistente as : ListaAsistentes1) {

            if (MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo())) {
                double precio = ev.calcularTotal(as.getUbicacion(), ev.calcularDescuento(as.getUbicacion()));
                Entrada entr = new Entrada(precio, asistente.getCodigo(), ev.getCodigo(), as.getUbicacion());
                ev.agregarAsistente(asistente);

                System.out.println(ev);
            }

        }

    }

}
