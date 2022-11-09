package com.emergentes.controlador;

import com.emergentes.modelo.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Eliminar", urlPatterns = {"/Eliminar"})
public class Eliminar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int ind = 0;
        int enc = 0;
        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession ses = request.getSession();
        ArrayList<Producto> prod = (ArrayList<Producto>)ses.getAttribute("prod");
        
        
        for (Producto item: prod){
            if (item.getId() == id){
                enc = ind;
            }
            ind++;
        }
        prod.remove(enc);
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
