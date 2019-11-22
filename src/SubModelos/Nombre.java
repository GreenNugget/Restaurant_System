/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubModelos;

/**
 *
 * @author Naomi
 */
public class Nombre {

    private String Nombre;
    private String ApellidoMaterno;
    private String ApellidoPaterno;

    //Constructor
    public Nombre(String Nombre, String ApellidoMaterno, String ApellidoPaterno) {
        this.Nombre = Nombre;
        this.ApellidoMaterno = ApellidoMaterno;
        this.ApellidoPaterno = ApellidoPaterno;
    }

    //Métodos Get
    public String getNombre() {
        return Nombre;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    //Métodos Set
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    //Método To String
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno();
    }

}
