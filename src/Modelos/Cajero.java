/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import SubModelos.Bebida;
import SubModelos.Platillo;
import SubModelos.Postre;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

;

/**
 *
 * @author Naomi
 */
public class Cajero extends Empleado {

    private double efectivorecibido;

    //Constructor
    public Cajero(String Usuario, String Contrasena, String Nombre, String ApellidoPaterno, String ApellidoMaterno, ArrayList<Cuenta> VentaMesa, double efectivorecibido) {
        super(Usuario, Contrasena, Nombre, ApellidoPaterno, ApellidoMaterno, VentaMesa);
    }

    public double getEfectivorecibido() {
        return efectivorecibido;
    }

    public void setEfectivorecibido(double efectivorecibido) {
        this.efectivorecibido = efectivorecibido;
    }

    public double devolverCambio(double recibido, Cuenta cuentamesa) {//BIEN, validar si recibe negativo

        //La variable "recibido" es el total entregado por el cliente
        //la variable "cambio" es la que calcula el cambio
        double cambio;

        cambio = recibido - (cuentamesa.calcularTotal());

        return cambio;
    }

    //Este método es para añadir la cuenta al registro de ventas
    public void registrarVenta(Cuenta cuentamesa) {

        File registro = new File("RegistroVentas.txt");

        FileWriter escribir;
        PrintWriter linea;

        try {

            escribir = new FileWriter(registro, true);
            linea = new PrintWriter(escribir);

            linea.println("********CUENTA*********");
            linea.println("Fecha: " + cuentamesa.getFecha().toString());
            linea.println("Numero de Mesa:  " + cuentamesa.getNumeroMesa());
            linea.println("Pedido               |   Precio");

            for (int i = 0; i < cuentamesa.getPedido().getPlatillo().size(); i++) {
                linea.println(cuentamesa.getPedido().getPlatillo().get(i).getNombre()
                        + "                  $" + cuentamesa.getPedido().getPlatillo().get(i).getPrecio());
            }

            for (int j = 0; j < cuentamesa.getPedido().getBebida().size(); j++) {
                linea.println(cuentamesa.getPedido().getBebida().get(j).getNombre()
                        + "               $" + cuentamesa.getPedido().getBebida().get(j).getPrecio());
            }

            for (int k = 0; k < cuentamesa.getPedido().getPostre().size(); k++) {
                linea.println(cuentamesa.getPedido().getPostre().get(k).getNombre()
                        + "                 $" + cuentamesa.getPedido().getPostre().get(k).getPrecio());
            }

            linea.println("*****************************");//Sigamos con la impresión de los datos
            linea.println("Método de pago: " + cuentamesa.getMetodoDePago());
            linea.println("*****************************");//Imprimamos el total
            linea.println("Total a pagar:    $" + cuentamesa.calcularTotal());

            linea.close();
            escribir.close();

        } catch (IOException ex) {
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }

        //FIN DEL MÉTODO
    }

    //Método Abstracto
    @Override
    public void editarCuenta(Cuenta cuentamesa, Gerente gerenteprincipal) {

        //Variables para leer las entradas
        Scanner EntradaInt = new Scanner(System.in);
        Scanner EntradaStr = new Scanner(System.in);
        Scanner EntradaDou = new Scanner(System.in);

        //Variable para seleccionar una de las opciones
        int modificar;
        //Vamos a poner un Menú para que el empleado pueda seleccionar lo que se requiere modificar
        System.out.println("\n¿Qué desea modificar?"
                + "\n1. El número de Mesa"
                + "\n2. El pedido"
                + "\n3. El método de pago"
                + "\n4. Cancelar");
        modificar = EntradaInt.nextInt();

        //El siguiente Switch es para redirigir al empleado según la opción
        switch (modificar) {
            //CASE PARA MODIFICAR EL NÚMERO DE MESA
            case 1:
                System.out.println("\nEl número de mesa actual es: " + cuentamesa.getNumeroMesa());
                System.out.println("\nIngrese el nuevo número de mesa:");
                int nuevonummesa = EntradaInt.nextInt();
                cuentamesa.setNumeroMesa(nuevonummesa);
                break;
            //CASE PARA MODIFICAR UN ALIMENTO DEL PEDIDO
            case 2:
                //Haremos otro menú de opciones para que el empleado seleccione qué parte del pedido desea modificar
                System.out.println("\n¿Qué alimento desea modificar?"
                        + "\n1. Platillo"
                        + "\n2. Bebida"
                        + "\n3. Postre");
                int alimento = EntradaInt.nextInt();

                switch (alimento) {
                    case 1://Case para el platillo
                        //Se hace otro Switch para añadir,eliminar o modificar un platillo
                        System.out.println("            *****MODIFICANDO PLATILLO*****           ");
                        System.out.println("\n¿Qué desea hacer?"
                                + "\n1. Añadir un platillo"
                                + "\n2. Eliminar un platillo"
                                + "\n3. Modificar un platillo");
                        int platillo = EntradaInt.nextInt();

                        switch (platillo) {
                            case 1://Case para añadir un platillo
                                //Se selecciona un platillo
                                System.out.println("\n\n            ***PLATILLOS EN EL MENÚ***          ");
                                for (int q = 0; q < gerenteprincipal.getMenuestablecido().getPlatillo().size(); q++) {
                                    System.out.println(q + ".- " + gerenteprincipal.getMenuestablecido().getPlatillo().get(q).getNombre());
                                }
                                System.out.print("\nSeleccione un número de platillo para agregar a su pedido: ");
                                int noplatillo = EntradaInt.nextInt();
                                cuentamesa.getPedido().getPlatillo().add(new Platillo(gerenteprincipal.getMenuestablecido().getPlatillo().get(noplatillo).getNombre(),
                                        gerenteprincipal.getMenuestablecido().getPlatillo().get(noplatillo).getPrecio()));
                                break;
                            case 2://Case para eliminar un platillo
                                //Ciclo for para mostrar el número de los platillos que hay en el pedido
                                for (int i = 0; i < cuentamesa.getPedido().getPlatillo().size(); i++) {
                                    System.out.print(i);
                                    System.out.println(". " + cuentamesa.getPedido().getPlatillo().get(i).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número del platillo que se va a eliminar
                                System.out.println("¿Qué platillo desea eliminar? (Ingrese el número)");
                                int numplatillo = EntradaInt.nextInt();
                                //Se remueve el objeto
                                cuentamesa.getPedido().getPlatillo().remove(numplatillo);
                                break;
                            case 3://Case para modificar un platillo
                                //Ciclo for para mostrar el número de los platillos que hay en el pedido
                                System.out.println("                REEMPLAZANDO PLATILLO...");
                                for (int x = 0; x < cuentamesa.getPedido().getPlatillo().size(); x++) {
                                    System.out.print(x);
                                    System.out.print(". " + cuentamesa.getPedido().getPlatillo().get(x).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número del platillo que se va a reemplazar
                                System.out.println("¿Qué platillo desea eliminar? (Ingrese el número)");
                                int numeroplatillo = EntradaInt.nextInt();
                                //Imprimimos los platillos del menú para que el empleado pueda seleccionar cuál añadir a su pedido
                                System.out.println("\n\n            ***PLATILLOS EN EL MENÚ***          ");
                                for (int p = 0; p < gerenteprincipal.getMenuestablecido().getPlatillo().size(); p++) {
                                    System.out.println(p + ".- " + gerenteprincipal.getMenuestablecido().getPlatillo().get(p).getNombre());
                                }
                                System.out.print("\n\nSeleccione un platillo del menú previo para reemplazar (Ingrese el número): ");
                                int nopla = EntradaInt.nextInt();
                                //Se reemplaza el platillo
                                cuentamesa.getPedido().getPlatillo().set(numeroplatillo,
                                        new Platillo(gerenteprincipal.getMenuestablecido().getPlatillo().get(nopla).getNombre(),
                                                gerenteprincipal.getMenuestablecido().getPlatillo().get(nopla).getPrecio()));
                                break;

                            //Fin del switch para modificar un platillo
                        }
                        break;//Fin del case para modificar un platillo
                    case 2://Case para la bebida
                        //Se hace otro Switch para añadir,eliminar o modificar una bebida
                        System.out.println("            *****MODIFICANDO BEBIDA*****           ");
                        System.out.println("\n¿Qué desea hacer?"
                                + "\n1. Añadir una bebida"
                                + "\n2. Eliminar una bebida"
                                + "\n3. Modificar una bebida");
                        int bebida = EntradaInt.nextInt();

                        switch (bebida) {
                            case 1://Case para añadir una bebida al pedido actual
                                //Se selecciona un bebida
                                System.out.println("\n\n            ***BEBIDAS EN EL MENÚ***          ");
                                for (int q = 0; q < gerenteprincipal.getMenuestablecido().getBebida().size(); q++) {
                                    System.out.println(q + ".- " + gerenteprincipal.getMenuestablecido().getBebida().get(q).getNombre());
                                }
                                System.out.print("\nSeleccione un número de bebida para agregar a su pedido: ");
                                int nobebida = EntradaInt.nextInt();
                                cuentamesa.getPedido().getBebida().add(new Bebida(gerenteprincipal.getMenuestablecido().getBebida().get(nobebida).getNombre(),
                                        gerenteprincipal.getMenuestablecido().getBebida().get(nobebida).getPrecio()));
                                break;
                            case 2://Case para eliminar una bebida
                                //Ciclo for para mostrar el número de las bebidas que hay en el pedido
                                System.out.println("            ELIMINANDO BEBIDA...");
                                for (int i = 0; i < cuentamesa.getPedido().getBebida().size(); i++) {
                                    System.out.print(i);
                                    System.out.println(". " + cuentamesa.getPedido().getBebida().get(i).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número de la bebida que se va a eliminar
                                System.out.println("¿Qué bebida desea eliminar? (Ingrese el número)");
                                int numplatillo = EntradaInt.nextInt();
                                //Se remueve el objeto
                                cuentamesa.getPedido().getBebida().remove(numplatillo);
                                break;
                            case 3://Case para reemplazar una bebida
                                //Ciclo for para mostrar el número de las bebidas que hay en el pedido
                                System.out.println("                REEMPLAZANDO BEBIDA...");
                                for (int i = 0; i < cuentamesa.getPedido().getBebida().size(); i++) {
                                    System.out.print(i);
                                    System.out.print(". " + cuentamesa.getPedido().getBebida().get(i).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número de la bebida que se va a reemplazar
                                System.out.println("¿Qué bebida desea eliminar? (Ingrese el número)");
                                int numerobebida = EntradaInt.nextInt();
                                //Imprimimos las bebidas del menú para que el empleado pueda seleccionar cuál añadir a su pedido
                                System.out.println("\n\n            ***BEBIDAS EN EL MENÚ***          ");
                                for (int p = 0; p < gerenteprincipal.getMenuestablecido().getBebida().size(); p++) {
                                    System.out.println(p + ".- " + gerenteprincipal.getMenuestablecido().getBebida().get(p).getNombre());
                                }
                                System.out.print("\n\nSeleccione una bebida del menú previo para reemplazar (Ingrese el número): ");
                                int nobebi = EntradaInt.nextInt();
                                //Se reemplaza la bebida
                                cuentamesa.getPedido().getBebida().set(numerobebida,
                                        new Bebida(gerenteprincipal.getMenuestablecido().getBebida().get(nobebi).getNombre(),
                                                gerenteprincipal.getMenuestablecido().getBebida().get(nobebi).getPrecio()));
                                break;

                            //Fin del switch para modificar una bebida
                        }
                        break;//Fin del case para modificar una bebida
                    case 3://Case para el postre
                        //Se hace otro Switch para añadir,eliminar o modificar un postre
                        System.out.println("            *****MODIFICANDO POSTRE*****           ");
                        System.out.println("\n¿Qué desea hacer?"
                                + "\n1. Añadir un postre"
                                + "\n2. Eliminar un postre"
                                + "\n3. Modificar un postre");
                        int postre = EntradaInt.nextInt();

                        switch (postre) {
                            case 1://Case para añadir un postre al pedido ya existente
                                System.out.println("\n\n            ***POSTRES EN EL MENÚ***          ");
                                for (int q = 0; q < gerenteprincipal.getMenuestablecido().getPostre().size(); q++) {
                                    System.out.println(q + ".- " + gerenteprincipal.getMenuestablecido().getPostre().get(q).getNombre());
                                }
                                System.out.print("\nSeleccione un número de postre para agregar a su pedido: ");
                                int nopostre = EntradaInt.nextInt();
                                cuentamesa.getPedido().getPostre().add(new Postre(gerenteprincipal.getMenuestablecido().getPostre().get(nopostre).getNombre(),
                                        gerenteprincipal.getMenuestablecido().getPostre().get(nopostre).getPrecio()));
                                break;
                            case 2:
                                //Ciclo for para mostrar el número de los postres que hay en el pedido actual
                                for (int i = 0; i < cuentamesa.getPedido().getPostre().size(); i++) {
                                    System.out.print(i);
                                    System.out.println(". " + cuentamesa.getPedido().getPostre().get(i).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número del postre que se va a eliminar
                                System.out.println("¿Qué postre desea eliminar? (Ingrese el número)");
                                int numpostre = EntradaInt.nextInt();
                                //Se remueve el objeto
                                cuentamesa.getPedido().getPostre().remove(numpostre);
                                break;
                            case 3:
                                //Ciclo for para mostrar el número de los postres que hay en el pedido
                                System.out.println("                REEMPLAZANDO POSTRE...");
                                for (int x = 0; x < cuentamesa.getPedido().getPostre().size(); x++) {
                                    System.out.print(x);
                                    System.out.print(". " + cuentamesa.getPedido().getPostre().get(x).getNombre() + "\n");
                                }
                                //Se pide que seleccione el número del postre que se va a reemplazar
                                System.out.println("¿Qué postre desea eliminar? (Ingrese el número)");
                                int numeropostre = EntradaInt.nextInt();
                                //Imprimimos los postres del menú para que el empleado pueda seleccionar cuál añadir a su pedido
                                System.out.println("\n\n            ***POSTRES EN EL MENÚ***          ");
                                for (int p = 0; p < gerenteprincipal.getMenuestablecido().getPostre().size(); p++) {
                                    System.out.println(p + ".- " + gerenteprincipal.getMenuestablecido().getPostre().get(p).getNombre());
                                }
                                System.out.print("\n\nSeleccione un postre del menú previo para reemplazar (Ingrese el número): ");
                                int nopost = EntradaInt.nextInt();
                                //Se reemplaza el postre
                                cuentamesa.getPedido().getPostre().set(numeropostre,
                                        new Postre(gerenteprincipal.getMenuestablecido().getPostre().get(nopost).getNombre(),
                                                gerenteprincipal.getMenuestablecido().getPostre().get(nopost).getPrecio()));
                                break;
                        }//FIN DEL SWICTH PARA MODIFICAR UN POSTRE
                        break;

                }//FIN DEL SWITCH PARA SELECCIONAR UN PLATILLO, BEBIDA O POSTRE
                break;
            //CASE PARA MODIFICAR EL MÉTODO DE PAGO
            case 3:
                System.out.println("\nIngrese el método de pago:");
                String metpago = EntradaStr.nextLine();
                cuentamesa.setMetodoDePago(metpago);
                break;

        }//FIN DEL SWITCH PARA MODIFICAR LOS DATOS DE LA CUENTA

        //FIN DEL MÉTODO
    }

    //FIN DE LA CLASE
}
