
package Gestores;

import Controlador.EmpresasJpaController;
import Modelo.Empresas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael
 */
public class EmpresaGestor {
    EmpresasJpaController cn;
    
    public boolean crearEmpresa(Empresas empresaNuevo) {
        cn = new EmpresasJpaController();
        if (empresaExiste(empresaNuevo)) {

            try {
                cn.create(empresaNuevo);
            } catch (Exception ex) {
                Logger.getLogger(EmpresaGestor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        return false;
    }

    private boolean empresaExiste(Empresas empresa) {
        try {
            // validad qie la lista sea vacia, esto quiere decir q el usuario no esta en la bd.
            if (cn.findEmpresaByData(empresa).size() >= 1){
            return false;}
        } catch (Exception ex) {
            Logger.getLogger(EmpresaGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
