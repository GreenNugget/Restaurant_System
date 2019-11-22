/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelos.*;
import Vistas.JFrmInicio;
import java.util.ArrayList;

/**
 *
 * @author Naomi
 */
public class SistemaRestauranteFrames {

    public static ArrayList<Empleado> listaempleados = new ArrayList<>();
    public static ArrayList<Cuenta> listapedidos = new ArrayList<>();
    public static Gerente gerenteprincipal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new JFrmInicio().setVisible(true);

    }

    public static boolean verificarCuenta(String user, String password, Gerente gerenteprincipal, ArrayList<Empleado> listaempleados, String tipocuenta) {

        boolean bandera = false;//Nos sirve para verificar si la cuenta existe

        if (tipocuenta.equals("M")) {//Sirve para verificar dependiendo del tipo de cuenta, M = manager, que es el gerente
            if ((gerenteprincipal.getUsuario().equals(user)) && (gerenteprincipal.getContrasena().equals(password))) {
                bandera = true;
            } else {
                System.out.println("EL USUARIO O LA CONTRASEÑA SON INCORRECTOS");
            }
        } else {
            if ((tipocuenta.equals("W")) || (tipocuenta.equals("C"))) {//Si la cuenta es de tipo Empleado (W = waiter y C = cashier
                for (int z = 0; z < listaempleados.size(); z++) {//recorremos la lista de empleados para bucar los datos
                    if ((listaempleados.get(z).getUsuario().equals(user)) && (listaempleados.get(z).getContrasena().equals(password))) {//si el usuario y la contraseña concuerdan con los datos que se ingresaron, entonces se retorna verdadero porque la cuenta existe
                        bandera = true;
                    }
                }
            }
        }

        return bandera;
    }

}
