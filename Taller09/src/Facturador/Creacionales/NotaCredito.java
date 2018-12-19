/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Creacionales;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class NotaCredito extends ComprobanteElectronico{
    
    private String detalleModificacion;
    private double valorAPagar;


    public NotaCredito(String detalleModificacion, double valorAPagar, String nombreCliente, long codigo, LocalDate fecha) {
        super(nombreCliente, codigo, fecha);
        this.detalleModificacion = detalleModificacion;
        this.valorAPagar = valorAPagar;
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public NotaCredito() {
    }

    public String getDescripcion(){
        return "{ Nota de credito "+"Nombre cliente: "+this.nombreCliente;
    }

    @Override
    public String toString() {
        return "{ Nota de credito "+"Nombre cliente: "+this.nombreCliente;
    }
    
    
}
