$(document).ready(function () {

    alert("en el js");


    
    $('.btninsF').on('click',function(){
        
        alert("en el boton");
        insertar ();
        
    });

    function insertar (){
        alert("en insertar");
        let cod=$('#codf').val();

        $.ajax({
            type:"POST",
            url:"Servletfallecidos",
            data:{c:cod},
                success:function (res){
                    if(res){
                        alert("datos guardados");
                        consultar();
                    }
                }
        
        });
    }

    function consultar(){
        alert("en consultar")
        
        $.ajax({
            type:"POST",
            url:"ServletFallecidos",
            dataType:'json',
            
                success:function (res){
                    console.log(res)
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<thead><tr><th>Codigo</th>  
                                        <th>Codigo Fallecido</th>
                                        <th>Fecha realizada</th>
                                        <th>Hora realizada</th>
                                        <th>Tipo</th>
                                        <th>Accion</th>
                                        
                                    </tr></thead> `;
                for(let i of res){
                    tabla.innerHTML+=`<tbody><tr>
                                    
                                    <td><input class="codi" type="text" name="doc"  id="ces" value=" ${i.codestado}"></td>
                                    <td><input class="codi" type="text" name="usu"  id="cfal" value=" ${i.codfallecido}"></td>
                                    <td><input class="fec" type="text" name="cla"  id="fecr" value=" ${i.fecreal}"></td>
                                    <td><input class="doc" type="text" name="rol"  id="horr" value="${i.horreal}"></td>
                                    <td><input class="des" type="text" name="est"  id="tipo" value="${i.tipo}"></td>
                                    <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                    
                                    </tr></tbody>`;
                }                    
            }
        
        });
    }


   
});