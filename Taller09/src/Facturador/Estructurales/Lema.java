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
 * @author Diego
 */
public class Lema extends Decorator{

    public Lema(ComprobanteElectronico comprobante){
        super(comprobante);
    }

    @Override
    public String getDescripcion() {
        return getComprobante().getDescripcion()+ "Nuevo Lema";
        
    }
    
    
    
    
}
