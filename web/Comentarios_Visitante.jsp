<%-- 
    Document   : Comentario_Visitante
    Created on : 2/11/2021, 09:34:16 PM
    Author     : stild
--%>
<%
    HttpSession dato = request.getSession();
    int id = (int) (dato.getAttribute("Codigo"));
    //String usuario = (String) (dato.getAttribute("usuario"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/tabla.css">
        <title>Formulario Registro Comentario</title>
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
                        <li><a href="Nosotros.jsp">Nosotros</a></li>
                        <li><a href="">Servicios</a></li>
                        <li><a href="">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href=""><%=id%></a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->
        <main>
            <section class="registro">
                <form action="" method="POST">
                    <h4>Ingrese su Comentario</h4>
                    <input class="control" type="text" name="codigo" id="idv" value="<%=id%>" style="display:none;" >
                    <textarea class="control" id="descripcion" cols="80" rows="8" required
                              placeholder="Ingrese su opinion o comentario."></textarea>
                    <input class="boton btn_registrar_comentario" type="button" id="btn_registrar_comentario" value="Enviar">

                </form>
            </section>

        </main>

    </body>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/Registro_Comentarios.js"></script>
</html>
