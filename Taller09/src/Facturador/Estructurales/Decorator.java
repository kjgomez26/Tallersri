/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Estructurales;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.InterfaceComprobante;

/**
 *
 * @author Gabriel
 */
public abstract class Decorator extends ComprobanteElectronico {
    private ComprobanteElectronico comprobante;
    
    public Decorator(ComprobanteElectronico comprobante){
        this.setComprobante(comprobante);
    }

    public InterfaceComprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }
}
