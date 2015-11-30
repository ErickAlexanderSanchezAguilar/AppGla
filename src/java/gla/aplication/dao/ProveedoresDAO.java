/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.dao;

import gla.aplication.interfaces.InterfaceProveedores;
import gla.aplication.factory.ConexionBD;
import gla.aplication.factory.FactoryConnectionDB;
import gla.aplication.model.Rol;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander
 */
public class ProveedoresDAO implements InterfaceProveedores {

    ConexionBD conn;

    @Override
    public void INSERT_PROVEEDORES(String no_pro, String direc, String tele, String estado) {
        CallableStatement cst;
        try {
            String idpro = "";
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            cst = conn.conex.prepareCall("{CALL GLASP_INSERT_ROL( ?,?,?,?,?)}");
            cst.setString(1, idpro);
            cst.setString(2, no_pro);
            cst.setString(3, direc);
            cst.setString(4, tele);
            cst.setString(5, estado);
            cst.execute();
        } catch (SQLException ex) {
        } finally {
            this.conn.close();
        }

    }
}
