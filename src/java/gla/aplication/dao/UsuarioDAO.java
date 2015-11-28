/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import gla.aplication.factory.ConexionBD;
import gla.aplication.factory.FactoryConnectionDB;
import gla.aplication.interfaces.InterfaceUsuarioDAO;
import gla.aplication.model.v_Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander
 */
public class UsuarioDAO implements InterfaceUsuarioDAO {

    ConexionBD conn;

    @Override
    public List<v_Usuario> Validar_Logueo(String usuario, String clave) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        String sql = "SELECT * FROM GLATL_USUARIOS where TRIM(USUARIO)='" + usuario.trim() + "' AND TRIM(PASSWORD)='" + clave.trim() + "'";
        List<v_Usuario> list = new ArrayList<v_Usuario>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                v_Usuario v = new v_Usuario();
                v.setIDUSUARIO(rs.getString("IDUSUARIO"));                
                list.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
