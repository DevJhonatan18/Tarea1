/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import util.MisConstantes;

/**
 *
 * @author JHONATAN
 */
public class Asistente extends Persona {

    private String telefono;
    private String direccion;
    private char ubicacion;

    public Asistente() {

        super(MisConstantes.retornarIndicePredeterminado(0));
    }

    public Asistente(String nombre, String apellidos, String correo, String telefono, String direccion) {

        super(MisConstantes.retornarIndicePredeterminado(0), nombre, apellidos, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    

    @Override
    public String toString() {
        String resultado = "";
        resultado += "\n" + "Codigo" + getCodigo() + "\n"
                + "\n" + "Nombres" + getNombre() + "\n"
                + "\n" + "Apellido" + getApellidos() + "\n"
                + "\n" + "Correo" + getCorreo()
                + "\n" + "Direccion" + getDireccion()
                + "\n" + "Telefono" + getTelefono()
                + "\n" + "Direccion" + getDireccion();

        return resultado;
    }

}
