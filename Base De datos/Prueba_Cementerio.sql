create database Prueba_Cementerio;
use Prueba_Cementerio;

# Usuarios que interactuan en la Aplicaion web

create table Usuario(
Usua_Id int primary key,
Usua_rol varchar (20),
Usua_user varchar(20),
Usua_clave varchar(20)
);

insert into	Usuario values
(1,"Visitante","A","321"),
(2,"Visitante","B","321"),
(3,"Empleado","Maicol","321"),
(4,"Empleado","Jonathan","321"),
(5,"Empleado","Daniel","321"),
(6,"Administrador","Admin","321");
select *from Usuario;

create table Tbempleado(
Id_Empleado  int primary key ,
Emple_tipo varchar(20),
Emple_Cedula int,
Emple_nombre varchar(45),
Emple_direccion varchar(45),
Emple_telefono varchar(15),
Emple_email varchar(45),
Emple_imagen varchar(255),
foreign key (Id_Empleado) references Usuario (Usua_Id)
);
insert into	Tbempleado values
(3,"Operario",10,"Jonathan B.","Cra 3B No 20-46",3116581593,"JonathanB@cementerio.com","1"),
(4,"Operario",20,"Daniel M","Calle 15 No 20-05",3156825345,"DanielM@cementerio.com","1"),
(5,"Operario",30,"Maicol A.","Cra 7 No 6-50",3229161533,"MaicolS@cementerio.com","1"),
(6,"Administrador",01,"Admin","Cementerio",018000000000,"Admin@cementerio.com","1");
select	*from Tbempleado;

create table TBvisitante(
Id_Usuario int primary key,
visit_nombre varchar(45),
visit_direccion varchar(45),
visit_telefono varchar(15),
visit_email varchar(45),
foreign key(Id_Usuario) references Usuario (Usua_Id)
);
insert into TBvisitante values
(1,"Alexander","carrera3#21-24",8502351,"alexf@hotmail.com"),
(2,"Julian","transversal64#45-65",5439021,"julianl@hotmail.com");
select*from TBvisitante;


# Datos para consultar y modificar en Aplicaion Web

/*Fallecidos*/

create table TbEstado_fallecido(
Cod_Estado int auto_increment primary key,
Estado_Tipo varchar(50),
Estado_Descrip varchar(255)
);
insert into TbEstado_fallecido values
(NULL,"Inhumado","Descripcion........................"),
(NULL,"Cremado","Descripcion........................"),
(NULL,"Exhumado","Descripcion........................");
select*from TbEstado_fallecido;


create table Tbtumba(
Tumba_codigo int auto_increment primary key,
Tumba_ubicacion varchar(45)
);
insert into Tbtumba values
(NULL,"A1"),
(NULL,"A2"),
(NULL,"A6");
select *from Tbtumba;

create table Tbfallecido(
fallec_codigo int auto_increment primary key,
Tbtumba_Tumba_codigo int,
fallec_fec_ingreso date,
fallec_nombre varchar (45),
fallec_fec_nacim date,
fallec_fec_muert date,
fallec_hora_muert time,
fallec_responsable varchar (20),
fallec_correo varchar (40),
fallec_tel varchar(15),
Cod_Estado int,
foreign key (Cod_Estado) references TbEstado_fallecido (Cod_Estado),
foreign key (Tbtumba_Tumba_codigo) references Tbtumba (Tumba_codigo)
);
insert into Tbfallecido values
(NULL,1,"2020/11/12","Stiven","1985/12/12","2020/11/10","3:00","Maicol","maicolt@gmail",322912,1),
(NULL,2,"2019/09/12","Felipe","1915/08/15","2019/09/10","5:00","Andres","AndresR@gmail",123466,1),
(NULL,3,"2013/03/22","Diego","1900/07/01","2013/03/20","6:00","Stiven","StivenA@gmail",111440,3);
select *from Tbfallecido;

/*Inventario*/

create table TBherramientas(
Herra_codigo int auto_increment primary key,
Empleado_Id int ,
Herra_Nombre varchar(20),
Herra_marca varchar(20),
Herra_precio int,
Herra_existencia int,
Herra_proveedor varchar(45),
foreign key(Empleado_Id) references Tbempleado (Id_Empleado)
);
insert into TBherramientas values
(NULL,3,'Martillo','Vaquero',20000,2,'Ferreteria el porvenir'),
(NULL,3,'Tractor','John Deere',160000000,1,'CasaToro S.A'),
(NULL,3,'Guadaña','Still',1200000,1,'Homecenter'),
(NULL,3,'Carretilla','Herragro',10000,1,'Homecenter'),
(NULL,3,'Pala','Herragro',15000,1,'Herragro');
select*from TBherramientas;

/*Gestion Empleados*/

create table TBcontrato(
Contr_numero int auto_increment primary key,
Id_Empleado int,
Pagoconc_tipo varchar(20),
Pagoconc_descripcion varchar(100),
Pagoconc_cantidad int,
Contr_salario int,
Contr_fec_inicio date,
Contr_fec_fin date,
Contr_tipo varchar(20),
Contr_cargo varchar(20),
foreign key(Id_Empleado) references Tbempleado (Id_Empleado)
);
insert into TBcontrato values
(NULL,3,"I","Horas extra",500000,1000000,'2020/01/01','2021/06/30','Termino fijo','Jardinero'),
(NULL,4,'I','Salario',1000000,1000000,'2020/03/01','2021/12/03','Termino Fijo','Sepulturero'),
(NULL,5,'E','EPS',90000,1500000,'2021/01/01','2021/12/30','Termino Fijo','Vigilante'),
(NULL,6,'E','EPS',90000,2000000,'2020/01/01','2021/12/31','Termino Fijo','Administrador');
select*from TBcontrato;

create table TBcertificadolaboral(
Certi_codigo int auto_increment primary key,
TBcontrato_Contr_numero int,
Certi_descripcion varchar(255),
foreign key(TBcontrato_Contr_numero) references TBcontrato (Contr_numero)
);
Insert into TBcertificadolaboral values
(NULL,1,'Terminacion de contrato'),
(NULL,2,'Renuncia');
select*from TBcertificadolaboral;

/*Actividades*/

create table TBNovedad(
Nove_codigo int auto_increment primary key,
Nove_fecha_generacion date,
Nove_descri varchar(255)
);
insert into TBNovedad values
(NULL,"2018/05/23","Limpieza de lapidas"),
(NULL,"2018/05/23","Corte del cesped"),
(NULL,"2018/05/23","sepultura de nuevo fallecido"),
(NULL,"2018/05/23","Arreglo de mausoleo"),
(NULL,"2018/05/23","Riego a los arreglos florales");
select*from TBNovedad;

create table TBActividad(
Act_codi int auto_increment primary key,
Codigo_Novedad int,
Id_Empleado int,
Act_fecha_Ini date,
Act_fecha_Fin date,
Act_estado varchar (40),
foreign key (Codigo_Novedad) references TBNovedad (Nove_codigo),
foreign key (Id_Empleado) references Tbempleado (Id_Empleado)
);
insert into TBActividad values
(NULL,1,3,'2021/01/02','2021/01/06',"Finalizado"),
(NULL,2,3,'2021/01/02',NULL,"en proceso"),
(NULL,3,3,'2021/01/02',NULL,"pendiente"),
(NULL,4,3,'2021/01/02','2021/01/06',"Finalizado");
select*from TBActividad;

/*Actividades Visitante*/

create table TBcomentariossanitarios(
comsani_codigo int primary key,
Id_Visitante int,
comsani_fecha date,
Comsani_descripcion varchar (255),
foreign key(Id_Visitante) references TBvisitante(Id_Usuario)
);
insert into TBcomentariossanitarios values
(NULL,1,"2019/07/15","Se encuentra el cesped con un olor fuerte y desagradable"),
(NULL,2,"2019/10/08","Se encuentra basura tirada en el cementerio"),
(NULL,2,"2019/07/15","Mal procesamiento de aguas negras"),
(NULL,1,"2019/07/15","Se observa escremento"),
(NULL,2,"2019/07/15","Se observa oxidacion de la lapida");
select*from TBcomentariossanitarios;

create table TbPQRS(
PQRS_codigo int auto_increment primary key,
Id_Visitante int,
PQRS_fecha date,
PQRS_descripcion varchar(255),
foreign key(Id_Visitante) references TBvisitante(Id_Usuario)
);
insert into TbPQRS values
(NULL,1,"2019/10/26","Se encuentra al hacer la visita la lapida quebrada del fallecido Stiven"),
(NULL,2,"2020/11/26","Se encuentra al hacer la visita la tumba de Amanda abierta"),
(NULL,2,"2018/10/26","Se encuentra al hacer la visita se presenta maltrato por parte del empleado Daniel"),
(NULL,1,"2021/07/24","Se encuentra al hacer la visita se obseva cambiada la lapida del fallecido Diego"),
(NULL,1,"2020/11/06","Se encuentra al hacer la visita partido el florero del fallecido Felipe");
select*from TbPQRS;


######################################################################
/*fecha para la exhumacion*/
/*
delimiter //
CREATE FUNCTION ActualizacionFecha(fecha date, codigo int)
RETURNS date
deterministic 
BEGIN
DECLARE cantidad date;
select  date_add(fecha,interval 5 year) as años INTO cantidad FROM tbfallecido where fallec_codigo=codigo;
RETURN cantidad;
END
//
select ActualizacionFecha("2015/12/25", 5);

/*actualizar y borrar novedad*/
/*
create table Audi_novedades(
Aud_Id int auto_increment primary key,
Aud_condiempeant int,
Aud_fechaant date,
Aud_descriant varchar(255),
Aud_estadoant varchar (40),
Aud_condiempenue int,
Aud_fechanue date,
Aud_descrinue varchar(255),
Aud_estadonue varchar (40),
Aud_fec_mod date,
Aud_codi int,
Aud_usu_mod varchar (20),
Aud_evento varchar(10)
);


create trigger audinovedad
before update on tbnovedad
for each row
insert into Audi_novedades
(Aud_condiempeant,Aud_fechaant,Aud_descriant,Aud_estadoant,
Aud_condiempenue,Aud_fechanue,Aud_descrinue,Aud_estadonue,
Aud_codi,Aud_fec_mod,Aud_usu_mod,Aud_evento) 
values
(old.Nove_codi_emple,old.Nove_fecha,old.Nove_descripcion,old.Nove_estado,
new.Nove_codi_emple,new.Nove_fecha,new.Nove_descripcion,new.Nove_estado,
old.Nove_codi,current_date(),current_user(),"Actualizar");

drop trigger audinovedad;

Update tbnovedad set Nove_estado='Finalizado' where Nove_codi=3;
select*from audi_novedades;

create trigger controlaborranovedad
before delete on  tbnovedad
for each row 
insert into audi_novedades
(Aud_condiempeant,Aud_fechaant,Aud_descriant,Aud_estadoant,
Aud_condiempenue,Aud_fechanue,Aud_descrinue,Aud_estadonue,
Aud_codi,Aud_fec_mod,Aud_usu_mod,Aud_evento)
values
( old.Nove_codi_emple,old.Nove_fecha,old.Nove_descripcion,old.Nove_estado,
0,0,"","",
old.Nove_codi, current_date(),current_user(),"borra");

delete from tbnovedad where Nove_codi=2;
select*from audi_novedades;

/*actualizar y borrar fallecido*/
/*
create table audi_Estado(
audId integer auto_increment primary key,
AuEstado_fec_realint date,
AuEstado_hora_realint time,
AuEstado_Tipont varchar (20),
AuEstado_fec_realinue date,
AuEstado_hora_realinue time,
AuEstado_Tiponue varchar (20),
AuEstado_codigo int,
audfecmod date,
audusumod varchar (20),
audevento varchar (10)
);

create trigger AuditaAcEstado
before update on tbestado
for each row
insert into audi_Estado
(AuEstado_fec_realint,AuEstado_hora_realint,AuEstado_Tipont,
AuEstado_fec_realinue,AuEstado_hora_realinue,AuEstado_Tiponue,
AuEstado_codigo,audfecmod,audusumod,audevento)
values
(old.Estado_fec_reali,old.Estado_hora_reali,old.Estado_Tipo,
new.Estado_fec_reali,new.Estado_hora_reali,new.Estado_Tipo,
old.Estado_codigo,current_date(), current_user(), "actualiza" );

update  tbestado set Estado_fec_reali= "2019/09/12" where Estado_Tipo = "Inhumado";
select*from audi_Estado;

create trigger AuditaBorradoEstado
before delete on tbestado
for each row
insert into audi_Estado
(AuEstado_fec_realint,AuEstado_hora_realint,AuEstado_Tipont,
AuEstado_fec_realinue,AuEstado_hora_realinue,AuEstado_Tiponue,
AuEstado_codigo,audfecmod,audusumod,audevento)
values
(old.Estado_fec_reali,old.Estado_hora_reali,old.Estado_Tipo,
0,0,"",
old.Estado_codigo,current_date(), current_user(), "Borra" );

delete from tbestado where  Estado_codigo= 2;
select*from audi_Estado;

create procedure insertarEmpleados(Emple_codigo int,Emple_tipo varchar(10),Emple_nombre varchar(45),
Emple_direccion varchar(45),Emple_telefono long,Emple_email varchar(45))
insert into  tbempleado values (Emple_codigo,Emple_tipo,Emple_nombre,Emple_direccion,Emple_telefono,Emple_email);

call insertarEmpleados (1054365,"Empleado","Tatiana","Cra 15 No 25-15",3119281881,"TatianB@gmail.com");

select * from tbempleado;

fallec_codigo int auto_increment primary key,
Tbtumba_Tumba_codigo int,
fallec_nombre varchar (45),
fallec_fec_nacim date,
fallec_fec_muert date,
fallec_hora_muert time,
fallec_responsable varchar (20),
fallec_correo varchar (40),
fallec_tel int,

create procedure insertarFallecidos(fallec_codigo int,Tbtumba_Tumba_codigo int,fallec_nombre varchar (45),fallec_fec_nacim date,
fallec_fec_muert date,fallec_hora_muert time,fallec_Responsable varchar(20),fallec_correo varchar(40),fallec_tel int)
insert into Tbfallecido values(fallec_codigo,Tbtumba_Tumba_codigo,fallec_nombre,fallec_fec_nacim,fallec_fec_muert,
fallec_hora_muert,fallec_Responsable,fallec_correo,fallec_tel);

call insertarFallecidos (6,6,"Camila","1900/07/01","2013/03/20","6:00","Esteban","EsMedina@gmail.com",3225467);
select * from Tbfallecido;

create procedure visualizarVisitantes()
select * from tbvisitante order by visit_nombre;

call visualizarVisitantes();

*/