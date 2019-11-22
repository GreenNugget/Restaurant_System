/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubModelos;

/**
 *
 * @author Itzel
 */
public class Fecha {

    private int mes;
    private int anio;
    private int dia;

    //Constructor
    public Fecha(int dia, int mes, int anio) {
        this.mes = validarMes(mes);
        this.anio = validarAnio(anio);
        this.dia = validarDia(dia, mes, anio);
    }

    //Métodos get
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    //Métodos set
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Método para validar mes
    public int validarMes(int mes) {
        if (mes > 0 && mes <= 12) {
            return mes;
        } else {
            mes = 01;
            return mes;
        }
    }

    //Método para validar año
    public int validarAnio(int anio) {
        if (anio > 0 && anio <= 2018) {
            return anio;
        } else {
            anio = 2018;
            return anio;
        }
    }

    //Método para validar día de acuerdo al mes y al año
    public int validarDia(int dia, int mes, int anio) {
        int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dia > 0 && dia <= diasPorMes[mes]) {
            return dia;
        } else {
            if (mes == 2 && dia == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
                return dia;
            } else {
                System.out.println("Día inválido, se estableció en 1");
                dia = 1;
                return dia;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", getDia()) + "/" + String.format("%02d", getMes()) + "/" + getAnio();
    }

}
