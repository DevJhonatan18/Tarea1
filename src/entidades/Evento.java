/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import util.MisConstantes;
import util.MisConstantesEnum;

/**
 *
 * @author JHONATAN
 */
public class Evento {

    private int codigo;

    private String titulo;

    private Hora duracion;
    private Hora horaIngreso;
    private Hora horaSalida;
    private String direccion;
    private boolean isAlta;
    private Expositor expositor;
    private ArrayList<Asistente> asistentes;

    public Evento(String titulo) {
        codigo = MisConstantes.retornarIndicePredeterminado(2);
        asistentes = new ArrayList<>();
        this.titulo = titulo;
    }

    public boolean existe(int codigoAsistente) {
        boolean isAsistente = false;
        for (Asistente asist : asistentes) {
            if (asist.getCodigo() == codigoAsistente) {
                isAsistente = true;
            }
        }

        return isAsistente;
    }

    public double calcularPrecioEntrada(char codigo) {

        double precioCalculado = 0.0;
        switch (Character.toUpperCase(codigo)) {
            case MisConstantes.PLATINUM_CODIGO:
                precioCalculado = MisConstantes.PLATINUM_COSTO;
                break;
            case MisConstantes.GOLD_CODIGO:
                precioCalculado = MisConstantes.GOLD_CODIGO;
                break;
            case MisConstantes.VIP_CODIGO:
                precioCalculado = MisConstantes.VIP_CODIGO;
                break;
            default:
                precioCalculado = -1;
        }
        return precioCalculado;
    }

    public String getDuracion() {
        Hora duracion = MisConstantes.calcularDuracion(this.horaIngreso, this.horaSalida);
        return duracion.getHora() + " hrs " + duracion.getMinuto() + " min " + duracion.getSegundo() + " seg";
    }

    public double calcularDescuento(double cantidad) {
        return (isAlta) ? cantidad * 0.1 : cantidad * 0.05;
    }

    public double calcularTotal(double cantidadOriginal, double descuento) {

        return (1 + MisConstantes.IGV) * (cantidadOriginal - descuento);

    }

    public void agregarAsistente(Asistente a) {

        if (existe(a.getCodigo())) {
            this.asistentes.add(a);
        }

    }

    public void agregarExpositor(Expositor e) {
        this.expositor = e;
    }

    public void removerExpositor() {
        this.expositor = null;
    }

    public Hora getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Hora horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isIsAlta() {
        return isAlta;
    }

    public void setIsAlta(boolean isAlta) {
        this.isAlta = isAlta;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void listarAsistentes() {
        for (Asistente as : asistentes) {
            System.out.println(as);
        }
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {

        String resultado = "";

        resultado += "\n" + "Expositor - " + getExpositor().getCodigo() + "\n"
                + "\n" + "Nombres " + getExpositor().getNombre() + "\n"
                + "\n" + "Apellido " + getExpositor().getApellidos() + "\n"
                + "\n" + "Correo " + getExpositor().getCorreo();
        resultado += "\n" + "------------------------------";

        for (Asistente as : asistentes) {

            resultado += "\n" + "Asistente - " + as.getCodigo() + "\n"
                    + "\n" + "Nombres " + as.getNombre() + "\n"
                    + "\n" + "Apellido " + as.getApellidos() + "\n"
                    + "\n" + "Correo " + as.getCorreo()
                    + "\n" + "Telefono " + as.getTelefono()
                    + "\n" + "Direccion " + as.getDireccion();
        }

        return resultado;
    }
}
