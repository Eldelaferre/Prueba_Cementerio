$(document).ready(function () {
    $('#btn_nuevo_UsuVisitante').on('click', function () {
        Insertar();
        //alert("Boton funciona");
    });
    function Insertar() {
        var num = Math.floor((Math.random() * (999999999 - 0)) + 0);
        //alert(num);
        let rol = "Visitante";
        let usu = $('#usu').val();
        let cla = $('#cla').val();
        $.ajax({
            type: "post",
            url: "Servlet_Usuario",
            data: {dato: "Insertar", id: num, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");
                    alert("Esta pagina seré redirigida para completar la informacion");
                    window.location.replace("http://localhost:8080/Prueba_Cementerio/Registro_Visitante.jsp", Id = num, usua = "usu");
                }
            }
        });
    }
    ;
});


