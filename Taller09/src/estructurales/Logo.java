/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales;

/**
 *
 * @author Diego
 */
public class Logo extends Extras{

    public Logo() {
    }

    public Logo(ComprobanteElectronico comprobante) {
        super(comprobante);
    }

    public ComprobanteElectronico getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }
    
}
