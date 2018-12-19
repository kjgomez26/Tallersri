/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller09;

import Facturador.Creacionales.ComprobanteElectronico;
import Facturador.Creacionales.Creator.ComprobantesFactory;
import Facturador.Creacionales.Creator.CreatorFactura;
import Facturador.Creacionales.Creator.CreatorGuiaRemision;
import Facturador.Creacionales.Creator.CreatorNotaCredito;
import Facturador.Creacionales.Factura;
import Facturador.Creacionales.GuiaRemision;
import Facturador.Creacionales.InterfaceComprobante;
import Facturador.Estructurales.Lema;
import Facturador.Estructurales.Logo;

/**
 *
 * @author Diego
 */
public class Taller09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creo una fabrica para crear un tipo de comprobante
        ComprobantesFactory fabrica1 = new CreatorFactura();
        ComprobantesFactory fabrica2 = new CreatorGuiaRemision();
        ComprobantesFactory fabrica3 = new CreatorNotaCredito();

        ComprobanteElectronico comprobante1 = fabrica1.getComprobante("FACTURA");
        ComprobanteElectronico comprobante2 = fabrica2.getComprobante("GUIAREMISION");
        ComprobanteElectronico comprobante3 = fabrica3.getComprobante("NOTACREDITO");

        //llenante los comprobantes con datos basicos
        comprobante1.setNombreCliente("Juan Vera");
        comprobante2.setNombreCliente("Diego Muñoz");
        comprobante3.setNombreCliente("Gomez");

        System.out.println(comprobante1.toString());
        System.out.println(comprobante2.toString());
        System.out.println(comprobante3.toString());

        //Agregando una decoracion
        comprobante1 = new Lema(comprobante1);
        comprobante2 = new Logo(comprobante2);
        System.out.println(comprobante1.getDescripcion());
        System.out.println(comprobante2.getDescripcion());
    }

}
