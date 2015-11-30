/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.dao;

import gla.aplication.factory.ConexionBD;
import gla.aplication.factory.FactoryConnectionDB;
import gla.aplication.interfaces.InterfaceReporte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;

/**
 *
 * @author Alexander
 */
public class ReporteDAO implements InterfaceReporte {

    ConexionBD conn;

    @Override
    public List<Map<String, ?>> ListarUsuaio() {
        List<Map<String, ?>> Lista = new ArrayList<Map<String, ?>>();
    try {
            this.conn = FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
            String sql="SELECT * FROM GLATL_USUARIOS ";
           // sql += (!Nom.equals("")) ? "Where UPPER(NOMBRE)='" + Nom.trim().toUpperCase() + "'" : "";
            //sql += (!Ape_pa.equals("")) ? "Where UPPER(APE_PAT)='" + Ape_pa.trim().toUpperCase() + "'" : "";
            ResultSet rs = this.conn.query(sql);
            rs.close();
        }catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error!");
        } finally {
            try {
                this.conn.close();
            } catch (Exception e) {
            }
        }
        return Lista;

    }
}