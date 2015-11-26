/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.interfaces;

import java.util.List;
import gla.aplication.model.v_Usuario;

/**
 *
 * @author ALFA
 */
public interface InterfaceUsuarioDAO {

    public List<v_Usuario> Validar_Logueo(String usuario, String clave);
}
