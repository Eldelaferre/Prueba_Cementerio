$(document).ready(function () {
    alert("Registro visitante prueba");
    
    $('#btn_Registro_Visitante').on('click', function () {
        
        Insertar();
        alert("entra al boton");
        
    });
    
    function Insertar() {
        alert("en insertar");
        let doc=$('#doc').val();
        let nom=$('#nom').val();
        let dir=$('#dir').val();
        let tel=$('#tel').val();
        let cor=$('#cor').val();

        
        alert(" Documento "+doc);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Visitante",
            data:{dato:"insertar",d:doc,n:nom,di:dir,t:tel,co:cor},
                success:function(res){
                    if(res){
                        alert("datos guardados");
                    }
                }
        });
    }
})
