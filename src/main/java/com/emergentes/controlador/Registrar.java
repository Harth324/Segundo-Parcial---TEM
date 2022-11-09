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

@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String descripcion = request.getParameter("descripcion");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        double precio = Double.parseDouble(request.getParameter("precio"));
        String categoria = request.getParameter("categoria");
        
        Producto p = new Producto();
        
        p.setId(id);
        p.setDesc(descripcion);
        p.setCantidad(cantidad);
        p.setPrecio(precio);
        p.setCategoria(categoria);
        
        HttpSession ses = request.getSession();
        
        ArrayList<Producto> obj = (ArrayList<Producto>)ses.getAttribute("prod");
        obj.add(p);
        response.sendRedirect("index.jsp");
    }

}
