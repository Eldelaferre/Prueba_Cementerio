<%@page import="modelo.VisitanteDao"%>
<%@page import="modelo.Visitante"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.ArrayList"%>
<%
    HttpSession dato = request.getSession();
    int id = (int) (dato.getAttribute("Codigo"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/tabla.css">
        <title>Busqueda de fallecido</title>
    </head>
    <body>
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
        
        <div id="main-container1">
            <form  action="">
        <table class="table1">
        <thead>
            <tr>
                
                <th>ID Visitante</th>
                <th>Nombre Visitante</th>
                <th>Direccion Visitante</th>
                <th>Telefono Visitante</th>
                <th>Correo Visitante</th>
                <th>Rol</th>
                <th>Clave</th>
                <th>Accion</th>
            </tr>
        </thead>

        <%
        Visitante visitante=new Visitante(id);
        VisitanteDao visdao=new VisitanteDao();
        ArrayList<Visitante> lista1=new ArrayList<>();
        lista1 = visdao.consultavisitante(visitante);
        for(Visitante vis:lista1){
            
            JOptionPane.showMessageDialog(null, "en el for");
        %>
    
        <tbody>
            <tr>
                <td><input type="text" name="marca" class="fec" id="id" value="<%=vis.getId_Usuario()%>"></td>
                <td><input type="text" name="estado" class="fec" id="nom" value="<%=vis.getNombre_Visitante()%>"></td>
                <td><input type="text" name="precio" class="dir" id="dir" value="<%=vis.getDireccion_Visitante()%>"></td>
                <td><input type="text" name="col" class="tel" id="tel" value="<%=vis.getTelefono_Visitante()%>"></td>
                <td><input type="text" name="marca" class="cor" id="ema"value="<%=vis.getEmail_Visitante()%>"></td>
                <td><input type="text" name="col" class="tel" id="rol" value="<%=vis.getRol()%>"></td>
                <td><input type="text" name="marca" class="cor" id="cla"value="<%=vis.getClave()%>"></td>
                <td><input type="button" name="btnact" class="boton" value="Actualizar"></td>
            </tr>
            <%
                }
                %>
        </tbody>
    </table>
            </form>
    </body>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/Actualizar_Visitante.js"></script>
    
</html>