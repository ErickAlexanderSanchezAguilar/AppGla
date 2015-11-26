/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gla.aplication.web.controller;

import gla.aplication.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import gla.aplication.interfaces.InterfaceUsuarioDAO;
import gla.aplication.model.v_Usuario;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alexander
 */
@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class CValidar extends HttpServlet {
    
    InterfaceUsuarioDAO u = new UsuarioDAO();

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Usuario = request.getParameter("Usuario");
        String Clave = request.getParameter("Password");
        String opc = request.getParameter("opc");
        if (opc.equals("insertar")) {
            if (Usuario.equals("") && Clave.equals("")) {
                out.print("o");
            } else {
                List<v_Usuario> t_usuario = u.Validar_Logueo(Usuario, Clave);
                v_Usuario user = new v_Usuario();
                int cant = t_usuario.size();
                if (cant > 0) {
                    HttpSession sesion = request.getSession(true);
                    sesion.setAttribute("ID_USER", user.getIDUSUARIO());
                    sesion.setAttribute("NOMBRE", user.getUSUARIO());
                    sesion.setAttribute("AP_P", user.getAPE_PAT());
                    sesion.setAttribute("AP_M", user.getAPE_MAT());
                    response.sendRedirect("Principal.html");
                } else {
                    out.print("no se pu");
                }
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
