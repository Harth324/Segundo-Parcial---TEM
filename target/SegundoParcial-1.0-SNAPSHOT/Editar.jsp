<%@page import="com.emergentes.modelo.Producto"%>
<%
    Producto item = (Producto)request.getAttribute("producto");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Producto</h1>
        <form action="Editar" method="post">
            <input type="hidden" name="id" value="<%=item.getId() %>">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value="<%=item.getId() %>"></td>
                </tr>
                <tr>
                    <td>DESCRIPCION</td>
                    <td><input type="text" name="descripcion" value="<%=item.getDesc() %>"></td>
                </tr>
                <tr>
                    <td>CANTIDAD</td>
                    <td><input type="text" name="cantidad" value="<%=item.getCantidad() %>"></td>
                </tr>
                <tr>
                    <td>PRECIO</td>
                    <td><input type="text" name="precio" value="<%=item.getPrecio() %>"></td>
                </tr>
                <tr>
                    <td>CATEGORIA</td>
                    <td><input type="text" name="categoria" value="<%=item.getCategoria() %>"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Editar Producto"></td>
                </tr>
                <%
                    
                %>
            </table>
        </form>
    </body>
</html>
