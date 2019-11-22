/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import SubModelos.*;
import Vistas.JFrmCrearGerente;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naomi
 */
public class Gerente extends Usuario {

    //El gerente tendrá como atributo un objeto de tipo menú, ya que será él quien defina los platillo que existen
    private Menu menuestablecido;

    //Constructor
    public Gerente(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Usuario, String Contrasena, Menu menuestablecido) {
        super(Usuario, Contrasena, Nombre, ApellidoMaterno, ApellidoPaterno);
        this.menuestablecido = menuestablecido;
    }

    //Método get
    public Menu getMenuestablecido() {
        return menuestablecido;
    }

    //Método set
    public void setMenuestablecido(Menu menuestablecido) {
        this.menuestablecido = menuestablecido;
    }

    //****************MÉTODOS*************
    public void nuevoEmpleado(ArrayList<Empleado> listaempleados, String user, String password, String name, String lastname1, String lastname2, String tipoempleado) {//Con este método se permite agregar un nuevo usuario de tipo EMPLEADO al sistema
        //Este método almacena los datos de los nuevos empleados que se añadenal sistema

        if (tipoempleado.equals("Mesero") || tipoempleado.equals("mesero")) {//CUANDO EL EMPLEADO SEA MESERO
            listaempleados.add(new Mesero(user, password, name, lastname1, lastname2, null));
        } else {//CUANDO EL EMPLEADO SEA CAJERO
            if (tipoempleado.equals("Cajero") || tipoempleado.equals("cajero")) {
                listaempleados.add(new Cajero(user, password, name, lastname1, lastname2, null, 0));
            }
        }

    }

    public void eliminarEmpleado(ArrayList<Empleado> listaempleados, String name, String lastname1, String lastname2) {

        for (int e = 0; e < listaempleados.size(); e++) {//Se recorre el ArrayList de los empleados
            if (listaempleados.get(e).getNombre().equals(name)
                    && listaempleados.get(e).getApellidoPaterno().equals(lastname1)
                    && listaempleados.get(e).getApellidoMaterno().equals(lastname2)) {//Si el nombre del empleado en la posición "e" coincide con el que se desea eliminar

                listaempleados.remove(e);//Se remueve al empleado en la posición "e" porque fue el que coincidió
            }
        }
    }

    public void establecerSueldoEmpleado(String Nombre, String ApellidoPaterno, String ApellidoMaterno, double salary) {

        //Creamos un objeto de tipo file para poder manipularlo
        File archivosueldos = new File("SueldoEmpleados.txt");

        FileWriter escribir;//Este objeto nos servirá para escribir en el archivo, una línea a la vez
        PrintWriter linea;//Este objeto nos servirá para escribir en el archivo, varias líneas a la vez

        try {

            escribir = new FileWriter(archivosueldos, true);//El true nos sirve para sobreescribir, en caso de que ya se hayan ingresado datos
            linea = new PrintWriter(escribir);

            //Escribimos sobre el archivo de texto
            linea.println(Nombre + " " + ApellidoPaterno + " " + ApellidoMaterno + "         $" + salary);

            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void agregarAlimento(String name, double price, String foodtype) {
        //La variable de tipo String "option" nos sirve para saber si se añade o modifica un alimento

        switch (foodtype) {//Switch para añadir el tipo de alimento que se desea
            case "Platillo":
                JFrmCrearGerente.platillos.add(new Platillo(name, price));
                break;
            case "Bebida":
                JFrmCrearGerente.bebidas.add(new Bebida(name, price));
                break;
            case "Postre":
                JFrmCrearGerente.postres.add(new Postre(name, price));
                break;
        }//FIN DEL SWITCH PARA AÑADIR ALIMENTOS

        //FIN DEL MÉTODO
    }

    //FIN DE LA CLASE
}
