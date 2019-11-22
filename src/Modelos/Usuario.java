/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import SubModelos.Nombre;

/**
 *
 * @author Naomi
 */
public class Usuario extends Nombre {

    private String Usuario;
    private String Contrasena;

    //Constructor
    public Usuario(String Usuario, String Contrasena, String Nombre, String ApellidoMaterno, String ApellidoPaterno) {
        super(Nombre, ApellidoMaterno, ApellidoPaterno);
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    //Métodos Get
    public String getUsuario() {
        return Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    //Método Set
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

}
