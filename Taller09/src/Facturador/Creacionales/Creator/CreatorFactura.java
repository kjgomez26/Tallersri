/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Creacionales.Creator;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.Factura;

/**
 *
 * @author Gabriel
 */
public class CreatorFactura extends ComprobantesFactory {
    private Factura factura;
    public ComprobanteElectronico getComprobante(String tipoComprobante){
        return factura=new Factura();
    }
}
