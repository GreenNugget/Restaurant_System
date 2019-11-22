/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import SubModelos.Fecha;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itzel
 */
public class Cuenta {

    private int numeroMesa;
    private Menu pedido;
    private String metodoDePago;
    private Fecha fecha;

    //Constructor
    public Cuenta(int numeroMesa, Menu pedido, String metodoDePago, Fecha fecha) {
        this.numeroMesa = numeroMesa;
        this.pedido = pedido;
        this.metodoDePago = metodoDePago;
        this.fecha = fecha;
    }

    //Métodos get
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public Menu getPedido() {
        return pedido;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public Fecha getFecha() {
        return fecha;
    }

    //Métodos set
    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void setPedido(Menu pedido) {
        this.pedido = pedido;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    //Método para calcular el Total
    public double calcularTotal() {

        //Inicializamos la variable total
        double tpla = 0, tbe = 0, tpos = 0;
        double TOTAL = 0;

        //Ciclo for para obtener el total
        for (int i = 0; i < pedido.getPlatillo().size(); i++) {
            tpla = tpla + pedido.getPlatillo().get(i).getPrecio();
        }

        for (int i = 0; i < pedido.getBebida().size(); i++) {
            tbe = tbe + pedido.getBebida().get(i).getPrecio();
        }

        for (int i = 0; i < pedido.getPostre().size(); i++) {
            tpos = tpos + pedido.getPostre().get(i).getPrecio();
        }

        TOTAL = TOTAL + (tpla + tbe + tpos);

        return TOTAL;
    }

    //Método para calcular la Propina y escribirla en el archivo
    public void calcularPropina(String name, String lastnamef, String lastnamem) {

        //Creamos una variable para calcular la propina
        double propina;

        //La propina que deben dar los meseros es el 5% de cada venta que realizan en el día, calculamos:
        propina = calcularTotal() * .05;

        //SE VA A REGISTRAR EN UN ARCHIVO .txt, ASÍ QUE ESCRIBIMOS LAS VARIABLES QUE VAMOS A USAR
        File archivo = new File("Propinas.txt");//Nos sirve para manipular el archivo

        FileWriter escribir; //Para escribir en el archivo
        PrintWriter linea; //Para escribir en varias lineas
        try {

            //Escribimos en el archivo
            escribir = new FileWriter(archivo, true);//El true sirve para escribir sobre lo que ya está en el archivo de texto
            linea = new PrintWriter(escribir);

            linea.println(name + " " + lastnamef + " " + lastnamem + "         $" + propina);//Escribimos el nombre y la propina del empleado

            //Cerraremos las variables para escribir
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }

        //FIN DEL MÉTODO
    }

    //FIN DE LA CLASE
}
