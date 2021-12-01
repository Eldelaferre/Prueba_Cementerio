$(document).ready(function () {
    
    alert("Prueba actualizar");

    $('#btn_Actualizar_Usuario').on('click', function () {
        //Actualizar();

        alert("En Actualizar");


        let ind = $('.btn_Actualizar_Usuario').index(this);
        alert(ind, "Numero en tabla");
        let doc = $('#doc').val().eq(ind);
        let rol = $('#rol').val().eq(ind);
        let usu = $('#usu').val().eq(ind);
        let cla = $('#cla').val().eq(ind);




    });



    function Actualizar() {
        alert("En Actualizar");

        let doc = $('#doc').val();
        let rol = $('#rol').val();
        let usu = $('#usu').val();
        let cla = $('#cla').val();

        $.ajax({
            type: "get",
            url: "Servlet_Actualizar_Usuario",
            data: {dato: "Insertar", d: doc, r: rol, u: usu, c: cla},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");
                    consultar();
                }
            }
        });

    }
    ;

});