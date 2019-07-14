/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidades.Evento;
import entidades.Hora;
import java.util.ArrayList;

/**
 *
 * @author JHONATAN
 */
public class MisConstantes {

    // INTERNACIONALIZACION DE MONEDA S/.  $
    // PLATINUM
    // public static final String PLATINUM_UBICACION = "PLATINUM";
    public static final double PLATINUM_COSTO = 250.50;
    public static final char PLATINUM_CODIGO = 'P';
    // public static final String PLATINUM_NUMERO = "01";

    // GOLD
    // public static final String GOLD_UBICACION = "GOLD";
    public static final double GOLD_COSTO = 150.50;
    public static final char GOLD_CODIGO = 'G';
    // public static final String GOLD_NUMERO = "02";

    // VIP
    // public static final String VIP_UBICACION = "VIP";
    public static final double VIP_COSTO = 95.00;
    public static final char VIP_CODIGO = 'V';
    // public static final String VIP_NUMERO = "03";

    public static int indiceAsistentes = 1;
    public static int indiceExpositor = 1;
    public static int indiceEvento = 1;

    public static final double IGV = 0.18;

    public static int retornarIndicePredeterminado(int opcion) {
        int i = 0;
        switch (opcion) {
            case 0:
                i = indiceAsistentes++;
                break;
            case 1:
                i = indiceExpositor++;
                break;
            case 2:
                i = indiceEvento++;
                break;
        }

        return i;
    }

    public static Hora calcularDuracion(Hora horaIngreso, Hora horaSalida) {

        int resto = 0;
        int segundos = horaSalida.getSegundo() - horaIngreso.getSegundo();

        if (segundos < 0) {
            resto = 1;
            segundos += 60;
        }

        int minutos = horaSalida.getMinuto() - horaIngreso.getMinuto() - resto;
        resto = 0;
        if (minutos < 0) {
            minutos += 60;
            resto = 1;
        }

        int hora = horaSalida.getHora() - horaIngreso.getHora() - resto;

        return new Hora(hora, minutos, segundos);

    }

    public static boolean verificarAsistenteEventos(ArrayList<Evento> eventos, int CodigoAsistente) {
        boolean isUnico = true;

        for (Evento ev : eventos) {
            if (ev.existe(CodigoAsistente)) {
                isUnico = false;
            }
        }

        return isUnico;

    }

}
