/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Itzel
 */
public class ElementoInexistenteException extends RuntimeException {

    public ElementoInexistenteException(String mensaje) {
        super(mensaje);
    }
}
