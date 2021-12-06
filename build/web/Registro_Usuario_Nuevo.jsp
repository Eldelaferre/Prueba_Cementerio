<%-- 
    Document   : Usuario
    Created on : 2/11/2021, 10:40:06 PM
    Author     : stild
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
        


        <title>Registro nuevo usuario</title>
    </head>
    <body>
        <!-- Parte del menú-->

        <header>
            <section class="sec_menu">
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
                        <li><a href="#sec2">Nosotros</a></li>
                        <li><a href="#sec3">Servicios</a></li>
                        <li><a href="#sec4">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href="Login.jsp">Ingreso</a></li>
                    </ul>
                </nav>
            </section>
        </header>
        <!-- Fin Menú-->
        <main>

            <!-- Contenido pagina principal -->
            <section class="registro">

                <form action="" method="POST" id="frm">
                    <h4>Registro nuevo Usuario</h4>
                    <input class="control" id="usu" type="email" name="usuario" placeholder="Ingrese su Correo o Usuario">
                    <input class="control" id="cla" type="password" name="Nombres" placeholder="Ingrese su Contraseña">
                    <input class="boton btn_nuevo_UsuVisitante" type="button" id="btn_nuevo_UsuVisitante" value="Continuar">
                </form>

            </section>
        </main>
    </body>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/Registro_Usu_Visitante.js"></script>
    
</html>