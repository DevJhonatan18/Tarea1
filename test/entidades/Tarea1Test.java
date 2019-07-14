/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import cjava.entidades.Hora;
import cjava.entidades.Asistente;
import cjava.entidades.Evento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cjava.util.MisConstantes;

/**
 *
 * @author JHONATAN
 */
public class Tarea1Test {

    public Tarea1Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Tarea1.
     */
    public void testMain() {
        System.out.println("main");

        Asistente a1 = new Asistente();
        Asistente a2 = new Asistente();
        Asistente a3 = new Asistente();
        Asistente a4 = new Asistente();

        assertEquals(a2.getCodigo(), 3);

    }

    //@Test
    public void testDuracion() {
        System.out.println("main");

        Hora horaIngreso = new Hora(1, 49, 0);
        Hora horaSalida = new Hora(2, 29, 0);

        Hora duracion = MisConstantes.calcularDuracion(horaIngreso, horaSalida);
        int duracionMinutos = duracion.getHora() * 3600 + duracion.getMinuto() * 60 + duracion.getSegundo();
        int duracionSolicitada = 0 * 3600 + 40 * 60 + 0;
        assertEquals(duracionSolicitada, duracionMinutos);

    }

    @Test
    public void testCodigo() {
        System.out.println("main");

        Evento e = new Evento("cjava");

        double esperado = 250.50;
        double calculado = e.calcularPrecioEntrada('p');

        assertEquals(esperado, calculado, 0.00);

    }

}
