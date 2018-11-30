
package Gestores;


import Controlador.ProgramasJpaController;
import Modelo.Programas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael
 */
public class CursosGestor {
    ProgramasJpaController cn;
    
    public boolean crearCurso(Programas cursoNuevo) {
        cn = new ProgramasJpaController();
        if (cursoExiste(cursoNuevo)) {

            try {
                cn.create(cursoNuevo);
            } catch (Exception ex) {
                Logger.getLogger(CursosGestor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        return false;
    }

    private boolean cursoExiste(Programas curso) {
        try {
            
            if (cn.findCursosByData(curso).size() >= 1){
            return false;}
        } catch (Exception ex) {
            Logger.getLogger(CursosGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
