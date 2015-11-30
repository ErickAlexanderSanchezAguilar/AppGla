/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.model;

/**
 *
 * @author Alexander
 */
public class Proveedor {

    String IDPROVEEDOR = "";
    String NOMBRE = "";
    String DIRECCION = "";
    String TELEFONO = "";
    String EST_PROVEEDOR = "";

    public String getIDPROVEEDOR() {
        return IDPROVEEDOR;
    }

    public void setIDPROVEEDOR(String IDPROVEEDOR) {
        this.IDPROVEEDOR = IDPROVEEDOR;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getEST_PROVEEDOR() {
        return EST_PROVEEDOR;
    }

    public void setEST_PROVEEDOR(String EST_PROVEEDOR) {
        this.EST_PROVEEDOR = EST_PROVEEDOR;
    }

}
