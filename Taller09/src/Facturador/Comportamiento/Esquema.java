/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Comportamiento;

import Facturador.Creacionales.ComprobanteElectronico;

/**
 *
 * @author Diego
 */
public interface Esquema {
    
    void autorizar(ComprobanteElectronico comprobante);
    
}
