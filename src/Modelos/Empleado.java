/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Naomi
 */
public abstract class Empleado extends Usuario implements EditarCuenta {

    private ArrayList<Cuenta> VentaMesa;

    //Constructor
    public Empleado(String Usuario, String Contrasena, String Nombre, String ApellidoPaterno, String ApellidoMaterno, ArrayList<Cuenta> VentaMesa) {
        super(Usuario, Contrasena, Nombre, ApellidoPaterno, ApellidoMaterno);
    }

    //Método Get
    public ArrayList<Cuenta> getVentaMesa() {
        return VentaMesa;
    }

    //Método Set
    public void setVentaMesa(ArrayList<Cuenta> VentaMesa) {
        this.VentaMesa = VentaMesa;
    }

}
