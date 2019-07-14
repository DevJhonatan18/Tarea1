/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.entidades;

import cjava.util.MisConstantesEnum;

/**
 *
 * @author JHONATAN
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Asistente a = new Asistente("Juan", "Tolentino", "123", "123", "123");
        Expositor a2 = new Expositor("Juan", "Tolentino", "123");
        Asistente a3 = new Asistente("Juan", "Tolentino", "123", "123", "123");
        Expositor a4 = new Expositor("Juan", "Tolentino", "123");
        Asistente a5 = new Asistente("Juan", "Tolentino", "123", "123", "123");

        System.out.println("" + a5.getCodigo());
        System.out.println("" + a4.getCodigo());

        System.out.println("" + a.getCodigo());
        System.out.println("" + a2.getCodigo());
        System.out.println("" + a3.getCodigo());
        
        System.out.println("" + MisConstantesEnum.GOLD.codigo());
    }

}
