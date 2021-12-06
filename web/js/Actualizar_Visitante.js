$(document).ready(function(){
    
    alert("en el jsp")

    $('.boton').on('click',function(){
        actualizar();
        actualizar_Usuario()
    });
    
    
    function actualizar(){
        alert("en actualizar")
        let id=$('#id').val();
        let nom=$('#nom').val();
        let dir=$('#dir').val();
        let tel=$('#tel').val();
        let ema=$('#ema').val();
        
        alert("Codigo "+id+" "+" Documento "+nom);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Actualizar",
            data:{dato:"actualizar",i:id,n:nom,d:dir,t:tel,e:ema},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    function actualizar_Usuario(){
        alert("en actualizando usuario")
        let id=$('#id').val();
        let rol=$('#rol').val();
        let ema=$('#ema').val();
        let cla=$('#cla').val();
        
        alert("Codigo "+id+" "+" Email "+ema);
        
        $.ajax({
            
            type:"POST",
            url:"Servlet_Usuario",
            data:{dato:"actualizar",i:id,r:rol,e:ema,c:cla},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});
  