/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Creacionales.Creator;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.Factura;
import Facturador.Creacionales.GuiaRemision;
import Facturador.Creacionales.NotaCredito;

/**
 *
 * @author Palacios
 */
public abstract class ComprobantesFactory {
    public abstract ComprobanteElectronico getComprobante(String tipoComprobante);
    
}
