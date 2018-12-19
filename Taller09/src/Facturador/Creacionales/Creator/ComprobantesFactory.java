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
    
    public ComprobanteElectronico getComprobante(String tipoComprobante){
      if(tipoComprobante == null){
         return null;
      }		
      if(tipoComprobante.equalsIgnoreCase("FACTURA")){
          CreatorFactura creatorFactura=new CreatorFactura();
         return creatorFactura.getComprobante("FACTURA");
         
      } else if(tipoComprobante.equalsIgnoreCase("GUIAREMISION")){
          CreatorGuiaRemision creatorguiaremision=new CreatorGuiaRemision();
         return creatorguiaremision.getComprobante("GUIAREMISION");
         
      } else if(tipoComprobante.equalsIgnoreCase("NOTACREDITO")){
          CreatorNotaCredito creatornotacredito=new CreatorNotaCredito();
         return creatornotacredito.getComprobante("NOTACREDITO");
      }
      
      return null;
   }
    
}
