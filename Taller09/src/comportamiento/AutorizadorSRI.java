/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

/**
 *
 * @author Diego
 */
public class AutorizadorSRI {
    
    private Esquema esquema;
    
    public AutorizadorSRI(Esquema esquema){
        this.esquema = esquema;
    }
    
    public void autorizar(ComprobanteElectronico comprobante){
        esquema.autorizar(comprobante);
    }
    
}
