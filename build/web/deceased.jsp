<%@page import="modelo.FallecidoDao"%>
<%@page import="modelo.Fallecido"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.FallecidoDao"%>
<%@page import="modelo.Fallecido"%>
<%
    HttpSession dato=request.getSession();
    int Codigo=(int)(dato.getAttribute("CodigoF"));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/styles2.css">
    </head>
    <body>
        <div id="main-container">
            <form  action="">
        <table>
        <thead>
            <tr>
                <th>Codigo Fallecido</th>
                <th>Tumba Codigo</th>
                <th>Fecha de ingreso</th>
                <th>Nombre del fallecido</th>
                <th>Fecha de nacimiento</th>
                <th>Fecha de muerte</th>
                <th>Responsable</th>
                <th>Correo de responsable</th>
                <th>Telfono de responsable</th>
                <th>Codigo de estado</th>
                <th>Ubicacion de fallecido</th>
            </tr>
        </thead>

        <%
        Fallecido fallecido=new Fallecido(Codigo);
        FallecidoDao faldao=new FallecidoDao();
        ArrayList<Fallecido> lista=new ArrayList<>();
        lista= faldao.consultaFallecido(fallecido);
        for(Fallecido fa:lista){
            
        
        %>
    
        <tbody>
            <tr>
                
                <td><input type="text" name="mod" class="mod" value="<%=fa.getCodigo_fallecido()%>"></td>
                <td><input type="text" name="col" class="col" value="<%=fa.getCodigo_Tumba()%>"></td>
                <td><input type="text" name="marca" class="marca" value="<%=fa.getFecha_Ingreso_Fallecido() %>"></td>
                <td><input type="text" name="estado" class="estado" value="<%=fa.getNombre_Fallecido()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getFecha_Nacimiento()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getFecha_Muerte()%>"></td>
                <td><input type="text" name="estado" class="estado" value="<%=fa.getHora_Muerte()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getResponsable_Fallecido()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getEmail_Responsable()%>"></td>
                <td><input type="text" name="estado" class="estado" value="<%=fa.getTelefono_Responsable()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getUbicacion()%>"></td>
                <td><input type="text" name="precio" class="precio" value="<%=fa.getCodigo_Estado_Fallecido()%>"></td>
            </tr>
            <%
                }
                %>
        </tbody>
    </table>
            </form>
    </body>
</html>
