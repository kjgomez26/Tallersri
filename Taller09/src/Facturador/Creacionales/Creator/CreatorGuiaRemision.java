/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Creacionales.Creator;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.GuiaRemision;

/**
 *
 * @author Gabriel
 */
public class CreatorGuiaRemision extends ComprobantesFactory{
    private GuiaRemision guiaremision;
    
    public ComprobanteElectronico getComprobante(String tipoComprobante){
        return guiaremision=new GuiaRemision();
    }
}
