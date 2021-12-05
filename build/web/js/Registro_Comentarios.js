$(document).ready(function () {
    //alert("En regsada");
    $('#btn_registrar_comentario').on('click', function () {

        alert("Boton funciona");
        Insertar();

    });
    function Insertar() {
        var cod = Math.floor((Math.random() * (9999 - 0)) + 0);

        let date = new Date();
        let fecha = String(date.getFullYear()).padStart(2, '0') + '/' + String(date.getMonth() + 1).padStart(2, '0') + '/' + date.getDate();

        let id_vi = $('#idv').val();
        let comen = $('#descripcion').val();
        $.ajax({
            type: "post",
            url: "Servletcomentarios",
            data: {dato: "Insertar", cod: cod, id: id_vi, fec: fecha, com: comen},
            success: function (res) {
                if (res) {
                    alert("Datos Guardados");

                }
            }
        });

    }
    ;
});


