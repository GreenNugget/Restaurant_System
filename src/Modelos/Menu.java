/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import SubModelos.Bebida;
import SubModelos.Platillo;
import SubModelos.Postre;
import java.util.ArrayList;

/**
 *
 * @author Naomi
 */
public class Menu {

    //Usaremos ArrayList para almacenar los platillos, las bebidas y los postres existentes que son definidos por el Gerente
    private ArrayList<Platillo> platillo;
    private ArrayList<Bebida> bebida;
    private ArrayList<Postre> postre;

    //Constructor
    public Menu(ArrayList<Platillo> platillo, ArrayList<Bebida> bebida, ArrayList<Postre> postre) {
        this.platillo = platillo;
        this.bebida = bebida;
        this.postre = postre;
    }

    //Métodos Get
    public ArrayList<Platillo> getPlatillo() {
        return platillo;
    }

    public ArrayList<Bebida> getBebida() {
        return bebida;
    }

    public ArrayList<Postre> getPostre() {
        return postre;
    }

    //Métodos Set
    public void setPlatillo(ArrayList<Platillo> platillo) {
        this.platillo = platillo;
    }

    public void setBebida(ArrayList<Bebida> bebida) {
        this.bebida = bebida;
    }

    public void setPostre(ArrayList<Postre> postre) {
        this.postre = postre;
    }

}
