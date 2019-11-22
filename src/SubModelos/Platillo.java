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
public class Platillo extends Alimento {

    //Constructor Heredado de la SuperClase Alimento
    public Platillo(String Nombre, double Precio) {
        super(Nombre, Precio);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
