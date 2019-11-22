/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Naomi
 */
public class DatosLoginException extends RuntimeException {

    public DatosLoginException(String mensaje) {
        super(mensaje);
    }
}
