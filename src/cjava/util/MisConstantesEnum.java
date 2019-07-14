/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.util;

/**
 *
 * @author JHONATAN
 */
public enum MisConstantesEnum {
    //PLATINUM("01", 'P', "Platinum", 250.50),
    //GOLD("02", 'G', "Gold", 150.50),
    //VIP("03", 'V', "VIP", 95.00);

    PLATINUM(250.50, 'P'),
    GOLD(150.50, 'G'),
    VIP(95.00, 'V');

    private char codigo;
    private double costo;

    private MisConstantesEnum(double costo, char codigo) {
        this.costo = costo;
        this.codigo = codigo;
    }

    public double costo() {
        return costo;
    }

    public char codigo() {
        return codigo;
    }

}
