$(document).ready(function(){
    
    alert("en el jsp")
    consultar();
    
    $('.boton').on('click',function(){
        
        //insertar();
        
    });
    
    $('.actu').on('click',function(){
        
        actualizar();
        
    });
    
    function insertar(){
        var cod = Math.floor((Math.random() * (9999 - 0)) + 0);
        let id = null;
        let date = new Date();
        let fecha = String(date.getFullYear()).padStart(2, '0') + '/' + String(date.getMonth() + 1).padStart(2, '0') + '/' + date.getDate();

        let id_vi = $('#idv').val();
        let pqr = $('#pqr').val();
        alert(id_vi);
        $.ajax({
            
            type:"POST",
            url:"ServletPQRS",
            data:{dato:"Insertar",c:id,cod_vi:id_vi,f:fecha,des:pqr},
            success:function(res){
                    if(res){
                        alert("Datos guardados");
                    }
                }
        });
    }
    function consultar(){
        alert("en consultar");
        
        $.ajax({
            
            
            type:"POST",
            url:"Servletconsultarpqrs",
            dataType: 'json',
           
                success:function(res){
                    console.log(res);
                    let tabla=document.querySelector('#res');
                    tabla.innerHTML='';
                    tabla.innerHTML=`<tr><th>Codigo</th>
                                        <th>Codigo Visitante</th>
                                        <th>Fecha</th>
                                        <th>Descripcion</th>
                                    </tr>`;
                    for(let i of res){
                        tabla.innerHTML+=`<tr>  <td><input class="cod" type="text" name="Codigo" id="Codigo" value="${i.codigo}"></td>
                                                <td><input class="cod" type="text" name="numero" id="numero" value="${i.codigovis}"></td>
                                                <td><input class="fec" type="text" name="fecha" id="fecha" value="${i.fecha}"></td>
                                                <td><input class="des" type="text" name="descripcion" id="descripcion" value="${i.descripcion}"></td>
                                                <td><input class="actu" type="button" id="boton"value="Actualizar"></td>
                                        </tr>`;
                    }
                }
        });
    }
    
    function actualizar(){
        alert("en actualizar")
        let cod=$('#Codigo').val();
        let codvi=$('#numero').val();
        let fec=$('#fecha').val();
        let des=$('#descripcion').val();
        
        alert("Codigo "+cod+" Codigo Visitante "+codvi);
        
        $.ajax({
            
            type:"POST",
            url:"ServletPQRS",
            data:{dato:"actualizar",c:cod,cv:codvi,f:fec,d:des},
                success:function(res){
                    if(res){
                        alert("datos actualizados");
                        consultar();
                    }
                }
        });
    }
    
});
