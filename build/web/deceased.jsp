<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.FallecidoDao"%>
<%@page import="modelo.Fallecido"%>
<%
    HttpSession dato=request.getSession();
    String cod=(String)(dato.getAttribute("CodigoF"));
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
                
                <th>Nombre de fallecido</th>
                <th>Fecha de nacimiento</th>
                <th>Fecha de muerte</th>
                <th>Responsable</th>
                <th>Correo Responsable</th>
                <th>Telefono Responsable</th>
                <th>Ubicacion Fallecido</th>
            </tr>
        </thead>

        <%
        Fallecido fallecido=new Fallecido(cod);
        FallecidoDao faldao=new FallecidoDao();
        ArrayList<Fallecido> lista1=new ArrayList<>();
        lista1 = faldao.consultaFallecido(fallecido);
        for(Fallecido fal:lista1){
            
            JOptionPane.showMessageDialog(null, "en el for");
        %>
    
        <tbody>
            <tr>
                
                <td><input type="text" name="marca" class="fec" value="<%=fal.getNombre_Fallecido()%>"></td>
                <td><input type="text" name="estado" class="fec" value="<%=fal.getFecha_Nacimiento()%>"></td>
                <td><input type="text" name="precio" class="fec" value="<%=fal.getFecha_Muerte()%>"></td>
                <td><input type="text" name="col" class="fec" value="<%=fal.getResponsable_Fallecido()%>"></td>
                <td><input type="text" name="marca" class="cor" value="<%=fal.getEmail_Responsable()%>"></td>
                <td><input type="text" name="marca" class="tel" value="<%=fal.getTelefono_Responsable()%>"></td>
                <td><input type="text" name="estado" class="codi" value="<%=fal.getUbicacion()%>"></td>
            </tr>
            <%
                }
                %>
        </tbody>
    </table>
            </form>
    </body>
</html>


