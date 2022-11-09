<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.modelo.Producto"%>
<%
    if (session.getAttribute("prod") == null)
    {
        ArrayList<Producto> p = new ArrayList<Producto>();
        session.setAttribute("prod", p);
    }
    
    ArrayList<Producto> prod = (ArrayList<Producto>)session.getAttribute("prod");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4>SEGUNDO PARCIAL</h4>
        <p><b>Nombre: </b>Jonathan Flores Chirinos</p>
        <p><b>Carnet: </b>10073709 LP</p>
        
        <h1>Productos</h1>
        <p><a href="NuevoProducto.jsp">Nuevo Producto</a></p>
        
        <table border="1">
            <tr>
                <th>ID</th>
                <th>DESCRIPCION</th>
                <th>CANTIDAD</th>
                <th>PRECIO</th>
                <th>CATEGORIA</th>
                <th></th>
                <th></th>
            </tr>
            <%
                if (prod != null)
                {
                    for (Producto p: prod)
                    {
            %>
            <tr>
                <td><%= p.getId() %></td>
                <td><%= p.getDesc() %></td>
                <td><%= p.getCantidad() %></td>
                <td><%= p.getPrecio() %></td>
                <td><%= p.getCategoria() %></td>
                <td><a href="Editar?id=<%= p.getId() %>">Editar</a></td>
                <td><a href="Eliminar?id=<%= p.getId() %>"
                       onclick="return confirm('¿Esta seguro de eliminar?')"
                       >Eliminar</a></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        
    </body>
</html>
