<%-- 
    Document   : Registro_Visitante
    Created on : 30/11/2021, 09:37:12 PM
    Author     : stild

<%
HttpSession datos = request.getSession();
    String id = (String) datos.getAttribute("Id_Usu");

%>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/tabla.css">
        <script src="Js/jquery-3.6.0.min.js"></script>
        <script src="Js/Insertar_Visitante.js"></script>

        <title>Registro Visitante</title>
    </head>
    <body>
        <!-- Parte del menú-->

        <header>
            <section>
                <a href="index.jsp" id="Logo">Cementerios</a>

                <label for="menu-1" class="menu">
                    <ul>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>

                    </ul>
                </label>
                <input type="checkbox" id="menu-1">

                <nav>
                    <ul>
                        <li><a href="Nosotros.html">Nosotros</a></li>
                        <li><a href="">Servicios</a></li>
                        <li><a href="">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href="Login.html">Ingreso</a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->
        <section class="registro">
            <form action=""  method="POST">
                
                <h4>Completa los siguientes datos</h4>
                <%-- <h4><%=id%></h4>--%>

                
                <input class="control" type="text" name="nombre" id="nom" placeholder="Ingrese el Nombre">
                <input class="control" type="text" name="direccion" id="dir" placeholder="Ingrese la Direccion">
                <input class="control" type="number" name="telefono" id="tel" placeholder="Ingrese el Telefono">
                


                <input class="boton btn_Registro_Visitante" id="btn_Registro_Visitante" type="button" value="Finalizar">
                

            </form>

        </section>
        
        <table class="table" id="res">
        
        </table>
        
    </body>
</html>
