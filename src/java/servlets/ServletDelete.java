/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BeansPackage.DataEJB;
import Entidad.Actores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nacho
 */
@WebServlet(name = "ServletDelete", urlPatterns = {"/ServletDelete"})
public class ServletDelete extends HttpServlet {
    @EJB
    DataEJB aEJB;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private void delete(HttpServletRequest request){
        String nombre = request.getParameter("nombre");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletDelete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletDelete at " + request.getContextPath() + "</h1>");
            
            List<Actores> l = aEJB.findAll();
                     
            l.forEach((actor) -> {
                out.println("<b>Nacionalidad:</b>"+ actor.getNacionalidad() + ", <b>Nombre </b>"+actor.getNombre()+"<br>" );
                out.println("<form action='ServletDelete' method=\"POST\">");
                out.println("<input type=\"submit\" text=\"Insertalo de unas\" name=\"enviar\" value=\"Borrar\"/>");
                out.println("<input type=hidden name=nombre value="+actor.getNombre()+">");
                out.println("</form><br/>");
                
            });
            out.println("</body>");
            out.println("</html>");
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
