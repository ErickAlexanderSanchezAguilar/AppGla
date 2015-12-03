/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Alexander
 */
public interface InterfaceProveedores {

    public void INSERT_PROVEEDORES(String no_pro, String direc, String tele, String estado);

    public List<Map<String, ?>> List_proveedores();
    
}
