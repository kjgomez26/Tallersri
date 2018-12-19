/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Estructurales;

import Facturador.Creacionales.ComprobanteElectronico;

/**
 *
 * @author Diego
 */
public abstract class Extras extends ComprobanteElectronico{
    
    private ComprobanteElectronico comprobante = null;
    
    public Extras(){
        
    }
    
    public Extras(ComprobanteElectronico comprobante){
        this.comprobante = comprobante;
    }

    public ComprobanteElectronico getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }
    
    
}
