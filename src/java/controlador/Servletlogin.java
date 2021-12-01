/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.login;
import modelo.loginDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

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

        if (request.getParameter("btnlogin") != null) {
            ArrayList<login> lista = new ArrayList<>();
            String u, c, r, n, co;
            int cod = 0;
            u = request.getParameter("usuario");
            c = request.getParameter("clave");
            //JOptionPane.showMessageDialog(null, u+c);
            r = request.getParameter("");
            n = request.getParameter("");

            login lo = new login(u, c);
            loginDao id = new loginDao();
            login datlo = new login(cod, r, u, c);
            lista = id.LoginDao(lo);
            //JOptionPane.showMessageDialog(null, lista);
            if (lista.size() > 0) {
                for (int i = 0; i < lista.size(); i++) {
                    datlo = lista.get(i);
                }
                if (datlo.getUser_Usu_log().equals(u) && datlo.getClave_Usu_log().equals(c)) {
                    JOptionPane.showMessageDialog(null, "Datos correctos");
                    HttpSession sesion = request.getSession();
                    //sesion.setAttribute("rosesion", u);
                    //sesion.setAttribute("varsesion", datlo.getId_Usuario_log());

                    //JOptionPane.showMessageDialog(null, datlo.getRol_Usu_log());
                    //JOptionPane.showMessageDialog(null, datlo.getUser_Usu_log());
                    if (datlo.getRol_Usu_log().equals("Administrador")) {
                        //JOptionPane.showMessageDialog(null, datlo.getRol_Usu_log());
                        //JOptionPane.showMessageDialog(null, datlo.getId_Usuario_log());
                        sesion.setAttribute("rol", datlo.getRol_Usu_log());
                        sesion.setAttribute("Codigo", datlo.getId_Usuario_log());
                        response.sendRedirect("EspacioEmpleado.jsp");

                    } else if (datlo.getRol_Usu_log().equals("Empleado")) {
                        //JOptionPane.showMessageDialog(null, datlo.getRol_Usu_log());
                        //JOptionPane.showMessageDialog(null, datlo.getId_Usuario_log());
                        sesion.setAttribute("rol", datlo.getRol_Usu_log());
                        sesion.setAttribute("Codigo", datlo.getId_Usuario_log());
                        response.sendRedirect("EspacioEmpleado.jsp");

                    } else if (datlo.getRol_Usu_log().equals("Visitante")) {
                        //JOptionPane.showMessageDialog(null, datlo.getRol_Usu_log());
                        //JOptionPane.showMessageDialog(null, datlo.getId_Usuario_log());
                        sesion.setAttribute("rol", datlo.getRol_Usu_log());
                        sesion.setAttribute("Codigo", datlo.getId_Usuario_log());
                        response.sendRedirect("index.jsp");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrecto, intente nuevamente");
                    response.sendRedirect("Login.jsp");
                }
            }
        }
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
