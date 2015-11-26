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
        String sql = "SELECT * FROM TAVD_USUARIO where TRIM(no_usuario)='" + usuario.trim() + "' AND TRIM(CL_PASSWORD)='" + clave.trim() + "'";
        List<v_Usuario> list = new ArrayList<v_Usuario>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                v_Usuario v = new v_Usuario();
                v.setId_usuario(rs.getString("id_usuario"));
                /* v.setNo_usuario(rs.getString("no_usuario"));
                 v.setCl_password(rs.getString("cl_password"));
                 v.setId_tipo_usuario(rs.getString("id_tipo_usuario"));
                 v.setId_persona(rs.getString("id_persona"));
                 v.setEs_usuario(rs.getString("es_usuario"));
                 v.setNo_persona(rs.getString("no_persona"));
                 v.setAp_paterno(rs.getString("ap_paterno"));
                 v.setCo_estudiante(rs.getString("co_estudiante"));
                 v.setNu_celular(rs.getString("nu_celular"));
                 v.setNu_doc_dni(rs.getString("nu_doc_dni"));
                 v.setId_tipo_persona(rs.getString("id_tipo_persona"));
                 v.setAp_materno(rs.getString("ap_materno"));
                 v.setCo_electronico_pe(rs.getString("co_electronico_pe"));*/
                list.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
