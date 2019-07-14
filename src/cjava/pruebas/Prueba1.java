/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.entidades.Asistente;
import cjava.entidades.Entrada;
import cjava.entidades.Evento;
import cjava.entidades.Expositor;
import cjava.entidades.Hora;
import java.util.ArrayList;
import cjava.util.MisConstantes;

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

        Evento ev2 = new Evento("CJAVA2");

        Hora horaIngreso2 = new Hora(8, 0, 0);
        Hora horaSalida2 = new Hora(19, 0, 0);

        ev2.setHoraIngreso(horaIngreso2);
        ev2.setHoraSalida(horaSalida2);
        ev2.setDireccion("Jr. Independencia 424 Breña 2");
        ev2.setIsAlta(true);

        ArrayList<Asistente> ListaAsistentes1 = new ArrayList<>();
        ArrayList<Asistente> ListaAsistentes2 = new ArrayList<>();

        Asistente asistente = new Asistente();
        asistente.setUbicacion('P');
        Asistente asistente2 = new Asistente();
        asistente2.setUbicacion('P');

        Asistente asistente3 = new Asistente();
        asistente3.setUbicacion('P');

        Asistente asistente4 = new Asistente();
        asistente4.setUbicacion('P');

        ListaAsistentes1.add(asistente);
        ListaAsistentes1.add(asistente2);

        ListaAsistentes2.add(asistente3);
        ListaAsistentes2.add(asistente4);

        eventos.add(ev);
        eventos.add(ev2);

        for (Asistente as : ListaAsistentes1) {
            System.out.println(MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo()));

            if (MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo())) {
                double precio = ev.calcularTotal(as.getUbicacion(), ev.calcularDescuento(as.getUbicacion()));
                System.out.println("Dentro del if");
                Entrada entr = new Entrada(precio, asistente.getCodigo(), ev.getCodigo(), as.getUbicacion());
                ev.agregarAsistente(as);

            }
            /*for (Asistente as : ListaAsistentes1) {
            System.out.println(MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo()));
            /*if (MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo())) {
                double precio = ev.calcularTotal(as.getUbicacion(), ev.calcularDescuento(as.getUbicacion()));
                Entrada entr = new Entrada(precio, asistente.getCodigo(), ev.getCodigo(), as.getUbicacion());
                ev.agregarAsistente(asistente);
                
            }*/
        }
        for (Asistente as : ListaAsistentes2) {
            System.out.println(MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo()));
            /* if (MisConstantes.verificarAsistenteEventos(eventos, as.getCodigo())) {
                    double precio = ev.calcularTotal(as.getUbicacion(), ev.calcularDescuento(as.getUbicacion()));
                    Entrada entr = new Entrada(precio, asistente.getCodigo(), ev.getCodigo(), as.getUbicacion());
                    ev.agregarAsistente(asistente);

                }*/
        }

        //System.out.println(ev.getAsistentes().size());
    }

}
