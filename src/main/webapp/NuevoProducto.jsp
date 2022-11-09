<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Producto</h1>
        <form action="Registrar" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" placeholder="Id del producto"></td>
                </tr>
                <tr>
                    <td>DESCRIPCION</td>
                    <td><input type="text" name="descripcion" placeholder="Descripcion del producto"></td>
                </tr>
                <tr>
                    <td>CANTIDAD</td>
                    <td><input type="text" name="cantidad" placeholder="Cantidad"></td>
                </tr>
                <tr>
                    <td>PRECIO</td>
                    <td><input type="text" name="precio" placeholder="Precio"></td>
                </tr>
                <tr>
                    <td>CATEGORIA</td>
                    <td><input type="text" name="categoria" placeholder="Categoria del producto"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Registrar Producto"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
