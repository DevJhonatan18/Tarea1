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
public class Expositor extends Persona {

    public Expositor() {
        super(MisConstantes.retornarIndicePredeterminado(1));
    }

    public Expositor(String nombre, String apellidos, String correo) {
        super(MisConstantes.retornarIndicePredeterminado(1), nombre, apellidos, correo);
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "\n" + "Codigo" + getCodigo() + "\n"
                + "\n" + "Nombres" + getNombre() + "\n"
                + "\n" + "Apellido" + getApellidos() + "\n"
                + "\n" + "Correo" + getCorreo();

        return resultado;
    }

}
