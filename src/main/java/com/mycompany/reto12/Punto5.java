/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vladimir
 */
@WebServlet(name = "Punto5", urlPatterns = {"/Punto5"})
public class Punto5 extends HttpServlet {
        
    
        ArrayList <Double> numbers = new ArrayList<Double>();
        @Override
        
        public void init(ServletConfig config)throws ServletException{
            super.init(config);
            numbers.add(Math.random()*10+1);
            
        }
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Punto5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Punto5 at " + request.getContextPath() + "</h1>");
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
           
    
        for (int i=1; i <10; i++){
            numbers.add(Math.random()*10+1);
            
        }
        double suma = 0 ;
        for (int contador  = 0; contador<numbers.size(); contador ++ ){
            suma += numbers.get(contador);
        }
        
        
         
          
          response.setContentType("text/html;charset=UTF-8");
          try (PrintWriter out = response.getWriter()) {
         
 
          out.println("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Raiz Cuadrada !!</title>\n" +
            "<link rel='stylesheet' media='screen' href='css/Styles.css'/>\n" +   
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "<h1><b>Numeros Aleatorios !</b></h1>\n" +
            "<li><b>la suma total es: </b> "   + suma + 
            "<li><b>Los numeros ingresados: </b> "   + numbers +       
            "</li>\n" +
            "</body>\n" +
            "</html>");
     
    
        }
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
