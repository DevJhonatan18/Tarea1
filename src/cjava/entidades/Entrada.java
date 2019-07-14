/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.entidades;

/**
 *
 * @author JHONATAN
 */
public class Entrada {

    private double precio;
    private char ubicacion;
    private int codigoAsistente;
    private int codigoEvento;

    public Entrada(double precio, int codigoAsistente, int codigoEvento, char ubicacion) {
        this.precio = precio;
        this.codigoAsistente = codigoAsistente;
        this.codigoEvento = codigoEvento;
        this.ubicacion = ubicacion;

    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigoAsistente() {
        return codigoAsistente;
    }

    public void setCodigoAsistente(int codigoAsistente) {
        this.codigoAsistente = codigoAsistente;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }

}
