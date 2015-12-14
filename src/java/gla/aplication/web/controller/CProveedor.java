/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.web.controller;

import com.google.gson.Gson;
import gla.aplication.dao.ProveedoresDAO;
import gla.aplication.interfaces.InterfaceProveedores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alexander
 */
@WebServlet(name = "Proveedor", urlPatterns = {"/Proveedor"})
public class CProveedor extends HttpServlet {

    InterfaceProveedores prov = new ProveedoresDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, Object> rpta = new HashMap<String, Object>();
        String opc = request.getParameter("opc");
        HttpSession sesion = request.getSession(true);
        String iduser = (String) sesion.getAttribute("IDUSER");

        try {
            if (opc.equals("mat_rol")) {
                response.sendRedirect("vista/REGISTRO/Reg_Proveedores.jsp");
            }
            if (opc.equals("Listar_Rol")) {
                List<Map<String, ?>> list = prov.List_proveedores();
                 rpta.put("rpta", "1");
                 rpta.put("lista", list);
            }
            if (opc.equals("Modificar_Rol")) {
                /* String idrol = request.getParameter("idrol");
                 getServletContext().setAttribute("Listar_Rol_id", rol.Listar_Rol_id(idrol));
                 getServletContext().setAttribute("List_Rol", rol.List_Rol());
                 response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");*/
            }
            if (opc.equals("Modificar")) {
                /* String idrol = request.getParameter("id_rol");
                 String no_rol = request.getParameter("Nombre_Rol");
                 String Es_rol = request.getParameter("Es_rol");
                 rol.Mod_Rol(idrol, no_rol, Es_rol);
                 getServletContext().setAttribute("List_Rol", rol.List_Rol());
                 response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");*/
            }
            if (opc.equals("Activar_Rol")) {
                /* String idrol = request.getParameter("idrol");
                 rol.Activar_Roles(idrol);
                 getServletContext().setAttribute("List_Rol", rol.List_Rol());
                 response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");*/
            }
            if (opc.equals("Desactivar_Rol")) {
                /*String idrol = request.getParameter("idrol");
                 rol.Desactivar_Roles(idrol);
                 getServletContext().setAttribute("List_Rol", rol.List_Rol());
                 response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");*/
            }
            if (opc.equals("Eliminar_Rol")) {
                /* String idrol = request.getParameter("idrol");
                 rol.Desactivar_Roles(idrol);
                 getServletContext().setAttribute("List_Rol", rol.List_Rol());
                 response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");*/
            }
            if (opc.equals("REGISTRAR")) {
                 out.print("NO SE PUDO CONECTAR");
                String NOM_PRO = request.getParameter("NOMBRE");
                String DIREC = request.getParameter("DIRECCION");
                String TELEF = request.getParameter("TELEFONO");
                String ESTADO = request.getParameter("ESTADO");
               
                prov.INSERT_PROVEEDORES(NOM_PRO, DIREC, TELEF, ESTADO);
                out.print(request.getParameter("ESTADO"));
                //getServletContext().setAttribute("List_Rol", rol.List_Rol());
                response.sendRedirect("vista/REGISTRO/Reg_Roles.jsp");
            }
        } catch (Exception e) {

            rpta.put("rpta", "-1");
            rpta.put("mensaje", e.getMessage());
        }
        Gson gson = new Gson();
        out.println(gson.toJson(rpta));
        out.flush();
        out.close();

    }

}
