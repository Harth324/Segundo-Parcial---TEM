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

@WebServlet(name = "Editar", urlPatterns = {"/Editar"})
public class Editar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        ArrayList<Producto> prod = (ArrayList<Producto>)ses.getAttribute("prod");
        
        int id = Integer.parseInt(request.getParameter("id"));
        int ind = indice(request, id);
        
        Producto obj = new Producto();
        obj = prod.get(ind);
        request.setAttribute("producto", obj);
        request.getRequestDispatcher("Editar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession ses = request.getSession();
        ArrayList<Producto> prod = (ArrayList<Producto>)ses.getAttribute("prod");
        
        Producto obj = new Producto();
        obj.setId(Integer.parseInt(request.getParameter("id")));
        obj.setDesc(request.getParameter("descripcion"));
        obj.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
        obj.setPrecio(Double.parseDouble(request.getParameter("precio")));
        obj.setCategoria(request.getParameter("categoria"));
        
        int t = obj.getId();
        prod.set(indice(request, t), obj);
        
        response.sendRedirect("index.jsp");
    }
    
    private int indice (HttpServletRequest request, int id){
        HttpSession ses = request.getSession();
        ArrayList<Producto> prod = (ArrayList<Producto>)ses.getAttribute("prod");
        
        int i = 0;
        if (prod.size()>0){
            while (i < prod.size()){
                if (prod.get(i).getId() == id){
                    break;
                }
                else{
                    i++;
                }
            }
        }
        return i;
    }

}
