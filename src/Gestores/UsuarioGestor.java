/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Controlador.UsuariosJpaController;
import Modelo.Usuarios;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peloncha
 */
public class UsuarioGestor {

    UsuariosJpaController cn;

    
    public boolean crearUsuario(Usuarios usuarioNuevo) {
        cn = new UsuariosJpaController();
        if (usuarioExiste(usuarioNuevo)) {

            try {
                cn.create(usuarioNuevo);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioGestor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        return false;
    }

    private boolean usuarioExiste(Usuarios usuario) {
        try {
            // validad qie la lista sea vacia, esto quiere decir q el usuario no esta en la bd.
            if (cn.findUsuarioByData(usuario).size() >= 1){
            return false;}
        } catch (Exception ex) {
            Logger.getLogger(UsuarioGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean UsuarioEncontrado(Usuarios usuarioExiste) {
        cn = new UsuariosJpaController();
        if (usuarioExiste(usuarioExiste)) {
            return true;
        }
        return false;
        
    }public boolean ContrasenaValidaUsuario (Usuarios usuarioExiste) {
        cn = new UsuariosJpaController();
        if (cn.findUserPass(usuarioExiste).size() >= 1) {
            return true;
        }
        return false;
    }

}
