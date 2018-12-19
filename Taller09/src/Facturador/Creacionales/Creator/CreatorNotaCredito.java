/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturador.Creacionales.Creator;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.NotaCredito;

/**
 *
 * @author Gabriel
 */
public class CreatorNotaCredito extends ComprobantesFactory{
    private NotaCredito notacredito;
    
    public ComprobanteElectronico getComprobante(String tipoComprobante){
        return notacredito=new NotaCredito();
    }
}
