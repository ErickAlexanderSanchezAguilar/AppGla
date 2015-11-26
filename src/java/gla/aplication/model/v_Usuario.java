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
public class v_Usuario {

    /*  private String id_usuario;
    private String no_usuario;
    private String cl_password;
    private String id_tipo_usuario;
    private String id_persona;
    private String es_usuario;
    private String no_persona;
    private String ap_paterno;
    private String co_estudiante;
    private String nu_celular;
    private String nu_doc_dni;
    private String id_tipo_persona;*/
    


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

    /*public v_Usuario(String id_usuario, String no_usuario, String cl_password, String id_tipo_usuario, String id_persona, String es_usuario, String no_persona, String ap_paterno, String co_estudiante, String nu_celular, String nu_doc_dni, String id_tipo_persona, String ap_materno, String co_electronico_pe) {
     this.id_usuario = id_usuario;
     this.no_usuario = no_usuario;
     this.cl_password = cl_password;
     this.id_tipo_usuario = id_tipo_usuario;
     this.id_persona = id_persona;
     this.es_usuario = es_usuario;
     this.no_persona = no_persona;
     this.ap_paterno = ap_paterno;
     this.co_estudiante = co_estudiante;
     this.nu_celular = nu_celular;
     this.nu_doc_dni = nu_doc_dni;
     this.id_tipo_persona = id_tipo_persona;
     this.ap_materno = ap_materno;
     this.co_electronico_pe = co_electronico_pe;
     }
     */
    public v_Usuario(String IDUSUARIO, String USUARIO, String PASSWORD, String IDROL, String APE_PAT, String APE_MAT, String DNI, String CELULAR, String DIRECCION, String FECH_NAC, String SEXO, String NOMBRE) {
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
    /*
     public v_Usuario() {
     this.id_usuario = "";
     this.no_usuario = "";
     this.cl_password = "";
     this.id_tipo_usuario = "";
     this.id_persona = "";
     this.es_usuario = "";
     this.no_persona = "";
     this.ap_paterno = "";
     this.co_estudiante = "";
     this.nu_celular = "";
     this.nu_doc_dni = "";
     this.id_tipo_persona = "";
     this.ap_materno = "";
     this.co_electronico_pe = "";
     }*/

    public v_Usuario() {
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
    
/*
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNo_usuario() {
        return no_usuario;
    }

    public void setNo_usuario(String no_usuario) {
        this.no_usuario = no_usuario;
    }

    public String getCl_password() {
        return cl_password;
    }

    public void setCl_password(String cl_password) {
        this.cl_password = cl_password;
    }

    public String getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(String id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getEs_usuario() {
        return es_usuario;
    }

    public void setEs_usuario(String es_usuario) {
        this.es_usuario = es_usuario;
    }

    public String getNo_persona() {
        return no_persona;
    }

    public void setNo_persona(String no_persona) {
        this.no_persona = no_persona;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getCo_estudiante() {
        return co_estudiante;
    }

    public void setCo_estudiante(String co_estudiante) {
        this.co_estudiante = co_estudiante;
    }

    public String getNu_celular() {
        return nu_celular;
    }

    public void setNu_celular(String nu_celular) {
        this.nu_celular = nu_celular;
    }

    public String getNu_doc_dni() {
        return nu_doc_dni;
    }

    public void setNu_doc_dni(String nu_doc_dni) {
        this.nu_doc_dni = nu_doc_dni;
    }

    public String getId_tipo_persona() {
        return id_tipo_persona;
    }

    public void setId_tipo_persona(String id_tipo_persona) {
        this.id_tipo_persona = id_tipo_persona;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getCo_electronico_pe() {
        return co_electronico_pe;
    }

    public void setCo_electronico_pe(String co_electronico_pe) {
        this.co_electronico_pe = co_electronico_pe;
    }
    private String ap_materno;
    private String co_electronico_pe;*/
    
    

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
