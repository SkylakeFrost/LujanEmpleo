
package Gestores;


import Controlador.PostulantesJpaController;

import Modelo.Postulantes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael
 */
public class PostulanteGestor {
    PostulantesJpaController cn;
    
    public boolean crearPostulante(Postulantes postulanteNuevo) {
        cn = new PostulantesJpaController();
        if (postulanteExiste(postulanteNuevo)) {

            try {
                cn.create(postulanteNuevo);
            } catch (Exception ex) {
                Logger.getLogger(PostulanteGestor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        return false;
    }

    
    private boolean postulanteExiste(Postulantes postulante) {
        try {
            // validad qie la lista sea vacia, esto quiere decir q el usuario no esta en la bd.
            if (cn.findPostulanteByData(postulante).size() >= 1){
            return false;}
        } catch (Exception ex) {
            Logger.getLogger(PostulanteGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
