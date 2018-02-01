/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lol
 */
public class Alquiler {

    private Date fecha;
    private int dias;
    private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private final int MS_DIA = 1000 * 60 * 60 * 24;
    private final double PRECIO_DIA = 30;
    private Turismo turismo;
    private Cliente cliente;

    public Alquiler(Cliente cliente, Turismo turismo) {
        this.cliente = cliente;
        this.turismo = turismo;
        fecha = new Date();
        dias = 0;
    }

    public Date getDate() {
        return fecha;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecioDia() {
        return PRECIO_DIA;
    }

    public Turismo getTurismo() {
        return turismo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void close() {
        if (dias == 0) {
            dias = difDias() + 1;
        } else {
            throw new ExcepcionAlquilerVehiculos("El alquiler está cerrado");
        }

    }

    public double getPrecio() {
        return getDias() * PRECIO_DIA + getTurismo().getCilindrada() / 100;
    }

    public int difDias() {
        long tiempoAlquiler = new Date().getTime() - getDate().getTime();
        long diasAlquiler = tiempoAlquiler / MS_DIA;
        return (int) diasAlquiler;
    }

    public String toString() {
        return String.format("Fecha inicio: %s Días: %s%n Turismo: %s%n Cliente: %s", fecha, dias, turismo, cliente);
    }
}
