<%-- 
    Document   : PQR
    Created on : 2/11/2021, 10:42:02 PM
    Author     : stild
--%>
<%
    HttpSession dato = request.getSession();
    int id = (int) (dato.getAttribute("Codigo"));
    //String usuario = (String) (dato.getAttribute("usuario"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/tabla.css">
        <title>Formulario Registro certificacion</title>
    </head>
    <body>
        <!-- Parte del menú-->

        <header>
            <section class="sec_menu">
                <a href="index_1.jsp" id="Logo">Cementerios</a>

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
                        <li><a href="">Nosotros</a></li>
                        <li><a href="">Servicios</a></li>
                        <li><a href="">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href=""><%=id%></a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->

        <!-- Contenido pagina principal -->
        <main>
            <section class="registro">
                <form action="" method="POST">
                    <h4>Registro de PQR</h4>
                    <input class="control" type="text" name="codigo" id="idv" value="<%=id%>" style="display:none;" >
                    <textarea class="control" id="descripcion" cols="80" rows="8" required
                              placeholder="Describa su PQR."></textarea>

                    <input class="boton btn_registrar_pqr" type="button" id="btn_registrar_pqr" value="Enviar">
                </form>

            </section>
        </main>
    </body>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/Registro_PQR.js"></script>
</html>
