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
public class V_Usuario {

    private String IDUSUARIO;
    private String USUARIO;
    private String PASSWORD;
    private String IDROL;
    private String APE_PAT;
    private String APE_MAT;
    private String DNI;
    private String CELULAR;
    private String DIRECCION;
    private String FECH_NAC;
    private String SEXO;
    private String NOMBRE;

    public V_Usuario(String IDUSUARIO, String USUARIO, String PASSWORD, String IDROL, String APE_PAT, String APE_MAT, String DNI, String CELULAR, String DIRECCION, String FECH_NAC, String SEXO, String NOMBRE) {
        this.IDUSUARIO = IDUSUARIO;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
        this.IDROL = IDROL;
        this.APE_PAT = APE_PAT;
        this.APE_MAT = APE_MAT;
        this.DNI = DNI;
        this.CELULAR = CELULAR;
        this.DIRECCION = DIRECCION;
        this.FECH_NAC = FECH_NAC;
        this.SEXO = FECH_NAC;
        this.NOMBRE = NOMBRE;
    }
    
    public V_Usuario() {
        this.IDUSUARIO = "";
        this.USUARIO = "";
        this.PASSWORD = "";
        this.IDROL = "";
        this.APE_PAT = "";
        this.APE_MAT = "";
        this.DNI = "";
        this.CELULAR = "";
        this.DIRECCION = "";
        this.FECH_NAC = "";
        this.SEXO = "";
        this.NOMBRE = "";
    }
    
    public String getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(String IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getIDROL() {
        return IDROL;
    }

    public void setIDROL(String IDROL) {
        this.IDROL = IDROL;
    }

    public String getAPE_PAT() {
        return APE_PAT;
    }

    public void setAPE_PAT(String APE_PAT) {
        this.APE_PAT = APE_PAT;
    }

    public String getAPE_MAT() {
        return APE_MAT;
    }

    public void setAPE_MAT(String APE_MAT) {
        this.APE_MAT = APE_MAT;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(String CELULAR) {
        this.CELULAR = CELULAR;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getFECH_NAC() {
        return FECH_NAC;
    }

    public void setFECH_NAC(String FECH_NAC) {
        this.FECH_NAC = FECH_NAC;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
}
