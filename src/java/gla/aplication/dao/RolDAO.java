/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import gla.aplication.interfaces.InterfaceRolDAO;
import gla.aplication.factory.ConexionBD;
import gla.aplication.factory.FactoryConnectionDB;
import gla.aplication.model.Privilegio_Rol;
import gla.aplication.model.Rol;
import gla.aplication.model.V_Privilegio;

/**
 *
 * @author Jose
 */
public class RolDAO implements InterfaceRolDAO {

    ConexionBD conn;

    @Override
    public List<Rol> List_Rol() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        String sql = "select * from RHTR_ROL";
        List<Rol> list = new ArrayList<Rol>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                Rol r = new Rol();
                r.setId_rol(rs.getString("id_rol").trim());
                r.setNo_rol(rs.getString("no_rol").trim());
                r.setEs_rol(rs.getString("es_rol").trim());
                list.add(r);
            }

        } catch (SQLException e) {
        } finally {
            this.conn.close();
        }

        return list;
    }

    @Override
    public List<V_Privilegio> listarURL(String idrol, String id_modulo) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        String sql = "select * from  GLATL_PRIVILEGIO where IDROL='" + idrol + "' and id_modulo='" + id_modulo + "'";
        List<V_Privilegio> list = new ArrayList<V_Privilegio>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                V_Privilegio d = new V_Privilegio();
                d.setDi_url(rs.getString("di_url"));
                d.setId_detalle_privilegio(rs.getString("id_detalle_privilegio"));
                d.setId_privilegio(rs.getString("id_privilegio"));
                d.setId_rol(rs.getString("id_rol"));
                d.setNo_link(rs.getString("no_link"));
                d.setIc_link(rs.getString("ic_link"));
                d.setNu_orden(rs.getInt("nu_orden"));
                list.add(d);

            }

        } catch (SQLException e) {
        } finally {
            this.conn.close();
        }

        return list;
    }

    @Override
    public List<V_Privilegio> LISTAR_MODULOS(String idrol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void INSERT_ROLES(String no_rol, String es_rol) {
        CallableStatement cst;
        try {
            String id_rol = "";
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            cst = conn.conex.prepareCall("{CALL RHSP_INSERT_ROL( ?,?,?)}");
            cst.setString(1, id_rol);
            cst.setString(2, no_rol);
            cst.setString(3, es_rol);
            cst.execute();
        } catch (SQLException ex) {
        } finally {
            this.conn.close();
        }
    }

    @Override
    public void Mod_Rol(String Id_rol, String No_Rol, String Es_Rol) {
        CallableStatement cst;
        try {
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            cst = conn.conex.prepareCall("{CALL RHSP_MOD_ROL(?,?,?)}");
            cst.setString(1, Id_rol);
            cst.setString(2, No_Rol);
            cst.setString(3, Es_Rol);
            cst.execute();
        } catch (SQLException ex) {
        } finally {
            this.conn.close();
        }
    }

    @Override
    public void Desactivar_Roles(String id_rol) {
        CallableStatement cst;
        try {
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            cst = conn.conex.prepareCall("{CALL RHSP_DESACTIVAR_ROL(?)}");
            cst.setString(1, id_rol);
            cst.execute();
        } catch (SQLException ex) {
        } finally {
            this.conn.close();
        }
    }

    @Override
    public void Activar_Roles(String id_rol) {
        CallableStatement cst;
        try {
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            cst = conn.conex.prepareCall("{CALL RHSP_ACTIVAR_ROL(?)}");
            cst.setString(1, id_rol);
            cst.execute();
        } catch (SQLException ex) {
        } finally {
            this.conn.close();
        }
    }

    @Override
    public List<Privilegio_Rol> Listar_Rol_Privilegio(String id_rol) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        String sql = "SELECT P.NO_LINK, e.ES_DETALLE_PRIVILEGIO,e.ID_DETALLE_PRIVILEGIO FROM RHTD_DETALLE_PRIVILEGIO e , RHTR_ROL r, RHTV_PRIVILEGIO WHERE e.ID_ROL = r.ID_ROL AND e.ID_PRIVILEGIO=P.ID_PRIVILEGIO AND e.ID_ROL ='" + id_rol + "'";
        List<Privilegio_Rol> list = new ArrayList<Privilegio_Rol>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                Privilegio_Rol d = new Privilegio_Rol();
                d.setNo_link(rs.getString("No_link"));
                d.setEs_detalle_privilegio(rs.getString("Es_detalle_privilegio"));
                d.setId_detalle_privilegio(rs.getString("Id_detalle_privilegio"));
                list.add(d);
            }
        } catch (SQLException e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<Rol> Listar_Rol_id(String id_rol) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        String sql = "SELECT ROL, IDROL ,EST_ROL FROM RHTR_ROL WHERE ID_ROL='" + id_rol + "'";
        List<Rol> list = new ArrayList<Rol>();
        try {
            ResultSet rs = this.conn.query(sql);
            while (rs.next()) {
                Rol d = new Rol();
                d.setNo_rol(rs.getString("ROL"));
                d.setId_rol(rs.getString("IDROL"));
                d.setEs_rol(rs.getString("EST_ROL"));
                list.add(d);
            }

        } catch (SQLException e) {
        } finally {
            this.conn.close();
        }
        return list;
    }

    @Override
    public void Eliminar_rol(String id_Rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, ?>> List_rol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, ?>> List_rol(String idRol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
